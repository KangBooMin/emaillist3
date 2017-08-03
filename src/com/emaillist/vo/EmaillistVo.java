package com.emaillist.vo;

public class EmaillistVo {

	private int no;
	private String lastname;
	private String firstname;
	private String email;

	public EmaillistVo() {}

	public EmaillistVo(int no, String lastname, String firstname, String email) {
		this.no = no;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
	}

	public EmaillistVo(String lastname, String firstname, String email) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmaillistVo [no=" + no + ", lastname=" + lastname + ", firstname=" + firstname + ", email=" + email
				+ "]";
	}

}
