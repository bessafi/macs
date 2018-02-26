package com.bombardier.macs.util.temp.forme.csv;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.exception.SuperCsvConstraintViolationException;
import org.supercsv.exception.SuperCsvException;

/**
 * Interface for CSV writers writing JDBC {@code ResultSet}
 * 
 * @author SingularityFX
 * @since 2.4.0
 */
public interface ICsvResultSetWriter extends ICsvWriter {
	
	/**
	 * Writes a JDBC {@code ResultSet} as a CSV file. Each column in CSV file corresponds to a column in
	 * {@code ResultSet}, column order is preserved. Column names in CSV file corresponds to column names stored in
	 * {@code ResultSetMetaData}. {@code toString} will be called on each element prior to writing.
	 * 
	 * @param resultSet
	 *            ResultSet containing the values to write
	 * @throws SQLException
	 *             if a database access error occurs or this method is called on a closed result set
	 * @throws IOException
	 *             if an I/O error occurred
	 * @throws NullPointerException
	 *             if resultSet is null
	 * @throws SuperCsvException
	 *             if there was a general exception while writing
	 * @since 2.4.0
	 */
	void write(ResultSet resultSet) throws SQLException, IOException;
	
	/**
	 * Writes a JDBC {@code ResultSet} as a CSV file. Each column in CSV file corresponds to a column in
	 * {@code ResultSet}, column order is preserved. Column names in CSV file corresponds to column names stored in
	 * {@code ResultSetMetaData}. {@code toString} will be called on each (processed) element prior to writing.
	 * 
	 * @param resultSet
	 *            ResultSet containing the values to write
	 * @param cellProcessors
	 *            Array of CellProcessors used to further process data before it is written (each element in the
	 *            processors array corresponds with a CSV column - the number of processors should match the number of
	 *            columns). A {@code null} entry indicates no further processing is required (the value returned by
	 *            toString() will be written as the column value).
	 * @throws SQLException
	 *             if a database access error occurs or this method is called on a closed result set
	 * @throws IOException
	 *             if an I/O error occurred
	 * @throws NullPointerException
	 *             if resultSet or cellProcessors is null
	 * @throws SuperCsvConstraintViolationException
	 *             if a CellProcessor constraint failed
	 * @throws SuperCsvException
	 *             if there was a general exception while writing/processing
	 * @since 2.4.0
	 */
	void write(ResultSet resultSet, CellProcessor[] cellProcessors) throws SQLException, IOException;
}