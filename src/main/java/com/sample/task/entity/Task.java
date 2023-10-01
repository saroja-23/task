package com.sample.task.entity;

import java.util.Date;

public class Task {
	
	private long id;
	private String title;
    private String description;
    private boolean completed;
    private Date createDate;
    private Date completionDate;
    
	public Task() {
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
}
