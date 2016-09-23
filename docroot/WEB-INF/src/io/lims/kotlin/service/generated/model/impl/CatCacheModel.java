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

package io.lims.kotlin.service.generated.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import io.lims.kotlin.service.generated.model.Cat;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Cat in entity cache.
 *
 * @author Marcel Mika
 * @see Cat
 * @generated
 */
public class CatCacheModel implements CacheModel<Cat>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{catId=");
		sb.append(catId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Cat toEntityModel() {
		CatImpl catImpl = new CatImpl();

		catImpl.setCatId(catId);

		if (name == null) {
			catImpl.setName(StringPool.BLANK);
		}
		else {
			catImpl.setName(name);
		}

		if (createDate == Long.MIN_VALUE) {
			catImpl.setCreateDate(null);
		}
		else {
			catImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			catImpl.setModifiedDate(null);
		}
		else {
			catImpl.setModifiedDate(new Date(modifiedDate));
		}

		catImpl.resetOriginalValues();

		return catImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		catId = objectInput.readLong();
		name = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(catId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long catId;
	public String name;
	public long createDate;
	public long modifiedDate;
}