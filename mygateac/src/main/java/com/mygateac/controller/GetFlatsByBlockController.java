package com.mygateac.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mygateac.dto.FlatOwnerDto;
import com.mygateac.service.BlockService;

public class GetFlatsByBlockController extends AbstractController {
	private BlockService blockService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int blockNo = 0;
		ModelAndView mav = null;
		List<FlatOwnerDto> flatOwners = null;

		blockNo = Integer.parseInt(request.getParameter("block"));
		flatOwners = blockService.getFlatsAndOwnerByBlockNo(blockNo);
		mav = new ModelAndView();
		mav.addObject("flatOwners", flatOwners);
		mav.setViewName("flats_owner");

		return mav;
	}

	public void setBlockService(BlockService blockService) {
		this.blockService = blockService;
	}

}
