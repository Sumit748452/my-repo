package com.oredoo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appstore_download_logs_Rep")
public class AppStoreAPKDownload {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "user_id")
	private Long uid;
	@Column(name = "msisdn")
	private Long msisdn;
	@Column(name = "name")
	private String appName;
	@Column(name = "version")
	private String version;
	@Column(name = "log")
	private String log;
	@Column(name = "download_url")
	private String downloadUrl;
	@Column(name = "status_code")
	private Integer statusCode;
	@Column(name = "status_message")
	private String statusMessage;
	@Column(name = "device_dpi")
	private String deviceApi;

	@Column(name = "date_time")
	private String dateTime;
	@Column(name = "app_id")
	private Long appId;
	@Column(name = "apk_id")
	private Integer apkId;
	@Column(name = "cpid")
	private Integer cpid;
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
	public Long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getDeviceApi() {
		return deviceApi;
	}
	public void setDeviceApi(String deviceApi) {
		this.deviceApi = deviceApi;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public Integer getApkId() {
		return apkId;
	}
	public void setApkId(Integer apkId) {
		this.apkId = apkId;
	}
	public Integer getCpid() {
		return cpid;
	}
	public void setCpid(Integer cpid) {
		this.cpid = cpid;
	}

	
	
}
