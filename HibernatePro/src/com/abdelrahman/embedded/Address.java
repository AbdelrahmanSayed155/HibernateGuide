/**
 * 
 */
package com.abdelrahman.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Abdelrahman Sayed
 *
 *         Apr 11, 2018
 */
@Embeddable
public class Address {

	@Column(name = "STREET_CODE")
	private String codeNumber;
	@Column(name = "STREET_NAME")
	private String streetName;

	/**
	 * @return the codeNumber
	 */
	public String getCodeNumber() {
		return codeNumber;
	}

	/**
	 * @param codeNumber
	 *            the codeNumber to set
	 */
	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName
	 *            the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

}
