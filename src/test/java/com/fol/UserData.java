package com.fol;

public class UserData 

{
private String first_name;
private String last_name;
private String phone;
private String email;
private String username;
private String password;
private String confirm_pwd;
public UserData(String first_name, String last_name, String phone, String email, String username, String password, String confirm_pwd)
{
this.first_name=first_name;
this.last_name=last_name;
this.phone=phone;
this.email=email;
this.username=username;
this.password=password;
this.confirm_pwd=confirm_pwd;
}

public String getFirstName() { return first_name; }
public String getLastName() { return last_name; }
public String getPhone() { return phone; }
public String getEMail() { return email; }
public String getUserName() { return username; }
public String getPassword() { return password; }
public String getConfirmPassword() { return confirm_pwd; }

}

