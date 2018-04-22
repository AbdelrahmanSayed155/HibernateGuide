/**
 * 
 */
package com.abdelrahman.embedded;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Abdelrahman Sayed
 *
 * Apr 11, 2018
 */
@Entity
public class Employee {
	
	@Id
	private int id;

	private String name;
	@Embedded
	private Address address1;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name="codeNumber",column=@Column(name="flol")),
		@AttributeOverride( name="streetName",column=@Column(name="fl"))
		})
	private Address address2;
	
	
}
