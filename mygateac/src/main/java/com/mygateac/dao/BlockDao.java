package com.mygateac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mygateac.bo.FlatBo;
import com.mygateac.bo.FlatOwnerBo;
import com.mygateac.bo.OwnerBo;

public class BlockDao {
	private final String SQL_GET_FLATS_AND_OWNER = "select f.*, o.* from flat f inner join owner o on f.owner_no = o.owner_no where f.block_no = ?";
	private JdbcTemplate jdbcTemplate;

	public BlockDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<FlatOwnerBo> getFlatsAndOwnerByBlock(int blockNo) {
		return jdbcTemplate.query(SQL_GET_FLATS_AND_OWNER, new RowMapper<FlatOwnerBo>() {

			@Override
			public FlatOwnerBo mapRow(ResultSet rs, int rowNum) throws SQLException {
				FlatBo flatBo = null;
				OwnerBo ownerBo = null;
				FlatOwnerBo flatOwnerBo = null;

				flatBo = new FlatBo(rs.getInt("f.flat_no"), rs.getString("f.flat_type"), rs.getInt("f.floor"),
						rs.getString("f.facing"), rs.getInt("f.sq_ft"), rs.getInt("f.owner_no"),
						rs.getInt("f.block_no"));
				ownerBo = new OwnerBo(rs.getInt("o.owner_no"), rs.getString("o.first_nm"), rs.getString("o.last_nm"),
						rs.getDate("o.dob"), rs.getString("o.gender"), rs.getString("o.mobile_nbr"),
						rs.getString("o.email_address"));
				flatOwnerBo = new FlatOwnerBo();
				flatOwnerBo.setFlat(flatBo);
				flatOwnerBo.setOwner(ownerBo);
				
				
	
				return flatOwnerBo;
			}

		}, new Object[] { blockNo });

	}

	/*public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\work\\archives\\spring\\20180816\\Mvc\\mygateac\\src\\main\\webapp\\WEB-INF\\config\\persistence-beans.xml");
		BlockDao blockDao = context.getBean("blockDao", BlockDao.class);
		blockDao.getFlatsAndOwnerByBlock(1);
	}*/
}
















