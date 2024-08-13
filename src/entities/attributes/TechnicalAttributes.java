package entities.attributes;

import entities.BaseEntity;

public class TechnicalAttributes extends BaseEntity implements PlayerAttributes {
	private static Integer technicalCount;
	
	private Integer finishing;
	private Integer pass;
	private Integer dribbling;
	private Integer tackle;
	private Integer shotPower;
	
	public TechnicalAttributes(Integer finishing, Integer pass, Integer dribbling, Integer tackle, Integer shotPower) {
		super(++technicalCount);
		this.finishing = finishing;
		this.pass = pass;
		this.dribbling = dribbling;
		this.tackle = tackle;
		this.shotPower = shotPower;
	}
	
	public Integer getFinishing() {
		return finishing;
	}
	
	public Integer getPass() {
		return pass;
	}
	
	public Integer getDribbling() {
		return dribbling;
	}
	
	public Integer getTackle() {
		return tackle;
	}
	
	public Integer getShotPower() {
		return shotPower;
	}
	
	public void setFinishing(Integer finishing) {
		this.finishing = finishing;
	}
	
	public void setPass(Integer pass) {
		this.pass = pass;
	}
	
	public void setDribbling(Integer dribbling) {
		this.dribbling = dribbling;
	}
	
	public void setTackle(Integer tackle) {
		this.tackle = tackle;
	}
	
	public void setShotPower(Integer shotPower) {
		this.shotPower = shotPower;
	}
}