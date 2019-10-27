package implement;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logtest {

    static Logger logger=Logger.getLogger(Logtest.class);
    public static void main(String[] args) {

        // Set the logger level to Level.INFO
        logger.setLevel(Level.INFO);

        // This request will be disabled since Level.DEBUG < Level.INFO.
        logger.debug("debug");

        // These requests will be enabled.
        logger.info("info");
        logger.warn("warning");
        logger.error("error");
        logger.fatal("fatal");
    }

}