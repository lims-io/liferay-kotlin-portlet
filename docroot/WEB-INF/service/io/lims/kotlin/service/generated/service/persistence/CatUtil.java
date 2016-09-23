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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import io.lims.kotlin.service.generated.model.Cat;

import java.util.List;

/**
 * The persistence utility for the cat service. This utility wraps {@link CatPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marcel Mika
 * @see CatPersistence
 * @see CatPersistenceImpl
 * @generated
 */
public class CatUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Cat cat) {
		getPersistence().clearCache(cat);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Cat> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Cat> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Cat> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Cat update(Cat cat) throws SystemException {
		return getPersistence().update(cat);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Cat update(Cat cat, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(cat, serviceContext);
	}

	/**
	* Caches the cat in the entity cache if it is enabled.
	*
	* @param cat the cat
	*/
	public static void cacheResult(
		io.lims.kotlin.service.generated.model.Cat cat) {
		getPersistence().cacheResult(cat);
	}

	/**
	* Caches the cats in the entity cache if it is enabled.
	*
	* @param cats the cats
	*/
	public static void cacheResult(
		java.util.List<io.lims.kotlin.service.generated.model.Cat> cats) {
		getPersistence().cacheResult(cats);
	}

	/**
	* Creates a new cat with the primary key. Does not add the cat to the database.
	*
	* @param catId the primary key for the new cat
	* @return the new cat
	*/
	public static io.lims.kotlin.service.generated.model.Cat create(long catId) {
		return getPersistence().create(catId);
	}

	/**
	* Removes the cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param catId the primary key of the cat
	* @return the cat that was removed
	* @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static io.lims.kotlin.service.generated.model.Cat remove(long catId)
		throws com.liferay.portal.kernel.exception.SystemException,
			io.lims.kotlin.service.generated.NoSuchCatException {
		return getPersistence().remove(catId);
	}

	public static io.lims.kotlin.service.generated.model.Cat updateImpl(
		io.lims.kotlin.service.generated.model.Cat cat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cat);
	}

	/**
	* Returns the cat with the primary key or throws a {@link io.lims.kotlin.service.generated.NoSuchCatException} if it could not be found.
	*
	* @param catId the primary key of the cat
	* @return the cat
	* @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static io.lims.kotlin.service.generated.model.Cat findByPrimaryKey(
		long catId)
		throws com.liferay.portal.kernel.exception.SystemException,
			io.lims.kotlin.service.generated.NoSuchCatException {
		return getPersistence().findByPrimaryKey(catId);
	}

	/**
	* Returns the cat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param catId the primary key of the cat
	* @return the cat, or <code>null</code> if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static io.lims.kotlin.service.generated.model.Cat fetchByPrimaryKey(
		long catId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(catId);
	}

	/**
	* Returns all the cats.
	*
	* @return the cats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<io.lims.kotlin.service.generated.model.Cat> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<io.lims.kotlin.service.generated.model.Cat> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<io.lims.kotlin.service.generated.model.Cat> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cats from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cats.
	*
	* @return the number of cats
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CatPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CatPersistence)PortletBeanLocatorUtil.locate(io.lims.kotlin.service.generated.service.ClpSerializer.getServletContextName(),
					CatPersistence.class.getName());

			ReferenceRegistry.registerReference(CatUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CatPersistence persistence) {
	}

	private static CatPersistence _persistence;
}