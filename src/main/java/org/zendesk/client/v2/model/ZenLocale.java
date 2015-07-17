package org.zendesk.client.v2.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p> Basic implementation for Zendesk's Locale </p>
 *
 * Created on Jul 17, 2015
 * @version CRAFT-PBCA-1.0
 * @author <a href="mailto:joao.rios@craft-solutions.com">João Gonzalez</a>
 */
public class ZenLocale implements SearchResultEntity {
	private Long id;
	private String url;
	private String locale;
	private String name;
	private Date createdAt;
	private Date updatedAt;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the createdAt
	 */
	@JsonProperty("created_at")
	public Date getCreatedAt() {
		return createdAt;
	}
	/**
	 * @return the updatedAt
	 */
	@JsonProperty("updated_at")
	public Date getUpdatedAt() {
		return updatedAt;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
