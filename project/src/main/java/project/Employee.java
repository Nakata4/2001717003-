package project;

import lombok.Getter;


import java.util.Date;

/**
 * Employee entity
 */
public class Employee {

    /**
     * Unique id, autoincrement
     */
    private int id;

    /**
     * Employee first name
     */
    private String firstName;

    /**
     * Employee last name
     */
    private String lastName;

    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
