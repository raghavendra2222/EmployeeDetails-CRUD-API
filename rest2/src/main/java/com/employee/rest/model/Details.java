package com.employee.rest.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	private String efname;
	private String elname;
	public String getEfname() {
		return efname;
	}
	public void setEfname(String efname) {
		this.efname = efname;
	}
	public String getElname() {
		return elname;
	}
	public void setElname(String elname) {
		this.elname = elname;
	}
	@Override
	public String toString() {
		return "Details [eid=" + eid + ", efname=" + efname + ", elname=" + elname + "]";
	}
	
}
