/**
 * 
 */
package com.abdelrahman.collection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Abdelrahman Sayed
 *
 *         Apr 11, 2018
 */
@Entity
public class Glass {
	@Id
	private int id;
	private String name;
	// @ElementCollection
	private Set<Certificate> li = new HashSet<Certificate>();

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the li
	 */
	public Set<Certificate> getLi() {
		return li;
	}

	/**
	 * @param li
	 *            the li to set
	 */
	public void setLi(Set<Certificate> li) {
		this.li = li;
	}

}
