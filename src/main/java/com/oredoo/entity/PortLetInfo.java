package com.oredoo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
/**
 * 
 * @author Pavnesh
 *
 */
@Entity
@Table(name = "appstore_portlet_info")
/*@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")*/
public class PortLetInfo {

	private Long id;
	private Long portalId;
	private Long portalinfoId;
	private String contentRootPath;
	private String url;
	private String info;
	private String text;
	private String imagepage;
	private String catnr;
	private Date publishFromdate;
	private Date publishTodate;
	private String contentindexweb;
	private Integer pricepointid;
	private String portlettype;
	private String usercomment;
	private Long itemtype;
	private String source;
	private String thumbnail;
	private String banner;
	private String tagurl;
	private Long cpid;
	private Long appId;
	private String appName;
	private String searchkey;
	private String textEng;
	private Boolean hasPreviewVideo;
	private Boolean isSeeMoreContent;
	private String rating;
	private String year;
	private Integer contentStyle;
	private String description;
	/*private PortalInfoModel portalInfoModel;*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="portal_id")
	public Long getPortalId() {
		return portalId;
	}
	public void setPortalId(Long portalId) {
		this.portalId = portalId;
	}
	
	
	@Column(name="portalinfo_id")
	public Long getPortalinfoId() {
		return portalinfoId;
	}
	public void setPortalinfoId(Long portalinfoId) {
		this.portalinfoId = portalinfoId;
	}
	
	@Column(name="content_root_path")
	public String getContentRootPath() {
		return contentRootPath;
	}
	public void setContentRootPath(String contentRootPath) {
		this.contentRootPath = contentRootPath;
	}
	
	
	
	@Column(name="url")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Column(name="info")
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	@Column(name="text")
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Column(name="imagepage")
	public String getImagepage() {
		return imagepage;
	}
	public void setImagepage(String imagepage) {
		this.imagepage = imagepage;
	}
	
	@Column(name="catnr")
	public String getCatnr() {
		return catnr;
	}
	public void setCatnr(String catnr) {
		this.catnr = catnr;
	}
	
	@Column(name="publish_fromdate")
	public Date getPublishFromdate() {
		return publishFromdate;
	}
	public void setPublishFromdate(Date publishFromdate) {
		this.publishFromdate = publishFromdate;
	}
	
	@Column(name="publish_todate")
	public Date getPublishTodate() {
		return publishTodate;
	}
	public void setPublishTodate(Date publishTodate) {
		this.publishTodate = publishTodate;
	}
	
	@Column(name="contentindexweb")
	public String getContentindexweb() {
		return contentindexweb;
	}
	public void setContentindexweb(String contentindexweb) {
		this.contentindexweb = contentindexweb;
	}
	
	@Column(name="pricepointid")
	public Integer getPricepointid() {
		return pricepointid;
	}
	public void setPricepointid(Integer pricepointid) {
		this.pricepointid = pricepointid;
	}
	
	
	@Column(name="portlettype")
	public String getPortlettype() {
		return portlettype;
	}
	public void setPortlettype(String portlettype) {
		this.portlettype = portlettype;
	}
	
	@Column(name="usercomment")
	public String getUsercomment() {
		return usercomment;
	}
	public void setUsercomment(String usercomment) {
		this.usercomment = usercomment;
	}
	
	@Column(name="itemtype")
	public Long getItemtype() {
		return itemtype;
	}
	public void setItemtype(Long itemtype) {
		this.itemtype = itemtype;
	}
	
	@Column(name="source")
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	@Column(name="thumbnail")
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	

	@Column(name="banner")
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}

	
	@Column(name="tagurl")
	public String getTagurl() {
		return tagurl;
	}
	public void setTagurl(String tagurl) {
		this.tagurl = tagurl;
	}
	
	@Column(name="cpid")
	public Long getCpid() {
		return cpid;
	}
	public void setCpid(Long cpid) {
		this.cpid = cpid;
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
	@Column(name="searchkey")
	public String getSearchkey() {
		return searchkey;
	}
	public void setSearchkey(String searchkey) {
		this.searchkey = searchkey;
	}
	
	
	@Column(name="text_eng")
	public String getTextEng() {
		return textEng;
	}
	public void setTextEng(String textEng) {
		this.textEng = textEng;
	}
	
	@Column(name="has_preview_video")
	public Boolean getHasPreviewVideo() {
		return hasPreviewVideo;
	}
	public void setHasPreviewVideo(Boolean hasPreviewVideo) {
		this.hasPreviewVideo = hasPreviewVideo;
	}
	
	@Column(name="is_see_more_content")
	public Boolean getIsSeeMoreContent() {
		return isSeeMoreContent;
	}
	public void setIsSeeMoreContent(Boolean isSeeMoreContent) {
		this.isSeeMoreContent = isSeeMoreContent;
	}
	
	/*@JsonIgnore
	@ManyToOne
	@JoinColumn(name="portalinfo_id",referencedColumnName="id")	
	public PortalInfoModel getPortalInfoModel() {
		return portalInfoModel;
	}
	public void setPortalInfoModel(PortalInfoModel portalInfoModel) {
		this.portalInfoModel = portalInfoModel;
	}*/
	
	@Column(name="rating")
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Column(name="year")
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	@Column(name="content_style")
	public Integer getContentStyle() {
		return contentStyle;
	}
	public void setContentStyle(Integer contentStyle) {
		this.contentStyle = contentStyle;
	}
	
	@Transient
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "\nPortLetInfo [id=" + id + ", portalId=" + portalId + ", portalinfoId=" + portalinfoId
				+ ", contentRootPath=" + contentRootPath + ", url=" + url + ", info=" + info + ", text=" + text
				+ ", imagepage=" + imagepage + ", catnr=" + catnr + ", publishFromdate=" + publishFromdate
				+ ", publishTodate=" + publishTodate + ", contentindexweb=" + contentindexweb + ", pricepointid="
				+ pricepointid + ", portlettype=" + portlettype + ", usercomment=" + usercomment + ", itemtype="
				+ itemtype + ", source=" + source + ", thumbnail=" + thumbnail + ", banner=" + banner + ", tagurl="
				+ tagurl + ", cpid=" + cpid + ", searchkey=" + searchkey + ", textEng=" + textEng + ", hasPreviewVideo="
				+ hasPreviewVideo + ", isSeeMoreContent=" + isSeeMoreContent + ", rating=" + rating + ", year=" + year
				+ ", contentStyle=" + contentStyle + "]";
	}
	
	
	
	
	
	
}
