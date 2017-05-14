package com.yolo.category.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity(name = "category")
public class Category {

	@Id
	@Column(name = "CATEGORY_NO")
	@TableGenerator(name = "GEN_CATEGORY_NO", allocationSize = 1)
	@GeneratedValue(generator = "GEN_CATEGORY_NO", strategy = GenerationType.TABLE)
	private Integer categoryNo;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "DEPTH")
	private Integer depth;
	
	@Column(name = "PARENT_ID")
	private Integer parentId;

	public Integer getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "Category [categoryNo=" + categoryNo + ", name=" + name + ", description=" + description + ", depth="
				+ depth + ", parentId=" + parentId + "]";
	}
	
	
}
