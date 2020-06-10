package com.oredoo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game_play_tokens")
public class GamesToken {
	private long id;
	private Long uid;
	private String msisdn;
	private String token;
	private String ip;
	private Boolean isUsed; 

	private Date lastTime;
	private Boolean use_count; 
	private Integer contentId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="uid")

	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	@Column(name="msisdn")

	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	
	@Column(name="token")

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Column(name="ip")

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Column(name="last_use_date")

	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	@Column(name="use_count")

	public Boolean getUse_count() {
		return use_count;
	}
	public void setUse_count(Boolean use_count) {
		this.use_count = use_count;
	}
	@Column(name="content_id")

	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	@Column(name="is_used")

	public Boolean getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Boolean isUsed) {
		this.isUsed = isUsed;
	}
	@Override
	public String toString() {
		return "GamesToken [id=" + id + ", uid=" + uid + ", msisdn=" + msisdn + ", token=" + token + ", ip=" + ip
				+ ", isUsed=" + isUsed + ", lastTime=" + lastTime + ", use_count=" + use_count + ", contentId="
				+ contentId + "]";
	}
	

}
