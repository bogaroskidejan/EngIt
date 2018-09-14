package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="AUTHORITIES")
@NamedQuery(name="Authority.findAll", query="SELECT a FROM Authority a")
public class Authority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen1")
	@SequenceGenerator(name="my_entity_seq_gen1", sequenceName="authorities_seq")
	private long authorityid;

	private String authority;

	private String username;

	public Authority() {
	}

	public long getAuthorityid() {
		return this.authorityid;
	}

	public void setAuthorityid(long authorityid) {
		this.authorityid = authorityid;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Authority [authorityid=" + authorityid + ", authority=" + authority + ", username=" + username + "]";
	}

}