package training.oracle.springbootjdbc;

public class OffenceViewObject {
	private Integer offenceId;
	
	private String offenceType;
	
	private Float penalty;
	
	public String  vehType;

	public OffenceViewObject() {
		super();
	}

	@Override
	public String toString() {
		return "OffenceViewObject [offenceId=" + offenceId + ", offenceType=" + offenceType + ", penalty=" + penalty
				+ ", vehType=" + vehType + "]";
	}

	public OffenceViewObject(Integer offenceId, String offenceType, Float penalty, String vehType) {
		super();
		this.offenceId = offenceId;
		this.offenceType = offenceType;
		this.penalty = penalty;
		this.vehType = vehType;
	}

	public Integer getOffenceId() {
		return offenceId;
	}

	public void setOffenceId(Integer offenceId) {
		this.offenceId = offenceId;
	}

	public String getOffenceType() {
		return offenceType;
	}

	public void setOffenceType(String offenceType) {
		this.offenceType = offenceType;
	}

	public Float getPenalty() {
		return penalty;
	}

	public void setPenalty(Float penalty) {
		this.penalty = penalty;
	}

	public String getVehType() {
		return vehType;
	}

	public void setVehType(String vehType) {
		this.vehType = vehType;
	}
	
}
