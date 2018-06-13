package com.asyncemail.asyncemail.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  The RequestContext facilitates the storage of information for the duration of
 *  a single request (or web service transaction).
 *
 *  RequestContext attributes are stored in ThreadLocal objects.
 *
 *  @author b.agirdan
 *
 */
public class RequestContext {

    /**
     * The logger for this class
     */
    private static Logger logger= LoggerFactory.getLogger(RequestContext.class);

    /**
     * ThreadLocal storage of username Strings. This gives us the ability to store data individually
     * for the current thread.
     */
    private static ThreadLocal<String> usernames= new ThreadLocal<String>();

    public RequestContext() {
    }

    /**
     * Get the username for the current thread.
     *
     * @return A string username
     */
    public static String getUsername(){
        return usernames.get();
    }


    /**
     * Set username for the current thread.
     *
     * @param username A String username.
     */
    public static void setUsername(String username){
        usernames.set(username);
        logger.debug("RequestContext added username {} to current thread", username);
    }

    public static void init(){
        usernames.set(null);
    }


}
