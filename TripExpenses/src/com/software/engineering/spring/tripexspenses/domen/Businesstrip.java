package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BUSINESSTRIPS database table.
 * 
 */
@Entity
@Table(name="BUSINESSTRIPS")
@NamedQuery(name="Businesstrip.findAll", query="SELECT b FROM Businesstrip b")
public class Businesstrip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen2")
	@SequenceGenerator(name="my_entity_seq_gen2", sequenceName="businesstrips_seq")
	private long bustripid;

	private Long dayscount;

	@Temporal(TemporalType.DATE)
	private Date fromdate;

	@Temporal(TemporalType.DATE)
	private Date todate;

	private BigDecimal triptotallow;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="businesstrip")
	private List<Bill> bills;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="EMPLOYEES_EMPLOYEEID")
	private Employee employee;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="LOCATIONS_LOCID")
	private Location location;

	//bi-directional many-to-one association to Tripbill
	@OneToOne(mappedBy="businesstrip")
	private Tripbill tripbills;

	public Businesstrip() {
	}

	public long getBustripid() {
		return this.bustripid;
	}

	public void setBustripid(long bustripid) {
		this.bustripid = bustripid;
	}

	public Long getDayscount() {
		return this.dayscount;
	}

	public void setDayscount(Long dayscount) {
		this.dayscount = dayscount;
	}

	public Date getFromdate() {
		return this.fromdate;
	}

	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}

	public Date getTodate() {
		return this.todate;
	}

	public void setTodate(Date todate) {
		this.todate = todate;
	}

	public BigDecimal getTriptotallow() {
		return this.triptotallow;
	}

	public void setTriptotallow(BigDecimal triptotallow) {
		this.triptotallow = triptotallow;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setBusinesstrip(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setBusinesstrip(null);

		return bill;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Tripbill getTripbills() {
		return tripbills;
	}

	public void setTripbills(Tripbill tripbills) {
		this.tripbills = tripbills;
	}

	@Override
	public String toString() {
		return employee + " in " + location + " from " + fromdate + 
			" to " + todate;
	}

}