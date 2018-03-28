package vn.com.htc.model;

import java.util.Date;

public class Plan {
	private int planid;
	private int userid;
	private Date departureTime;
	private Date arrivalTime;
	private String pickupLocation;
	private String destination;
	public int getPlanid() {
		return planid;
	}
	public void setPlanid(int planid) {
		this.planid = planid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Plan [planid=" + planid + ", userid=" + userid + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", pickupLocation=" + pickupLocation + ", destination=" + destination + "]";
	}
	public Plan(int planid, int userid, Date departureTime, Date arrivalTime, String pickupLocation,
			String destination) {
		this.planid = planid;
		this.userid = userid;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.pickupLocation = pickupLocation;
		this.destination = destination;
	}
	public Plan() {
		super();
	}
	
}
