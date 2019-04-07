package au.com.westpac.wdp.common.loggerservice;

import java.util.logging.Logger;

import java.util.logging.Level;

public class LoggerService {
	private static final Logger logger = Logger.getLogger(LoggerService.class.getName() );
	
	public static void logStart(String className,String methodName,String corelationId) {
		logger.logp(Level.INFO,className,methodName,() -> String.format("%s START - Corelation Id : %s",methodName,corelationId));
	}
	
	public static void logStart(String className,String methodName,String corelationId,String message,Object ...args) {
		logger.logp(Level.INFO,className,methodName, String.format("%s START - Corelation Id : %s , %s",methodName,corelationId,message),args);
	}
	
	public static void logEnd(String className,String methodName,String corelationId) {
		logger.logp(Level.INFO,className,methodName,() -> String.format("%s END - Corelation Id : %s",methodName,corelationId));
	}
	
	public static void logEnd(String className,String methodName,String corelationId,String message,Object ...args) {
		logger.logp(Level.INFO,className,methodName, String.format("%s END - Corelation Id : %s , %s",methodName,corelationId,message),args);
	}
	
	public static void logException(String className,String methodName,String corelationId,Throwable exception) {
		logger.logp(Level.SEVERE,className,methodName, exception , () -> String.format("%s Exception - Corelation Id : %s, Exception occurred : %s",methodName,exception.getMessage()));
	}
	
	public static void logInfo(String className,String methodName,String corelationId,String message,Object ...args) {
		logger.logp(Level.INFO,className,methodName, String.format("%s INFO - Corelation Id : %s , %s",methodName,corelationId,message),args);
	}
}
