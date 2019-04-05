package com.mygateac.service;

import java.util.ArrayList;
import java.util.List;

import com.mygateac.bo.FlatOwnerBo;
import com.mygateac.dao.BlockDao;
import com.mygateac.dto.FlatOwnerDto;

public class BlockService {
	private BlockDao blockDao;

	public List<FlatOwnerDto> getFlatsAndOwnerByBlockNo(int blockNo) {
		List<FlatOwnerBo> flatOwnerBos = null;
		List<FlatOwnerDto> flatOwnerDtos = null;

		flatOwnerBos = blockDao.getFlatsAndOwnerByBlock(blockNo);
		flatOwnerDtos = new ArrayList<>();

		for (FlatOwnerBo bo : flatOwnerBos) {
			flatOwnerDtos.add(new FlatOwnerDto(bo.getFlat().getFlatNo(), bo.getFlat().getFlatType(),
					bo.getFlat().getFacing(), bo.getFlat().getFloor(),
					bo.getOwner().getFirstName().concat(",").concat(bo.getOwner().getLastName()),
					bo.getOwner().getMobileNo(), bo.getOwner().getEmailAddress()));
		}
		return flatOwnerDtos;
	}

	public void setBlockDao(BlockDao blockDao) {
		this.blockDao = blockDao;
	}

}
