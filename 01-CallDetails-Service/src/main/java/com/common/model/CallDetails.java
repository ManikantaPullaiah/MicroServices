package com.common.model;

import java.time.LocalDateTime;

public class CallDetails {

	private Integer id;
	private Long fromNumber;
	private Long toNumber;
	private LocalDateTime calledOn;
	private Integer durationInSeconds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getFromNumber() {
		return fromNumber;
	}

	public void setFromNumber(Long fromNumber) {
		this.fromNumber = fromNumber;
	}

	public Long getToNumber() {
		return toNumber;
	}

	public void setToNumber(Long toNumber) {
		this.toNumber = toNumber;
	}

	public LocalDateTime getCalledOn() {
		return calledOn;
	}

	public void setCalledOn(LocalDateTime calledOn) {
		this.calledOn = calledOn;
	}

	public Integer getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(Integer durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}

	@Override
	public String toString() {
		return "CallDetails [id=" + id + ", fromNumber=" + fromNumber + ", toNumber=" + toNumber + ", calledOn="
				+ calledOn + ", durationInSeconds=" + durationInSeconds + "]";
	}

}
