package com.yolo.bucket.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.yolo.board.domain.Board;
import com.yolo.user.domain.User;

@Entity(name = "bucket_item")
public class Bucket {

	@Id
	@Column(name = "BUCKET_ID")
	private Integer bucketId;
	
	@Column(name = "ORDER")
	private Integer order;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "GOAL_DATE")
	private Date goalDate;
	
	@Column(name = "REG_DATE")
	private Date regDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private BucketStatus status;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USER_NO", referencedColumnName = "USER_NO")
	private User user;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BOARD_NO", referencedColumnName = "BOARD_NO")
	private Board board;
}
