package com.oredoo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Pavnesh
 *
 */
@Entity
@Table(name="reports_app_stats")
public class ReportsAppStats {
	
	private Long id;
	private Long userId;
	private String packageName;
	private Long dataUsed;
	private Date lastTimeUsed;
	private Long forgroundTime;
	private Date beginTime;
	private Date endTime;
	private Date updatedTime;
	private Long appId;
	private String appName;
	private Long cpId;
	private Date entryDateTime;
	private Long usedDuration;
	private Integer type;
	private Integer source;
	private Integer contentId;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Column(name="user_id")
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	@Column(name="package_name")
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	@Column(name="data_used")
	public Long getDataUsed() {
		return dataUsed;
	}
	public void setDataUsed(Long dataUsed) {
		this.dataUsed = dataUsed;
	}
	
	
	@Column(name="last_time_used")
	public Date getLastTimeUsed() {
		return lastTimeUsed;
	}
	public void setLastTimeUsed(Date lastTimeUsed) {
		this.lastTimeUsed = lastTimeUsed;
	}
	
	@Column(name="forground_time")
	public Long getForgroundTime() {
		return forgroundTime;
	}
	public void setForgroundTime(Long forgroundTime) {
		this.forgroundTime = forgroundTime;
	}
	
	@Column(name="begin_time")
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	
	
	@Column(name="end_time")
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	@Column(name="update_time")
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	@Column(name="app_id")
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	
	
	@Column(name="app_name")
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	
	@Column(name="cpid")
	public Long getCpId() {
		return cpId;
	}
	public void setCpId(Long cpId) {
		this.cpId = cpId;
	}
	
	@Column(name="entry_date_time")
	public Date getEntryDateTime() {
		return entryDateTime;
	}
	public void setEntryDateTime(Date entryDateTime) {
		this.entryDateTime = entryDateTime;
	}
	
	@Column(name="used_duration")
	public Long getUsedDuration() {
		return usedDuration;
	}
	public void setUsedDuration(Long usedDuration) {
		this.usedDuration = usedDuration;
	}
	@Column(name="type")

	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Column(name="source")

	public Integer getSource() {
		return source;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	@Column(name="content_id")

	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	@Override
	public String toString() {
		return "ReportsAppStats [id=" + id + ", userId=" + userId + ", packageName=" + packageName + ", dataUsed="
				+ dataUsed + ", lastTimeUsed=" + lastTimeUsed + ", forgroundTime=" + forgroundTime + ", beginTime="
				+ beginTime + ", endTime=" + endTime + ", updatedTime=" + updatedTime + ", appId=" + appId
				+ ", appName=" + appName + ", cpId=" + cpId + ", entryDateTime=" + entryDateTime + ", usedDuration="
				+ usedDuration + ", type=" + type + ", source=" + source + ", contentId=" + contentId + "]";
	}
	

}