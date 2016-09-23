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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Marcel Mika
 * @generated
 */
public class CatSoap implements Serializable {
	public static CatSoap toSoapModel(Cat model) {
		CatSoap soapModel = new CatSoap();

		soapModel.setCatId(model.getCatId());
		soapModel.setName(model.getName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static CatSoap[] toSoapModels(Cat[] models) {
		CatSoap[] soapModels = new CatSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CatSoap[][] toSoapModels(Cat[][] models) {
		CatSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CatSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CatSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CatSoap[] toSoapModels(List<Cat> models) {
		List<CatSoap> soapModels = new ArrayList<CatSoap>(models.size());

		for (Cat model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CatSoap[soapModels.size()]);
	}

	public CatSoap() {
	}

	public long getPrimaryKey() {
		return _catId;
	}

	public void setPrimaryKey(long pk) {
		setCatId(pk);
	}

	public long getCatId() {
		return _catId;
	}

	public void setCatId(long catId) {
		_catId = catId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _catId;
	private String _name;
	private Date _createDate;
	private Date _modifiedDate;
}