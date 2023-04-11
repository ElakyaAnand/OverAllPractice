package must_know_Concepts_java;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configurator_File {

						
static	Logger logger= Logger.getLogger(Basic_Configurator_File.class);
	
	public static void main(String[] args) {

		
		BasicConfigurator.configure();
		logger.debug("This is the debug message");
		logger.info("This is the info error");
		logger.error("This is the code error");
		logger.warn("This is the warning error");
		logger.fatal("This is the fatal error");

	}

}
