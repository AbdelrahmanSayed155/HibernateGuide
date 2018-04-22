/**
 * 
 */
package com.abdelrahman.OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 11, 2018
 */
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int passportId;
	private String nationality;
	/**
	 * @return the passportId
	 */
	public int getPassportId() {
		return passportId;
	}
	/**
	 * @param passportId the passportId to set
	 */
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
