/**
 * 
 */
package com.abdelrahman.testCon;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 10, 2018
 */
@Entity

///@Entity by defualt name of class can override that by
// @Entity(name="") this using in query 
///@Table(name="USER_DB") this name oc this class into DB 
public class UserDetails {
	@Id
	@Column(name="USER_ID")
	@GeneratedValue
	private int id;
   //  @Basic this using for using some opration in variable 
	/// as fetching 
	// as be null or no 
	//@Basic( optional = true or false; fetch = FetchType.EAGER or  FetchType.LAZY , )
	private String name;

	private Date joinDate;
	private String address;
	@Transient
	// @Transient using for tell hibernate to ignore this propertity 
	// dont use in mapping or queries 
	@Lob
	private String description;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		return joinDate;
	}
	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	/// hibernate get value from getter
	// so if you want to make operation to the value can implement that in getter 
	// but geeter must annotated  @Column
	@Column(name="NAME")
	public String getName() {
		if(name.length() > 20)
			return name.substring(0, 19);
		return name +"good";
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
