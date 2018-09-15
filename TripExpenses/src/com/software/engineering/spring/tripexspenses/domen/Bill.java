package com.software.engineering.spring.tripexspenses.domen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BILLS database table.
 * 
 */
@Entity
@Table(name="BILLS")
@NamedQuery(name="Bill.findAll", query="SELECT b FROM Bill b")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_entity_seq_gen6")
	@SequenceGenerator(name="my_entity_seq_gen6", sequenceName="bill_seq")
	private long billid;

	@Temporal(TemporalType.DATE)
	private Date billdate;

	private String billitem;

	private BigDecimal price;

	//bi-directional many-to-one association to Businesstrip
	@ManyToOne
	@JoinColumn(name="BUSINESSTRIPS_BUSTRIPID")
	private Businesstrip businesstrip;

	public Bill() {
	}

	public long getBillid() {
		return this.billid;
	}

	public void setBillid(long billid) {
		this.billid = billid;
	}

	public Date getBilldate() {
		return this.billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	public String getBillitem() {
		return this.billitem;
	}

	public void setBillitem(String billitem) {
		this.billitem = billitem;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Businesstrip getBusinesstrip() {
		return this.businesstrip;
	}

	public void setBusinesstrip(Businesstrip businesstrip) {
		this.businesstrip = businesstrip;
	}

	@Override
	public String toString() {
		return "Bill [billid=" + billid + ", billdate=" + billdate + ", billitem=" + billitem + ", price=" + price
				+ ", businesstrip=" + businesstrip + "]";
	}

}