/**
 * 
 */
package com.abdelrahman.testCon;

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
public class PrimaryKeyStudy {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO) // select randoum 
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = GenerationType.TABLE)
	private long  id; 
	

}
