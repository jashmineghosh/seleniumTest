package basiclog4jEx;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logex {
	private static Logger log = LogManager.getLogger(Logex.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("resources/log4j2.xml");
log.debug("i am debugging");
log.error("this is error");
log.info("successfull validation");
log.fatal("this is fatal");
	}

}
