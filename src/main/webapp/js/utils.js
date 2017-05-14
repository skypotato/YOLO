var Base64 = {
	keyStr: "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",
	
	encode: function(input) {
		var output = "";
		var chr1, chr2, chr3;
		var enc1, enc2, enc3, enc4;
		var i = 0;
		
		do {
			chr1 = input.charCodeAt(i++);
			chr2 = input.charCodeAt(i++);
			chr3 = input.charCodeAt(i++);
			
			enc1 = chr1 >> 2;
			enc2 = ((chr1 & 3) << 4) | (chr2 >> 4);
			enc3 = ((chr2 & 15) << 2) | (chr3 >> 6);
			enc4 = chr3 & 63;
			
			if (isNaN(chr2)) {
				enc3 = enc4 = 64;
			} else if (isNaN(chr3)) {
				enc4 = 64;
			}
			
			output = output 
					+ this.keyStr.charAt(enc1)
					+ this.keyStr.charAt(enc2)
					+ this.keyStr.charAt(enc3)
					+ this.keyStr.charAt(enc4);
		} while (i < input.length);

		return output;
	},
	
	decode: function(input) {
		var output = "";
		var chr1, chr2, chr3;
		var enc1, enc2, enc3, enc4;
		var i = 0;
		
		// remove all characters that are not A-Z, a-z, 0-9, +, /, or =
		input = input.replace(/[^A-Za-z0-9\+\/\=]/g, "");
		
		do {
			enc1 = this.keyStr.indexOf(input.charAt(i++));
			enc2 = this.keyStr.indexOf(input.charAt(i++));
			enc3 = this.keyStr.indexOf(input.charAt(i++));
			enc4 = this.keyStr.indexOf(input.charAt(i++));
			
			chr1 = (enc1 << 2) | (enc2 >> 4);
			chr2 = ((enc2 & 15) << 4) | (enc3 >> 2);
			chr3 = ((enc3 & 3) << 6) | enc4;
			
			output = output + String.fromCharCode(chr1);
			
			if (enc3 != 64) {
				output = output + String.fromCharCode(chr2);
			}
			if (enc4 != 64) {
				output = output + String.fromCharCode(chr3);
			}
		} while (i < input.length);
		
		return output;
	},
	
	encode64Han: function(str) {
		return this.encode(escape(str));
	},
	
	decode64Han: function(str) {
		return unescape(this.decode64(str));
	}
};


function readFile(fileElementId, $viewer) {
	var file = document.getElementById(fileElementId).files[0];

	var reader = new FileReader();

	reader.onload = function() {
		var base64Str = Base64.encode(reader.result);
		$viewer.attr("src", "data:image/jpeg;base64," + base64Str);
		$viewer.data("base64", base64Str);
	};

	reader.onerror = function(event) {
		alert(event.target.error.code);
	};

	reader.readAsBinaryString(file);
};

function openPopup(url, w, h) {
	var x = (screen.availWidth - w) / 2;
	var y = (screen.availHeight - h) / 2;
	window.name = "new_window";
	window.open(url, 'popup', 'width=' + w + ', height=' + h + ', top=' + y + ', left=' + x + ', fullscreen=no, menubar=no, status=no, toolbar=no, titlebar=yes, location=no, scrollbars=yes');
}

//3자리 수 콤마.
function comma(str) {
	if(!$.isNumeric(str))
		return 0;
	else {
		str = String(str);
		return str.replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,');
	}
}

// 콤마제거.
function uncomma(str) {
	str = String(str);
	return str.replace(/[^\d]+/g, '');
}

/**
 * 해당 col의 중복된 데이터를 rowspan 처리.
 */
//jQuery.fn.jqgridRowspan = function(colIndexs) {
//
//	var model = [];
//
//	// 각 column의 ID를 수집.
//	$.each(this.getGridParam("colModel"), function(idx, value) {
//		model.push(value.name);
//	});
//	
//	var data = this.getCol(model[colIndexs]);
//	var rowspanData = {};
//	var current;
//	var currentIDX = 0;
//	
//	$.each(data, function(idx, value) {
//		if (current != value) {
//			currentIDX = idx;
//			rowspanData[currentIDX] = 1;
//		} else
//			rowspanData[currentIDX]++;
//		current = value;
//	});
//
//	$('tbody tr', this).each(function(row, rowObject) {
//		var tmpIDx = 0;
//		$('td', this).each(function(col, colObject) {
//			if (col == colIndexs && row > 0) {// 0번째 row는 숨겨진 row. 이것 때문에 width가 깨지는 현상 발생
//				if (rowspanData[row - 1])
//					tmpIDx = rowspanData[row - 1];
//				else
//					tmpIDx = 0;
//				if (tmpIDx > 0) {
//					$(colObject).attr("rowspan", tmpIDx);
//				} else {
//					$(colObject).hide();
//				}
//
//			}
//		});
//	});
//};