package com.bombardier.macs.util.temp.forme.csv;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/**
 * The interface for CSV writers.
 * 
 * @author Kasper B. Graversen
 * @author James Bassett
 */
public interface ICsvWriter extends Closeable, Flushable {
	
	/**
	 * Gets the current position in the file. The first line of the file is line number 1.
	 * 
	 * @return the line number
	 * @since 1.0
	 */
	int getLineNumber();
	
	/**
	 * Gets the current row number (i.e. the number of CSV records - including the header - that have been written).
	 * This differs from the lineNumber, which is the number of real lines that have been written to the file. The first
	 * row is row 1 (which is typically the header row).
	 * 
	 * @return the current row number
	 * @since 2.0.0
	 */
	int getRowNumber();
	
	/**
	 * Writes a single-line comment to the CSV file (the comment must already include any special comment characters
	 * e.g. '#' at start). Please note that comments are not part of RFC4180, so this may make your CSV file less
	 * portable.
	 * 
	 * @param comment
	 *            the comment
	 * @throws NullPointerException
	 *             if comment is null
	 * @throws IOException
	 *             if an I/O error occurs
	 * @since 2.1.0
	 */
	void writeComment(String comment) throws IOException;
	
	/**
	 * Writes the header of the CSV file.
	 * 
	 * @param header
	 *            one or more header Strings
	 * @throws NullPointerException
	 *             if header is null
	 * @throws IOException
	 *             if an I/O error occurs
	 * @since 1.0
	 */
	void writeHeader(String... header) throws IOException;
	
}