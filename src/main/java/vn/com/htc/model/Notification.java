package vn.com.htc.model;

public class Notification {
	private int notificaid;
	private String notifica;
	private int planid;
	private int formid;
	public int getNotificaid() {
		return notificaid;
	}
	public void setNotificaid(int notificaid) {
		this.notificaid = notificaid;
	}
	public String getNotifica() {
		return notifica;
	}
	public void setNotifica(String notifica) {
		this.notifica = notifica;
	}
	public int getPlanid() {
		return planid;
	}
	public void setPlanid(int planid) {
		this.planid = planid;
	}
	public int getFormid() {
		return formid;
	}
	public void setFormid(int formid) {
		this.formid = formid;
	}
	public Notification(int notificaid, String notifica, int planid, int formid) {
		super();
		this.notificaid = notificaid;
		this.notifica = notifica;
		this.planid = planid;
		this.formid = formid;
	}
	public Notification() {
	}
	@Override
	public String toString() {
		return "Notification [notificaid=" + notificaid + ", notifica=" + notifica + ", planid=" + planid + ", formid="
				+ formid + "]";
	}
	
}
