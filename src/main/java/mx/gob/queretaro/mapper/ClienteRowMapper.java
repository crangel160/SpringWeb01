package mx.gob.queretaro.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.gob.queretaro.bean.ClienteBean;

public class ClienteRowMapper implements RowMapper<ClienteBean>{

	@Override
	public ClienteBean mapRow(ResultSet rs, int rowNum) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}


}
