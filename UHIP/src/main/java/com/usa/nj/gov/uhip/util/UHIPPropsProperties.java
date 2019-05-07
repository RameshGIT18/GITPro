package com.usa.nj.gov.uhip.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="uhip1")
@Data
public class UHIPPropsProperties {

private	Map <String,String> uhipProps= new HashMap<String,String>();
	
}
