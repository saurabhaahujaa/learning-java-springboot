package oracle.tms.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TM_ROLEMASTER database table.
 * 
 */
@Entity
@Table(name="TM_ROLEMASTER")
@NamedQuery(name="RoleEO.findAll", query="SELECT r FROM RoleEO r")
public class RoleEO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String rolename;

	@Column(name="ROLE_DESC")
	private String roleDesc;

	//bi-directional many-to-one association to UserEO
	@OneToMany(mappedBy="tmRolemaster")
	private List<UserEO> tmUsermasters;

	public RoleEO() {
	}
	
	

	public RoleEO(String rolename, String roleDesc) {
		super();
		this.rolename = rolename;
		this.roleDesc = roleDesc;
	}



	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public List<UserEO> getTmUsermasters() {
		return this.tmUsermasters;
	}

	public void setTmUsermasters(List<UserEO> tmUsermasters) {
		this.tmUsermasters = tmUsermasters;
	}

	public UserEO addTmUsermaster(UserEO tmUsermaster) {
		getTmUsermasters().add(tmUsermaster);
		tmUsermaster.setTmRolemaster(this);

		return tmUsermaster;
	}

	public UserEO removeTmUsermaster(UserEO tmUsermaster) {
		getTmUsermasters().remove(tmUsermaster);
		tmUsermaster.setTmRolemaster(null);

		return tmUsermaster;
	}

	@Override
	public String toString() {
		return "RoleEO [rolename=" + rolename + ", roleDesc=" + roleDesc + ", tmUsermasters=" + tmUsermasters + "]";
	}

	
}