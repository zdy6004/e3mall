package com.e3mall.front.client;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.jersey.core.header.MediaTypes;

@FeignClient(value = "e3mall-item-service")
public interface ItemServiceClient {

	
	@RequestMapping(value = "/front/item/{itemId}", method = RequestMethod.GET,consumes = MediaTypes.WADL_JSON_STRING)
	Map<String, Object> findItemByPid(@PathVariable("itemId") long itemId);
//	@RequestMapping(value = "/front/item/{itemId}", method = RequestMethod.GET,consumes = MediaTypes.WADL_JSON_STRING)
//	TbItemDesc findItemDescByPid(@PathVariable("itemId") long itemId);
}
