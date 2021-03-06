package dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class TrackControlDto {
	@NotEmpty
	private String pDivision;
	@NotEmpty
	private String pDistrict;
	@NotEmpty

	private String pSubDistrict;
	@NotEmpty

	private String dDivision;
	@NotEmpty

	private String dDistrict;
	@NotEmpty

	private String dSubDistrict;
	@NotEmpty

	private String sessionMsg;
	
	private String states;
	
	private int overvationCount;

	public TrackControlDto(String pDivision, String pDistrict, String pSubDistrict, String dDivision, String dDistrict,
			String dSubDistrict, String sessionMsg, int overvationCount) {
		this.pDivision = pDivision;
		this.pDistrict = pDistrict;
		this.pSubDistrict = pSubDistrict;
		this.dDivision = dDivision;
		this.dDistrict = dDistrict;
		this.dSubDistrict = dSubDistrict;
		this.sessionMsg = sessionMsg;
		this.overvationCount = overvationCount;
	}

	public TrackControlDto() {
	}

	public String getpDivision() {
		return pDivision;
	}

	public void setpDivision(String pDivision) {
		this.pDivision = pDivision;
	}

	public String getpDistrict() {
		return pDistrict;
	}

	public void setpDistrict(String pDistrict) {
		this.pDistrict = pDistrict;
	}

	public String getpSubDistrict() {
		return pSubDistrict;
	}

	public void setpSubDistrict(String pSubDistrict) {
		this.pSubDistrict = pSubDistrict;
	}

	public String getdDivision() {
		return dDivision;
	}

	public void setdDivision(String dDivision) {
		this.dDivision = dDivision;
	}

	public String getdDistrict() {
		return dDistrict;
	}

	public void setdDistrict(String dDistrict) {
		this.dDistrict = dDistrict;
	}

	public String getdSubDistrict() {
		return dSubDistrict;
	}

	public void setdSubDistrict(String dSubDistrict) {
		this.dSubDistrict = dSubDistrict;
	}

	public int getOvervationCount() {
		return overvationCount;
	}

	public void setOvervationCount(int overvationCount) {
		this.overvationCount = overvationCount;
	}

	public String getSessionMsg() {
		return sessionMsg;
	}

	public void setSessionMsg(String sessionMsg) {
		this.sessionMsg = sessionMsg;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "TrackControlDto [pDivision=" + pDivision + ", pDistrict=" + pDistrict + ", pSubDistrict=" + pSubDistrict
				+ ", dDivision=" + dDivision + ", dDistrict=" + dDistrict + ", dSubDistrict=" + dSubDistrict
				+ ", sessionMsg=" + sessionMsg + ", states=" + states + ", overvationCount=" + overvationCount + "]";
	}

	

}
