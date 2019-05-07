package com.usa.nj.gov.uhip.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name="UHIPEntity")
public class UHIPApplicationEntity {
 
	@Id
	@GeneratedValue(generator = "ssn_gen")
	@SequenceGenerator(name = "ssn_gen", sequenceName = "SSN_SEQ", initialValue = 786598589, allocationSize = 1)
    @Column(name="user_id")
	private Integer userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
    
	
	@DateTimeFormat(pattern = "dd-MMM-yy")
	@Column(name = "dob")
	private Date dob;

	private String state;

	private String gender;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
    

	private String role;
	@Column(name="active_status")
	private String activeStatus;
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "updated_by")
	private String updatedBy;
	
}
