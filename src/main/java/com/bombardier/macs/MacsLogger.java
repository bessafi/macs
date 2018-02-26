package com.bombardier.macs;

import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author jblaplace
 *
 */

public class MacsLogger {
	private static final String NA = "NA";
	private static final String LOG_MSG 	= "MACS_APP User: {0} | Message: {1}";
	private static final String PERFO_MSG 	= "MACS_APP User: {1} | Action: {0} | Action took: {2} ms | Class: {3} | Thread: {4}";
	
	//Poor man cache..
	private static final Map<String,Logger> LOGGER_CACHE = new HashMap<String,Logger>();
	private static final int LOGGER_CACHE_MAX_ENTRIES = 300;
	
	/**
	 *@TODO
	 * This will retrieve the current user logged in once Authentication is available
	 */
	public static String getCurrentUser() {
		return NA;
	}
	
	/**
	 * This method is used to log a debug message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details
	 */
	public static void debug(Class aClass, String msg) {
		Logger logger = getLogger(aClass.getCanonicalName());
		
		//JBL: Using config as this goes both to SystemOut and trace logs and this is lower level than INFO
		//Ideally this would be set to FINE or FINEST but this would only goes to trace.log on WebSphere.. This is not ideal when developing.
		logger.log(Level.CONFIG, MessageFormat.format(LOG_MSG, getCurrentUser(), msg));
			
	}

	/**
	 * This method is used to log a debug message
	 * 
	 * @param className
	 * @param methodName
	 * @param msg
	 */
	public static void debug(Class aClass, String methodName, String msg) {		
		Logger logger = getLogger(aClass.getCanonicalName());
		StringBuffer debugMsg = new StringBuffer();
		debugMsg.append("method:").append(methodName).append(" - ").append(msg);
		//JBL: Using config as this goes both to SystemOut and trace logs and this is lower level than INFO
		//Ideally this would be set to FINE or FINEST but this would only goes to trace.log on WebSphere.. This is not ideal when developing.
		logger.log(Level.CONFIG, MessageFormat.format(LOG_MSG, getCurrentUser(), debugMsg.toString()));			
	}

	/**
	 * This method is used to log a debug message
	 * 
	 * @param className 	- name of the class generating the log. 
	 * @param msg 			- the log message details 
	 * @param e				- exception
	 */
	public static void debug(Class aClass, String msg, Throwable e) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.CONFIG, MessageFormat.format(LOG_MSG, getCurrentUser(), msg), e);
			
	}

	/**
	 * This method is used to log a debug message
	 * 
	 * @param className		- name of the class generating the log. 
	 * @param methodName	- 
	 * @param msg			- the log message details 
	 * @param e				- exception
	 */
	public static void debug(Class aClass, String methodName, String msg, Throwable e) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		StringBuffer debugMsg = new StringBuffer();
		debugMsg.append("method:").append(methodName).append(" - ").append(msg);
		//JBL: Using config as this goes both to SystemOut and trace logs and this is lower level than INFO
		//Ideally this would be set to FINE or FINEST but this would only goes to trace.log on WebSphere.. This is not ideal when developing.		
		logger.log(Level.CONFIG, MessageFormat.format(LOG_MSG, getCurrentUser(), debugMsg.toString()), e);
			
	}
	
	
	/**
	 * This method is used to log an error message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details 
	 */
	public static void error(Class aClass, String msg) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.SEVERE, MessageFormat.format(LOG_MSG, getCurrentUser(), msg));

	}
	
	/**
	 * This method is used to log an error message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details 
	 * @param e - exception
	 */
	public static void error(Class aClass, String msg, Throwable e) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.SEVERE, MessageFormat.format(LOG_MSG, getCurrentUser(), msg), e);

	}
	

	/**
	 * This method is used to log a fatal message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details 
	 */
	public static void fatal(Class aClass, String msg) {		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.SEVERE, MessageFormat.format(LOG_MSG, getCurrentUser(), msg));

	}	
	
	/**
	 * This method is used to log a fatal message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details 
	 * @param e - exception
	 */
	public static void fatal(Class aClass, String msg, Throwable e) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.SEVERE, MessageFormat.format(LOG_MSG, getCurrentUser(), msg), e);

	}

	/**
	 * This method is used to log an info message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details 
	 */
	public static void info(Class aClass, String msg) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.INFO, MessageFormat.format(LOG_MSG, getCurrentUser(), msg));

	}
	
	/**
	 * This method is used to log an info message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details 
	 * @param e - exception
	 */
	public static void info(Class aClass, String msg, Throwable e) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.INFO, MessageFormat.format(LOG_MSG, getCurrentUser(), msg), e);

	}


	/**
	 * This method is used to log a trace message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details 
	 */
	public static void trace(Class aClass, String msg) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.FINEST, MessageFormat.format(LOG_MSG, getCurrentUser(), msg));

	}
	

	/**
	 * This method is used to log a trace message
	 * 
	 * @param className - name of the class generating the log. 
	 * @param msg - the log message details  
	 * @param e - exception
	 */
	public static void trace(Class aClass, String msg, Throwable e) {
		
		Logger logger = getLogger(aClass.getCanonicalName());
		logger.log(Level.FINEST, MessageFormat.format(LOG_MSG, getCurrentUser(), msg), e);

	}
	
	
	/**
	 * Utility method to create an instance of PerformanceStart
	 * @param aClass
	 * @param message
	 * @return
	 */
	public static PerformanceStart getPerformanceStart(Class<?> aClass, String message) {
		PerformanceStart pStart = new PerformanceStart();
		pStart.setStartTime(new Date());
		pStart.setThreadId(Thread.currentThread().getId());
		pStart.setUser(getCurrentUser());
		pStart.setMsg(message);
		
		String className = "";
		
		if (aClass != null) {
			className = aClass.getName();
		}
		
		pStart.setClassName(className);
			
		return pStart;
	}
	
	public static void performanceEnd(PerformanceStart start) {
		long delta = (new Date()).getTime() - start.getStartTime().getTime();
		
		Logger logger = getLogger(start.getClassName());
		logger.log(Level.INFO, MessageFormat.format(PERFO_MSG, start.getMsg(), start.getUser(), delta, start.getClassName(), Thread.currentThread().getId()));
	}
	
	private static Logger getLogger(String className) {
		Logger logger = LOGGER_CACHE.get(className);
		
		if (logger == null) {
			logger = Logger.getLogger(className);
			LOGGER_CACHE.put(className, logger);
			
			if (LOGGER_CACHE.size() > LOGGER_CACHE_MAX_ENTRIES) {
					//<Randomly remove an entry. .. again this is a poorman's cache>
					Set<String> keys = LOGGER_CACHE.keySet();
					LOGGER_CACHE.remove(keys.iterator().next());
			}			
		}
		
		return logger;
	}
}
