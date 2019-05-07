package com.usa.nj.gov.uhip.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usa.nj.gov.uhip.admin.entity.UHIPApplicationEntity;

@Repository
public interface UHIPAccountRepository extends JpaRepository<UHIPApplicationEntity,Serializable >{
 
}
