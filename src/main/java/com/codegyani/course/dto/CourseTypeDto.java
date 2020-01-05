package com.codegyani.course.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

public class CourseTypeDto {

	@NotNull
	@Enumerated(EnumType.STRING)
	private TypeName typeName;

	@NotNull
	private String description;

//Getter-Setter
	public TypeName getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeName typeName) {
		this.typeName = typeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
