package com.asyncemail.asyncemail.model;

import javax.persistence.Entity;

/**
 * The Greeting class is an entity model object
 * @author b.agirdan
 */
@Entity
public class Greeting extends TransactionalEntity{
    private static final long serialVersionUID=1L;

    private String text;

    public Greeting() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
