package com.sammi.Linking;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: sammi
 * Date: 6/5/14
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyCustomerClass implements Serializable {
    private static final long serialVersionUID = 1L;
    String _name;
    String _email;

    public void setName(String name) {
        _name = name;
    }

    public String Name() {
        return _name;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String Email() {
        return _email;
    }

}
