package com.creatrix.todo.TODO.List.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity // This tells Hibernate to make a table out of this class
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	@NotBlank(message = "Title cannot be empty or Null")
	private String title;

	private String text;

	private Date createdDate;

	private Date dueDate;

	private String completionStatus;

	// Getter and Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getIsDone() {
		return completionStatus;
	}

	public void setIsDone(String isDone) {
		this.completionStatus = isDone;
	}

	// hashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((completionStatus == null) ? 0 : completionStatus.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (completionStatus == null) {
			if (other.completionStatus != null)
				return false;
		} else if (!completionStatus.equals(other.completionStatus))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Task [title=");
		builder.append(title);
		builder.append(", text=");
		builder.append(text);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", dueDate=");
		builder.append(dueDate);
		builder.append(", isDone=");
		builder.append(completionStatus);
		builder.append("]");

		return builder.toString();
	}
}