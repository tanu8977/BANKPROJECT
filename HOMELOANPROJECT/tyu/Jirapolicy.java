package tyu;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
public @interface Jirapolicy {
	
	boolean logTicketReady();
	
	

}
