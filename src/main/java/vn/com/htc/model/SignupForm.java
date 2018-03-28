package vn.com.htc.model;

import java.util.Date;

public class SignupForm {
	private int formid;
	private int userid;
	private String startingPoint;
	private String destination;
	private double advancemoney;
	private double wage;
	private int receiverid;
	private Date departureTime;
	private Date arrivalTime;
	private String result;
	private String status;
	
	public int getFormid() {
		return formid;
	}

	public void setFormid(int formid) {
		this.formid = formid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getAdvancemoney() {
		return advancemoney;
	}

	public void setAdvancemoney(double advancemoney) {
		this.advancemoney = advancemoney;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getReceiverid() {
		return receiverid;
	}

	public void setReceiverid(int receiverid) {
		this.receiverid = receiverid;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SignupForm(int formid, int userid, String startingPoint, String destination, double advancemoney,
			double wage, int receiverid, Date departureTime, Date arrivalTime, String result, String status) {
		super();
		this.formid = formid;
		this.userid = userid;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.advancemoney = advancemoney;
		this.wage = wage;
		this.receiverid = receiverid;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.result = result;
		this.status = status;
	}

	public SignupForm() {
	}

	@Override
	public String toString() {
		return "SignupForm [formid=" + formid + ", userid=" + userid + ", startingPoint=" + startingPoint
				+ ", destination=" + destination + ", advancemoney=" + advancemoney + ", wage=" + wage + ", receiverid="
				+ receiverid + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", result="
				+ result + ", status=" + status + "]";
	}
	
	
}
