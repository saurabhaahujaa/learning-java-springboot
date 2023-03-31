package oracle.tms.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TM_USERMASTER database table.
 * 
 */
@Entity
@Table(name="TM_USERMASTER")
@NamedQuery(name="UserEO.findAll", query="SELECT u FROM UserEO u")
public class UserEO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	private String password;

	//bi-directional many-to-one association to RoleEO
	@ManyToOne(cascade={CascadeType.REMOVE})
	@JoinColumn(name="ROLENAME")
	private RoleEO tmRolemaster;

	public UserEO() {
	}
	
	
	public UserEO(String username, String password, RoleEO tmRolemaster) {
		super();
		this.username = username;
		this.password = password;
		this.tmRolemaster = tmRolemaster;
	}


	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleEO getTmRolemaster() {
		return this.tmRolemaster;
	}

	public void setTmRolemaster(RoleEO tmRolemaster) {
		this.tmRolemaster = tmRolemaster;
	}

	@Override
	public String toString() {
		return "UserEO [username=" + username + ", password=" + password + "]";
	}

	
}