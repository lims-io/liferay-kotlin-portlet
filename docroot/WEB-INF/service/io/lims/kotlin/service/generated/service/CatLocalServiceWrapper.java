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

package io.lims.kotlin.service.generated.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CatLocalService}.
 *
 * @author Marcel Mika
 * @see CatLocalService
 * @generated
 */
public class CatLocalServiceWrapper implements CatLocalService,
	ServiceWrapper<CatLocalService> {
	public CatLocalServiceWrapper(CatLocalService catLocalService) {
		_catLocalService = catLocalService;
	}

	/**
	* Adds the cat to the database. Also notifies the appropriate model listeners.
	*
	* @param cat the cat
	* @return the cat that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public io.lims.kotlin.service.generated.model.Cat addCat(
		io.lims.kotlin.service.generated.model.Cat cat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.addCat(cat);
	}

	/**
	* Creates a new cat with the primary key. Does not add the cat to the database.
	*
	* @param catId the primary key for the new cat
	* @return the new cat
	*/
	@Override
	public io.lims.kotlin.service.generated.model.Cat createCat(long catId) {
		return _catLocalService.createCat(catId);
	}

	/**
	* Deletes the cat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param catId the primary key of the cat
	* @return the cat that was removed
	* @throws PortalException if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public io.lims.kotlin.service.generated.model.Cat deleteCat(long catId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.deleteCat(catId);
	}

	/**
	* Deletes the cat from the database. Also notifies the appropriate model listeners.
	*
	* @param cat the cat
	* @return the cat that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public io.lims.kotlin.service.generated.model.Cat deleteCat(
		io.lims.kotlin.service.generated.model.Cat cat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.deleteCat(cat);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _catLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link io.lims.kotlin.service.generated.model.impl.CatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link io.lims.kotlin.service.generated.model.impl.CatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public io.lims.kotlin.service.generated.model.Cat fetchCat(long catId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.fetchCat(catId);
	}

	/**
	* Returns the cat with the primary key.
	*
	* @param catId the primary key of the cat
	* @return the cat
	* @throws PortalException if a cat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public io.lims.kotlin.service.generated.model.Cat getCat(long catId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.getCat(catId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<io.lims.kotlin.service.generated.model.Cat> getCats(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.getCats(start, end);
	}

	/**
	* Returns the number of cats.
	*
	* @return the number of cats
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCatsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.getCatsCount();
	}

	/**
	* Updates the cat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cat the cat
	* @return the cat that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public io.lims.kotlin.service.generated.model.Cat updateCat(
		io.lims.kotlin.service.generated.model.Cat cat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _catLocalService.updateCat(cat);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _catLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_catLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _catLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Creates new cat with the given name
	*
	* @param name String
	* @return Cat
	*/
	@Override
	public io.lims.kotlin.service.generated.model.Cat addCat(
		java.lang.String name) {
		return _catLocalService.addCat(name);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CatLocalService getWrappedCatLocalService() {
		return _catLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCatLocalService(CatLocalService catLocalService) {
		_catLocalService = catLocalService;
	}

	@Override
	public CatLocalService getWrappedService() {
		return _catLocalService;
	}

	@Override
	public void setWrappedService(CatLocalService catLocalService) {
		_catLocalService = catLocalService;
	}

	private CatLocalService _catLocalService;
}