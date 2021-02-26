package project;

public class User {
private String email;
private String password;
private String username;
private String first_name;
private String last_name;

/**
 * these are your private classes
 * @param email
 * @param password
 * @param username
 * @param first_name
 * @param last_name
 * @return
 */
	public String username(String first_name, String last_name){
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		return this.email = email;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public int userpass(int password)
	{
		return password;
	}
	/**
	 * 
	 * @param string
	 * @return
	 */

	public int userpass(String string) {		
		return 0;
	}	
} 