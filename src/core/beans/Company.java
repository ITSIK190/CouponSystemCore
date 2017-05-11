package core.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * company bean
 * @author Itsik
 *
 */
@XmlRootElement
public class Company {

	private long id;
	private String name;
	private String password;
	private String email;

	public Company() {
	}
	
	/**
	 * Company bean, ID is generated by the DB, Treat Email as user name!!!
	 * @param name
	 * @param password
	 * @param email
	 */

	public Company(String name, String password, String email) {
		
		this.name = name;
		this.password = password;
		this.email = email;
	}


	/**
	 * get company ID - {@link Long}
	 * @return company ID
	 */
	public long getId() {
		return id;
	}

	/**
	 * set company ID
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * get company name
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * set company name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get company password
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * set company password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * get company email AKA user name
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * set company email AKA user name
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * to string
	 */
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}

}