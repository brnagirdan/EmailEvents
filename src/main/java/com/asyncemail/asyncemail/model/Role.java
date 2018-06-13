package com.asyncemail.asyncemail.model;


import javax.persistence.Entity;

/**
 * The role class is an entity model object. A role describes a privilege level
 * within the application. A role is used to authorize an Account to access a
 * set of application resources.
 *
 * @author b.agirdan
 */
@Entity
public class Role extends ReferenceEntity{

    private static final long serialVersionUID=1L;

    public Role() {
    }
}
