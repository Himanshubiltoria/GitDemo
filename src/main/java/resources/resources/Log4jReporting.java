package resources;

import org.apache.log4j.*;

public class Log4jReporting {
	
	private static Logger log = LogManager.getLogger(Log4jReporting.class.getName());
	public static void main(String[] arg) {
		
		log.debug("I am dedugging");
		log.info("object is present");
		log.error("object is not present");
		
	}

}
