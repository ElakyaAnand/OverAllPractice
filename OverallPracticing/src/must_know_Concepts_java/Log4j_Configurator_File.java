package must_know_Concepts_java;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j_Configurator_File {
	
	
	static Logger logger=  Logger.getLogger(Log4j_Configurator_File.class);

	public static void main(String[] args) {
		
		
		PropertyConfigurator.configure("Log4j.properties");
		logger.debug("This is the debug message");
		logger.info("This is the info error");
		logger.error("This is the code error");
		logger.warn("This is the warning error");
		logger.fatal("This is the fatal error");
		

	}

}
