// default package
// Generated Feb 3, 2015 12:02:04 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * SmartMeterData generated by hbm2java
 */
public class SmartMeterData implements java.io.Serializable {

	private Integer id;
	private Date timestamp;
	private Integer smIndex;
	private String smIeeeAddress;
	private Integer rmsV1;
	private BigDecimal rmsI1;
	private Integer theta1;
	private Integer rmsV2;
	private BigDecimal rmsI2;
	private Integer theta2;
	private Integer rmsV3;
	private BigDecimal rmsI3;
	private Integer magV1;
	private Integer magI1;
	private Integer magV2;
	private Integer magI2;
	private Integer magV3;
	private Integer magI3;
	private Integer smV;
	private Integer smI;
	private BigDecimal power;
	private BigDecimal energy;
	private BigDecimal accumulatedEnergy;
	private Integer status;

	public SmartMeterData() {
	}

	public SmartMeterData(Integer smIndex, String smIeeeAddress, Integer rmsV1,
			BigDecimal rmsI1, Integer theta1, Integer rmsV2, BigDecimal rmsI2,
			Integer theta2, Integer rmsV3, BigDecimal rmsI3, Integer magV1,
			Integer magI1, Integer magV2, Integer magI2, Integer magV3,
			Integer magI3, Integer smV, Integer smI, BigDecimal power,
			BigDecimal energy, BigDecimal accumulatedEnergy, Integer status) {
		this.smIndex = smIndex;
		this.smIeeeAddress = smIeeeAddress;
		this.rmsV1 = rmsV1;
		this.rmsI1 = rmsI1;
		this.theta1 = theta1;
		this.rmsV2 = rmsV2;
		this.rmsI2 = rmsI2;
		this.theta2 = theta2;
		this.rmsV3 = rmsV3;
		this.rmsI3 = rmsI3;
		this.magV1 = magV1;
		this.magI1 = magI1;
		this.magV2 = magV2;
		this.magI2 = magI2;
		this.magV3 = magV3;
		this.magI3 = magI3;
		this.smV = smV;
		this.smI = smI;
		this.power = power;
		this.energy = energy;
		this.accumulatedEnergy = accumulatedEnergy;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getSmIndex() {
		return this.smIndex;
	}

	public void setSmIndex(Integer smIndex) {
		this.smIndex = smIndex;
	}

	public String getSmIeeeAddress() {
		return this.smIeeeAddress;
	}

	public void setSmIeeeAddress(String smIeeeAddress) {
		this.smIeeeAddress = smIeeeAddress;
	}

	public Integer getRmsV1() {
		return this.rmsV1;
	}

	public void setRmsV1(Integer rmsV1) {
		this.rmsV1 = rmsV1;
	}

	public BigDecimal getRmsI1() {
		return this.rmsI1;
	}

	public void setRmsI1(BigDecimal rmsI1) {
		this.rmsI1 = rmsI1;
	}

	public Integer getTheta1() {
		return this.theta1;
	}

	public void setTheta1(Integer theta1) {
		this.theta1 = theta1;
	}

	public Integer getRmsV2() {
		return this.rmsV2;
	}

	public void setRmsV2(Integer rmsV2) {
		this.rmsV2 = rmsV2;
	}

	public BigDecimal getRmsI2() {
		return this.rmsI2;
	}

	public void setRmsI2(BigDecimal rmsI2) {
		this.rmsI2 = rmsI2;
	}

	public Integer getTheta2() {
		return this.theta2;
	}

	public void setTheta2(Integer theta2) {
		this.theta2 = theta2;
	}

	public Integer getRmsV3() {
		return this.rmsV3;
	}

	public void setRmsV3(Integer rmsV3) {
		this.rmsV3 = rmsV3;
	}

	public BigDecimal getRmsI3() {
		return this.rmsI3;
	}

	public void setRmsI3(BigDecimal rmsI3) {
		this.rmsI3 = rmsI3;
	}

	public Integer getMagV1() {
		return this.magV1;
	}

	public void setMagV1(Integer magV1) {
		this.magV1 = magV1;
	}

	public Integer getMagI1() {
		return this.magI1;
	}

	public void setMagI1(Integer magI1) {
		this.magI1 = magI1;
	}

	public Integer getMagV2() {
		return this.magV2;
	}

	public void setMagV2(Integer magV2) {
		this.magV2 = magV2;
	}

	public Integer getMagI2() {
		return this.magI2;
	}

	public void setMagI2(Integer magI2) {
		this.magI2 = magI2;
	}

	public Integer getMagV3() {
		return this.magV3;
	}

	public void setMagV3(Integer magV3) {
		this.magV3 = magV3;
	}

	public Integer getMagI3() {
		return this.magI3;
	}

	public void setMagI3(Integer magI3) {
		this.magI3 = magI3;
	}

	public Integer getSmV() {
		return this.smV;
	}

	public void setSmV(Integer smV) {
		this.smV = smV;
	}

	public Integer getSmI() {
		return this.smI;
	}

	public void setSmI(Integer smI) {
		this.smI = smI;
	}

	public BigDecimal getPower() {
		return this.power;
	}

	public void setPower(BigDecimal power) {
		this.power = power;
	}

	public BigDecimal getEnergy() {
		return this.energy;
	}

	public void setEnergy(BigDecimal energy) {
		this.energy = energy;
	}

	public BigDecimal getAccumulatedEnergy() {
		return this.accumulatedEnergy;
	}

	public void setAccumulatedEnergy(BigDecimal accumulatedEnergy) {
		this.accumulatedEnergy = accumulatedEnergy;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
