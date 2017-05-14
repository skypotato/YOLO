package com.yolo.comment.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

import com.yolo.board.domain.Board;
import com.yolo.user.domain.User;

@Entity(name = "comment")
public class Comment {

	@Id
	@Column(name = "COMMENT_NO")
	@TableGenerator(name = "GEN_COMMENT_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_COMMENT_NO", strategy = GenerationType.TABLE)
	private Integer commentNo;
	
	@Column(name = "COMMENT")
	private String comment;
	
	@Column(name = "RECOMMEND")
	private Integer recommend;
	
	@Column(name = "UNRECOMMEND")
	private Integer unrecommend;
	
	@Column(name = "REG_DATE")
	private Date regDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_NO", referencedColumnName = "USER_NO")
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BOARD_NO", referencedColumnName = "BOARD_NO")
	private Board board;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private CommentStatus status;
	
	
	
}
