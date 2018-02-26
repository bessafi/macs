package com.bombardier.macs.util.temp.forme.csv;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

class ResultSetMetaDataMock implements ResultSetMetaData {
	
	private String[] headers;
	
	public ResultSetMetaDataMock(final String[] headers) {
		this.headers = headers;
	}

	public int getColumnCount() throws SQLException {
		return headers.length;
	}
	
	public String getColumnName(final int column) throws SQLException {
		return headers[column - 1];
	}
	
	/*
	 *  ------------------------------------------------------------------------
	 *   Unsupported methods follow.
	 *   Methods below this line shall only throw UnsupportedOperationException.
	 *  ------------------------------------------------------------------------
	 */

	public <T> T unwrap(Class<T> iface) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isAutoIncrement(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isCaseSensitive(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isSearchable(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isCurrency(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public int isNullable(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isSigned(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public int getColumnDisplaySize(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public String getColumnLabel(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public String getSchemaName(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public int getPrecision(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public int getScale(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public String getTableName(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public String getCatalogName(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public int getColumnType(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public String getColumnTypeName(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isReadOnly(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isWritable(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public boolean isDefinitelyWritable(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	public String getColumnClassName(int column) throws SQLException {
		throw new UnsupportedOperationException();
	}
	
}