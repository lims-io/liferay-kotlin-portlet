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

package io.lims.kotlin.service.generated.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import io.lims.kotlin.service.generated.model.Cat;

/**
 * The persistence interface for the cat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marcel Mika
 * @see CatPersistenceImpl
 * @see CatUtil
 * @generated
 */
public interface CatPersistence extends BasePersistence<Cat> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CatUtil} to access the cat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the cat in the entity cache if it is enabled.
	*
	* @param cat the cat
	*/
	public void cacheResult(io.lims.kotlin.service.generated.model.Cat cat);

	/**
	* Caches the cats in the entity cache if it is enabled.
	*
	* @param cats the cats
	*/
	public void cacheResult(
		java.util.List<io.lims.kotlin.service.generated.model.Cat> cats);

	/**
	* Creates a new cat with the primary key. Does not add the cat to the database.
	*
	* @param catId the primary key for the new cat
	* @return the new cat
	*/
	public io.lims.kotlin.service.generated.model.Cat create(long catId);

	/**
	* Removes the cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param catId the primary key of the cat
	* @return the cat that was removed
	* @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public io.lims.kotlin.service.generated.model.Cat remove(long catId)
		throws com.liferay.portal.kernel.exception.SystemException,
			io.lims.kotlin.service.generated.NoSuchCatException;

	public io.lims.kotlin.service.generated.model.Cat updateImpl(
		io.lims.kotlin.service.generated.model.Cat cat)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cat with the primary key or throws a {@link io.lims.kotlin.service.generated.NoSuchCatException} if it could not be found.
	*
	* @param catId the primary key of the cat
	* @return the cat
	* @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public io.lims.kotlin.service.generated.model.Cat findByPrimaryKey(
		long catId)
		throws com.liferay.portal.kernel.exception.SystemException,
			io.lims.kotlin.service.generated.NoSuchCatException;

	/**
	* Returns the cat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param catId the primary key of the cat
	* @return the cat, or <code>null</code> if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public io.lims.kotlin.service.generated.model.Cat fetchByPrimaryKey(
		long catId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cats.
	*
	* @return the cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<io.lims.kotlin.service.generated.model.Cat> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link io.lims.kotlin.service.generated.model.impl.CatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cats
	* @param end the upper bound of the range of cats (not inclusive)
	* @return the range of cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<io.lims.kotlin.service.generated.model.Cat> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link io.lims.kotlin.service.generated.model.impl.CatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cats
	* @param end the upper bound of the range of cats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<io.lims.kotlin.service.generated.model.Cat> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cats from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cats.
	*
	* @return the number of cats
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}