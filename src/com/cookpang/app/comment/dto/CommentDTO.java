package com.cookpang.app.comment.dto;

import java.time.LocalDateTime;

public class CommentDTO {
    private int commentNumber;
    private String commentContent;
    private int userNumber;
    private int postNumber;
    private LocalDateTime commentTime;
    
    public CommentDTO() {}

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

	@Override
	public String toString() {
		return "CommentDTO [commentNumber=" + commentNumber + ", commentContent=" + commentContent + ", userNumber="
				+ userNumber + ", postNumber=" + postNumber + ", commentTime=" + commentTime + "]";
	}

   
}

