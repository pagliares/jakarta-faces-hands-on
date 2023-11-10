package xyz.pagliares.jakartaee.hellocrueljsfworld.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloManagedBean {
    private String message = "Hello JSF Managed Bean World!";

    public HelloManagedBean() {
        System.out.println("JSF Managed bean started");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
