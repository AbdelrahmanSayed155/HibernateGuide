/**
 * 
 */
package com.abdelrahman.collection;

import javax.persistence.Embeddable;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 11, 2018
 */
@Embeddable
public class Certificate {

	private String name;
	private String rate;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rate
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	
}
