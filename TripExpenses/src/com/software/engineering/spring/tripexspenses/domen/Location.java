package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the LOCATIONS database table.
 * 
 */
@Entity
@Table(name="LOCATIONS")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen4")
	@SequenceGenerator(name="my_entity_seq_gen4", sequenceName="locations_seq")
	private long locid;

	private String loccountry;

	private BigDecimal locdailyallowance;

	private BigDecimal locdistance;

	private String locname;

	//bi-directional many-to-one association to Businesstrip
	@OneToMany(mappedBy="location")
	private List<Businesstrip> businesstrips;

	public Location() {
	}

	public long getLocid() {
		return this.locid;
	}

	public void setLocid(long locid) {
		this.locid = locid;
	}

	public String getLoccountry() {
		return this.loccountry;
	}

	public void setLoccountry(String loccountry) {
		this.loccountry = loccountry;
	}

	public BigDecimal getLocdailyallowance() {
		return this.locdailyallowance;
	}

	public void setLocdailyallowance(BigDecimal locdailyallowance) {
		this.locdailyallowance = locdailyallowance;
	}

	public BigDecimal getLocdistance() {
		return this.locdistance;
	}

	public void setLocdistance(BigDecimal locdistance) {
		this.locdistance = locdistance;
	}

	public String getLocname() {
		return this.locname;
	}

	public void setLocname(String locname) {
		this.locname = locname;
	}

	public List<Businesstrip> getBusinesstrips() {
		return this.businesstrips;
	}

	public void setBusinesstrips(List<Businesstrip> businesstrips) {
		this.businesstrips = businesstrips;
	}

	public Businesstrip addBusinesstrip(Businesstrip businesstrip) {
		getBusinesstrips().add(businesstrip);
		businesstrip.setLocation(this);

		return businesstrip;
	}

	public Businesstrip removeBusinesstrip(Businesstrip businesstrip) {
		getBusinesstrips().remove(businesstrip);
		businesstrip.setLocation(null);

		return businesstrip;
	}

	@Override
	public String toString() {
		return locname ;
	}


}