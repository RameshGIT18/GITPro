package com.usa.nj.gov.uhip.admin.model;

import java.util.Date;

import lombok.Data;

@Data
public class UHIPApplicationModel {

		private Integer userId;
		private String firstName;
		private String lastName;
		private Date dob;
		private String state;
		private String gender;
		private Date createdDate;
		private String role;
		private String activeStatus;
		private Date updatedDate;
		private String createdBy;
		private String updatedBy;
		
}
