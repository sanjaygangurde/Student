package com.BikkadIT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	private String sname;
	
	private String saddrs;
	
	private String sdob;
	
	private String semail;
	
	private int sage;
	
	private String spanno;
	
	private String spasswd;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddrs() {
		return saddrs;
	}

	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
	}

	public String getSdob() {
		return sdob;
	}

	public void setSdob(String sdob) {
		this.sdob = sdob;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSpanno() {
		return spanno;
	}

	public void setSpanno(String spanno) {
		this.spanno = spanno;
	}

	public String getSpasswd() {
		return spasswd;
	}

	public void setSpasswd(String spasswd) {
		this.spasswd = spasswd;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddrs=" + saddrs + ", sdob=" + sdob + ", semail="
				+ semail + ", sage=" + sage + ", spanno=" + spanno + ", spasswd=" + spasswd + "]";
	}
	
	

}
