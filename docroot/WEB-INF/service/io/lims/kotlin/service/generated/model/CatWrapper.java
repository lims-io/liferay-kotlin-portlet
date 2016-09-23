/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package io.lims.kotlin.service.generated.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Cat}.
 * </p>
 *
 * @author Marcel Mika
 * @see Cat
 * @generated
 */
public class CatWrapper implements Cat, ModelWrapper<Cat> {
	public CatWrapper(Cat cat) {
		_cat = cat;
	}

	@Override
	public Class<?> getModelClass() {
		return Cat.class;
	}

	@Override
	public String getModelClassName() {
		return Cat.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("catId", getCatId());
		attributes.put("name", getName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long catId = (Long)attributes.get("catId");

		if (catId != null) {
			setCatId(catId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this cat.
	*
	* @return the primary key of this cat
	*/
	@Override
	public long getPrimaryKey() {
		return _cat.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cat.
	*
	* @param primaryKey the primary key of this cat
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cat.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cat ID of this cat.
	*
	* @return the cat ID of this cat
	*/
	@Override
	public long getCatId() {
		return _cat.getCatId();
	}

	/**
	* Sets the cat ID of this cat.
	*
	* @param catId the cat ID of this cat
	*/
	@Override
	public void setCatId(long catId) {
		_cat.setCatId(catId);
	}

	/**
	* Returns the name of this cat.
	*
	* @return the name of this cat
	*/
	@Override
	public java.lang.String getName() {
		return _cat.getName();
	}

	/**
	* Sets the name of this cat.
	*
	* @param name the name of this cat
	*/
	@Override
	public void setName(java.lang.String name) {
		_cat.setName(name);
	}

	/**
	* Returns the create date of this cat.
	*
	* @return the create date of this cat
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _cat.getCreateDate();
	}

	/**
	* Sets the create date of this cat.
	*
	* @param createDate the create date of this cat
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_cat.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this cat.
	*
	* @return the modified date of this cat
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _cat.getModifiedDate();
	}

	/**
	* Sets the modified date of this cat.
	*
	* @param modifiedDate the modified date of this cat
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_cat.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _cat.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cat.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cat.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cat.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cat.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cat.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cat.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cat.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cat.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cat.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cat.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CatWrapper((Cat)_cat.clone());
	}

	@Override
	public int compareTo(io.lims.kotlin.service.generated.model.Cat cat) {
		return _cat.compareTo(cat);
	}

	@Override
	public int hashCode() {
		return _cat.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<io.lims.kotlin.service.generated.model.Cat> toCacheModel() {
		return _cat.toCacheModel();
	}

	@Override
	public io.lims.kotlin.service.generated.model.Cat toEscapedModel() {
		return new CatWrapper(_cat.toEscapedModel());
	}

	@Override
	public io.lims.kotlin.service.generated.model.Cat toUnescapedModel() {
		return new CatWrapper(_cat.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cat.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cat.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cat.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CatWrapper)) {
			return false;
		}

		CatWrapper catWrapper = (CatWrapper)obj;

		if (Validator.equals(_cat, catWrapper._cat)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Cat getWrappedCat() {
		return _cat;
	}

	@Override
	public Cat getWrappedModel() {
		return _cat;
	}

	@Override
	public void resetOriginalValues() {
		_cat.resetOriginalValues();
	}

	private Cat _cat;
}