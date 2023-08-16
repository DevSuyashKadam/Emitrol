package com.spring.emitrol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emitec {

	@Id
	private Long partNo;
	private Long orderNo;
	private String oemName;
	private Long quantityProduced;
	private Long downtime;
	private Long lineNo;
	public Long getPartNo() {
		return partNo;
	}
	public void setPartNo(Long partNo) {
		this.partNo = partNo;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public String getOemName() {
		return oemName;
	}
	public void setOemName(String oemName) {
		this.oemName = oemName;
	}
	public Long getQuantityProduced() {
		return quantityProduced;
	}
	public void setQuantityProduced(Long quantityProduced) {
		this.quantityProduced = quantityProduced;
	}
	public Long getDowntime() {
		return downtime;
	}
	public void setDowntime(Long downtime) {
		this.downtime = downtime;
	}
	public Long getLineNo() {
		return lineNo;
	}
	public void setLineNo(Long lineNo) {
		this.lineNo = lineNo;
	}
	public Emitec(Long partNo, Long orderNo, String oemName, Long quantityProduced, Long downtime, Long lineNo) {
		super();
		this.partNo = partNo;
		this.orderNo = orderNo;
		this.oemName = oemName;
		this.quantityProduced = quantityProduced;
		this.downtime = downtime;
		this.lineNo = lineNo;
	}
	public Emitec() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emitec [partNo=" + partNo + ", orderNo=" + orderNo + ", oemName=" + oemName + ", quantityProduced="
				+ quantityProduced + ", downtime=" + downtime + ", lineNo=" + lineNo + "]";
	}
	
	
	
	
	
}
