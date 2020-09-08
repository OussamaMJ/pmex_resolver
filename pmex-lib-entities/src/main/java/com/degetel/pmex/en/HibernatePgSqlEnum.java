package com.degetel.pmex.en;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.EnumType;

public class HibernatePgSqlEnum extends EnumType<Enum<?>>
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6816054228494333672L;

	@Override
	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException
	{
		st.setObject(index, value != null ? ((Enum<?>) value).name() : null, Types.OTHER);
	}
}
