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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import io.lims.kotlin.service.generated.service.CatLocalServiceUtil;
import io.lims.kotlin.service.generated.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marcel Mika
 */
public class CatClp extends BaseModelImpl<Cat> implements Cat {
	public CatClp() {
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
	public long getPrimaryKey() {
		return _catId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCatId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _catId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCatId() {
		return _catId;
	}

	@Override
	public void setCatId(long catId) {
		_catId = catId;

		if (_catRemoteModel != null) {
			try {
				Class<?> clazz = _catRemoteModel.getClass();

				Method method = clazz.getMethod("setCatId", long.class);

				method.invoke(_catRemoteModel, catId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_catRemoteModel != null) {
			try {
				Class<?> clazz = _catRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_catRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_catRemoteModel != null) {
			try {
				Class<?> clazz = _catRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_catRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_catRemoteModel != null) {
			try {
				Class<?> clazz = _catRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_catRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCatRemoteModel() {
		return _catRemoteModel;
	}

	public void setCatRemoteModel(BaseModel<?> catRemoteModel) {
		_catRemoteModel = catRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _catRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_catRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CatLocalServiceUtil.addCat(this);
		}
		else {
			CatLocalServiceUtil.updateCat(this);
		}
	}

	@Override
	public Cat toEscapedModel() {
		return (Cat)ProxyUtil.newProxyInstance(Cat.class.getClassLoader(),
			new Class[] { Cat.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CatClp clone = new CatClp();

		clone.setCatId(getCatId());
		clone.setName(getName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(Cat cat) {
		int value = 0;

		value = getName().compareTo(cat.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CatClp)) {
			return false;
		}

		CatClp cat = (CatClp)obj;

		long primaryKey = cat.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{catId=");
		sb.append(getCatId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("io.lims.kotlin.service.generated.model.Cat");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>catId</column-name><column-value><![CDATA[");
		sb.append(getCatId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _catId;
	private String _name;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _catRemoteModel;
	private Class<?> _clpSerializerClass = io.lims.kotlin.service.generated.service.ClpSerializer.class;
}