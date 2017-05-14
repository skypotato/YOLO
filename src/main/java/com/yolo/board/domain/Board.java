package com.yolo.board.domain;

import java.util.Date;
import java.util.List;

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
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import com.yolo.category.domain.Category;
import com.yolo.comment.domain.Comment;
import com.yolo.user.domain.User;

@Entity(name = "board")
public class Board {

	@Id
	@Column(name = "BOARD_NO")
	@TableGenerator(name = "GEN_BOARD_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_BOARD_NO", strategy = GenerationType.TABLE)
	private Integer boardNo;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "RECOMMEND")
	private Integer recommend;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private BoardStatus status;
	
	@Column(name = "REG_DATE")
	private Date regDate;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_NO", referencedColumnName = "USER_NO")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_NO", referencedColumnName = "CATEGORY_NO")
	private Category category;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "BOARD_NO", referencedColumnName = "BOARD_NO")
	private List<Comment> comment;

	public Integer getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(Integer boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public BoardStatus getStatus() {
		return status;
	}

	public void setStatus(BoardStatus status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", recommend=" + recommend
				+ ", status=" + status + ", regDate=" + regDate + "]";
	}
	
	
	
}
