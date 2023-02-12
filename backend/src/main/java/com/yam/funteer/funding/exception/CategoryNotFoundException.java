package com.yam.funteer.funding.exception;

public class CategoryNotFoundException extends RuntimeException{

	public CategoryNotFoundException() {
		super("존재하지 않는 카테고리입니다.");
	}
}
