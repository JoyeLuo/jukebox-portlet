/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferay.jukebox.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Artist service. Represents a row in the &quot;jukebox_Artist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.liferay.jukebox.model.impl.ArtistModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.liferay.jukebox.model.impl.ArtistImpl}.
 * </p>
 *
 * @author Julio Camarero
 * @see Artist
 * @see org.liferay.jukebox.model.impl.ArtistImpl
 * @see org.liferay.jukebox.model.impl.ArtistModelImpl
 * @generated
 */
public interface ArtistModel extends BaseModel<Artist>, StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a artist model instance should use the {@link Artist} interface instead.
	 */

	/**
	 * Returns the primary key of this artist.
	 *
	 * @return the primary key of this artist
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this artist.
	 *
	 * @param primaryKey the primary key of this artist
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this artist.
	 *
	 * @return the uuid of this artist
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this artist.
	 *
	 * @param uuid the uuid of this artist
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the artist ID of this artist.
	 *
	 * @return the artist ID of this artist
	 */
	public long getArtistId();

	/**
	 * Sets the artist ID of this artist.
	 *
	 * @param artistId the artist ID of this artist
	 */
	public void setArtistId(long artistId);

	/**
	 * Returns the company ID of this artist.
	 *
	 * @return the company ID of this artist
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this artist.
	 *
	 * @param companyId the company ID of this artist
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this artist.
	 *
	 * @return the group ID of this artist
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this artist.
	 *
	 * @param groupId the group ID of this artist
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this artist.
	 *
	 * @return the user ID of this artist
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this artist.
	 *
	 * @param userId the user ID of this artist
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this artist.
	 *
	 * @return the user uuid of this artist
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this artist.
	 *
	 * @param userUuid the user uuid of this artist
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this artist.
	 *
	 * @return the user name of this artist
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this artist.
	 *
	 * @param userName the user name of this artist
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this artist.
	 *
	 * @return the create date of this artist
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this artist.
	 *
	 * @param createDate the create date of this artist
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this artist.
	 *
	 * @return the modified date of this artist
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this artist.
	 *
	 * @param modifiedDate the modified date of this artist
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this artist.
	 *
	 * @return the name of this artist
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this artist.
	 *
	 * @param name the name of this artist
	 */
	public void setName(String name);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Artist artist);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Artist> toCacheModel();

	@Override
	public Artist toEscapedModel();

	@Override
	public Artist toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}