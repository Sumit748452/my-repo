package com.oredoo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class misuser {

	
	private long id;
	private Long uid;
	private String packageName;
	private String month;
	private Long dataUsed;
	private Long foregroundTime;
	private Date beginTime;
	private Date endTime;
	private Date updateTime;
	private String dateTime; 
	private Integer appId;
	private String appName;
	private Integer cpid;
	private Integer type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Long getDataUsed() {
		return dataUsed;
	}

	public void setDataUsed(Long dataUsed) {
		this.dataUsed = dataUsed;
	}

	public Long getForegroundTime() {
		return foregroundTime;
	}

	public void setForegroundTime(Long foregroundTime) {
		this.foregroundTime = foregroundTime;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Integer getCpid() {
		return cpid;
	}

	public void setCpid(Integer cpid) {
		this.cpid = cpid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "misuser [id=" + id + ", uid=" + uid + ", packageName=" + packageName + ", month=" + month
				+ ", dataUsed=" + dataUsed + ", foregroundTime=" + foregroundTime + ", beginTime=" + beginTime
				+ ", endTime=" + endTime + ", updateTime=" + updateTime + ", dateTime=" + dateTime + ", appId=" + appId
				+ ", appName=" + appName + ", cpid=" + cpid + ", type=" + type + "]";
	}

}
