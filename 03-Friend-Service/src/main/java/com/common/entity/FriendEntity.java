package com.common.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FRIENDSS")
@GenericGenerator(name="idgen",strategy = "increment")
public class FriendEntity {
	
	@Id
	@GeneratedValue(generator="idgen")
	private Integer id;
	
	private Long phoneNumber;
	private Long friendNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getFriendNumber() {
		return friendNumber;
	}
	public void setFriendNumber(Long friendNumber) {
		this.friendNumber = friendNumber;
	}
	@Override
	public String toString() {
		return "FriendEntity [id=" + id + ", phoneNumber=" + phoneNumber + ", friendNumber=" + friendNumber + "]";
	}
	
	

}
