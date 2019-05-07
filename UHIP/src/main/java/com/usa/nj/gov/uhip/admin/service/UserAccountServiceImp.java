package com.usa.nj.gov.uhip.admin.service;

import org.apache.catalina.authenticator.SavedRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.usa.nj.gov.uhip.admin.entity.UHIPApplicationEntity;
import com.usa.nj.gov.uhip.admin.exception.UserAccountException;
import com.usa.nj.gov.uhip.admin.model.UHIPApplicationModel;
import com.usa.nj.gov.uhip.admin.repository.UHIPAccountRepository;

public class UserAccountServiceImp {
	@Autowired
	UHIPAccountRepository UARepository;

	public boolean createAccount(UHIPApplicationModel UHIPModel) {
		Boolean isSaved;
		Logger logger = LoggerFactory.getLogger(UserAccountServiceImp.class);

		try {
			UHIPApplicationEntity UHIPEntity = new UHIPApplicationEntity();
			BeanUtils.copyProperties(UHIPModel, UHIPEntity);
			UHIPEntity = UARepository.save(UHIPEntity);
			if (UHIPEntity.getUserId() > 0) {
				isSaved = true;
			} else {
				isSaved = false;
			}
		} catch (UserAccountException e) {
			logger.error("user creation fail:");
			throw new UserAccountException("Internal account creation problem");
		}
		return isSaved;

	}
}
