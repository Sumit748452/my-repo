package com.oredoo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "iuser")
public class IUser implements Serializable {
	private static final long serialVersionUID = -3889125680746440567L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "login", unique = true)
	private String login;
	@Column(name = "pwd")
	private String pwd;
	@Column(name = "enabled")
	private Integer enabled;
	@Column(name = "roleid")
	private String roleid;
	@Column(name = "refdata")
	private String refdata;
	@Column(name = "status")
	private Integer status;
	@Column(name = "ipaddr")
	private String ipaddr;
	@Column(name = "logstatus")
	private Integer logstatus;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "addtime ")
	private Date addtime;
	@Column(name = "edittime")
	private Date edittime;
	@Column(name = "editby")
	private String editby;
	@Column(name = "drm")
	private Integer drm;
	@Column(name = "resendcount")
	private String resendcount;
	@Column(name = "telcoid")
	private Integer telcoid;
	@Column(name = "linkcreatorid")
	private String linkcreatorid;
	@Column(name = "language")
	private Integer language;
	@Column(name = "ocg_status")
	private Integer ocgStatus;
	@Column(name = "ocg_update_status")
	private Integer ocgUpdateStatus;
	@Column(name = "sms_status")
	private Integer smsStatus;
	@Column(name = "sms_update_status")
	private Integer smsUpdateStatus;
	@Column(name = "cpid")
	private Integer cpid;
	@Column(name = "download_prid")
	private Integer downloadPrid;

	public IUser() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRefdata() {
		return this.refdata;
	}

	public void setRefdata(String refdata) {
		this.refdata = refdata;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIpaddr() {
		return this.ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	public Integer getLogstatus() {
		return this.logstatus;
	}

	public void setLogstatus(Integer logstatus) {
		this.logstatus = logstatus;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getEdittime() {
		return this.edittime;
	}

	public void setEdittime(Date edittime) {
		this.edittime = edittime;
	}

	public String getEditby() {
		return this.editby;
	}

	public void setEditby(String editby) {
		this.editby = editby;
	}

	public Integer getDrm() {
		return this.drm;
	}

	public void setDrm(Integer drm) {
		this.drm = drm;
	}

	public String getResendcount() {
		return this.resendcount;
	}

	public void setResendcount(String resendcount) {
		this.resendcount = resendcount;
	}

	public Integer getTelcoid() {
		return this.telcoid;
	}

	public void setTelcoid(Integer telcoid) {
		this.telcoid = telcoid;
	}

	public String getLinkcreatorid() {
		return this.linkcreatorid;
	}

	public void setLinkcreatorid(String linkcreatorid) {
		this.linkcreatorid = linkcreatorid;
	}

	public Integer getLanguage() {
		return this.language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

	public Integer getOcgStatus() {
		return this.ocgStatus;
	}

	public void setOcgStatus(Integer ocgStatus) {
		this.ocgStatus = ocgStatus;
	}

	public Integer getOcgUpdateStatus() {
		return this.ocgUpdateStatus;
	}

	public void setOcgUpdateStatus(Integer ocgUpdateStatus) {
		this.ocgUpdateStatus = ocgUpdateStatus;
	}

	public Integer getSmsStatus() {
		return this.smsStatus;
	}

	public void setSmsStatus(Integer smsStatus) {
		this.smsStatus = smsStatus;
	}

	public Integer getSmsUpdateStatus() {
		return this.smsUpdateStatus;
	}

	public void setSmsUpdateStatus(Integer smsUpdateStatus) {
		this.smsUpdateStatus = smsUpdateStatus;
	}

	public Integer getCpid() {
		return this.cpid;
	}

	public void setCpid(Integer cpid) {
		this.cpid = cpid;
	}

	public Integer getDownloadPrid() {
		return this.downloadPrid;
	}

	public void setDownloadPrid(Integer downloadPrid) {
		this.downloadPrid = downloadPrid;
	}

	@Override
	public String toString() {
		return "IUser [id=" + id + ", login=" + login + ", pwd=" + pwd + ", enabled=" + enabled + ", roleid=" + roleid
				+ ", refdata=" + refdata + ", status=" + status + ", ipaddr=" + ipaddr + ", logstatus=" + logstatus
				+ ", remarks=" + remarks + ", addtime=" + addtime + ", edittime=" + edittime + ", editby=" + editby
				+ ", drm=" + drm + ", resendcount=" + resendcount + ", telcoid=" + telcoid + ", linkcreatorid="
				+ linkcreatorid + ", language=" + language + ", ocgStatus=" + ocgStatus + ", ocgUpdateStatus="
				+ ocgUpdateStatus + ", smsStatus=" + smsStatus + ", smsUpdateStatus=" + smsUpdateStatus + ", cpid="
				+ cpid + ", downloadPrid=" + downloadPrid + "]";
	}

}
