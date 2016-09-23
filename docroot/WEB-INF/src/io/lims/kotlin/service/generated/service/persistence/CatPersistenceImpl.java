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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import io.lims.kotlin.service.generated.NoSuchCatException;
import io.lims.kotlin.service.generated.model.Cat;
import io.lims.kotlin.service.generated.model.impl.CatImpl;
import io.lims.kotlin.service.generated.model.impl.CatModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marcel Mika
 * @see CatPersistence
 * @see CatUtil
 * @generated
 */
public class CatPersistenceImpl extends BasePersistenceImpl<Cat>
	implements CatPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CatUtil} to access the cat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CatImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CatModelImpl.ENTITY_CACHE_ENABLED,
			CatModelImpl.FINDER_CACHE_ENABLED, CatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CatModelImpl.ENTITY_CACHE_ENABLED,
			CatModelImpl.FINDER_CACHE_ENABLED, CatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CatModelImpl.ENTITY_CACHE_ENABLED,
			CatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CatPersistenceImpl() {
		setModelClass(Cat.class);
	}

	/**
	 * Caches the cat in the entity cache if it is enabled.
	 *
	 * @param cat the cat
	 */
	@Override
	public void cacheResult(Cat cat) {
		EntityCacheUtil.putResult(CatModelImpl.ENTITY_CACHE_ENABLED,
			CatImpl.class, cat.getPrimaryKey(), cat);

		cat.resetOriginalValues();
	}

	/**
	 * Caches the cats in the entity cache if it is enabled.
	 *
	 * @param cats the cats
	 */
	@Override
	public void cacheResult(List<Cat> cats) {
		for (Cat cat : cats) {
			if (EntityCacheUtil.getResult(CatModelImpl.ENTITY_CACHE_ENABLED,
						CatImpl.class, cat.getPrimaryKey()) == null) {
				cacheResult(cat);
			}
			else {
				cat.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cats.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CatImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CatImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cat.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Cat cat) {
		EntityCacheUtil.removeResult(CatModelImpl.ENTITY_CACHE_ENABLED,
			CatImpl.class, cat.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Cat> cats) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Cat cat : cats) {
			EntityCacheUtil.removeResult(CatModelImpl.ENTITY_CACHE_ENABLED,
				CatImpl.class, cat.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cat with the primary key. Does not add the cat to the database.
	 *
	 * @param catId the primary key for the new cat
	 * @return the new cat
	 */
	@Override
	public Cat create(long catId) {
		Cat cat = new CatImpl();

		cat.setNew(true);
		cat.setPrimaryKey(catId);

		return cat;
	}

	/**
	 * Removes the cat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param catId the primary key of the cat
	 * @return the cat that was removed
	 * @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cat remove(long catId) throws NoSuchCatException, SystemException {
		return remove((Serializable)catId);
	}

	/**
	 * Removes the cat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cat
	 * @return the cat that was removed
	 * @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cat remove(Serializable primaryKey)
		throws NoSuchCatException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Cat cat = (Cat)session.get(CatImpl.class, primaryKey);

			if (cat == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cat);
		}
		catch (NoSuchCatException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Cat removeImpl(Cat cat) throws SystemException {
		cat = toUnwrappedModel(cat);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cat)) {
				cat = (Cat)session.get(CatImpl.class, cat.getPrimaryKeyObj());
			}

			if (cat != null) {
				session.delete(cat);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cat != null) {
			clearCache(cat);
		}

		return cat;
	}

	@Override
	public Cat updateImpl(io.lims.kotlin.service.generated.model.Cat cat)
		throws SystemException {
		cat = toUnwrappedModel(cat);

		boolean isNew = cat.isNew();

		Session session = null;

		try {
			session = openSession();

			if (cat.isNew()) {
				session.save(cat);

				cat.setNew(false);
			}
			else {
				session.merge(cat);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CatModelImpl.ENTITY_CACHE_ENABLED,
			CatImpl.class, cat.getPrimaryKey(), cat);

		return cat;
	}

	protected Cat toUnwrappedModel(Cat cat) {
		if (cat instanceof CatImpl) {
			return cat;
		}

		CatImpl catImpl = new CatImpl();

		catImpl.setNew(cat.isNew());
		catImpl.setPrimaryKey(cat.getPrimaryKey());

		catImpl.setCatId(cat.getCatId());
		catImpl.setName(cat.getName());
		catImpl.setCreateDate(cat.getCreateDate());
		catImpl.setModifiedDate(cat.getModifiedDate());

		return catImpl;
	}

	/**
	 * Returns the cat with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cat
	 * @return the cat
	 * @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cat findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCatException, SystemException {
		Cat cat = fetchByPrimaryKey(primaryKey);

		if (cat == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cat;
	}

	/**
	 * Returns the cat with the primary key or throws a {@link io.lims.kotlin.service.generated.NoSuchCatException} if it could not be found.
	 *
	 * @param catId the primary key of the cat
	 * @return the cat
	 * @throws io.lims.kotlin.service.generated.NoSuchCatException if a cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cat findByPrimaryKey(long catId)
		throws NoSuchCatException, SystemException {
		return findByPrimaryKey((Serializable)catId);
	}

	/**
	 * Returns the cat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cat
	 * @return the cat, or <code>null</code> if a cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cat fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Cat cat = (Cat)EntityCacheUtil.getResult(CatModelImpl.ENTITY_CACHE_ENABLED,
				CatImpl.class, primaryKey);

		if (cat == _nullCat) {
			return null;
		}

		if (cat == null) {
			Session session = null;

			try {
				session = openSession();

				cat = (Cat)session.get(CatImpl.class, primaryKey);

				if (cat != null) {
					cacheResult(cat);
				}
				else {
					EntityCacheUtil.putResult(CatModelImpl.ENTITY_CACHE_ENABLED,
						CatImpl.class, primaryKey, _nullCat);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CatModelImpl.ENTITY_CACHE_ENABLED,
					CatImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cat;
	}

	/**
	 * Returns the cat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param catId the primary key of the cat
	 * @return the cat, or <code>null</code> if a cat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Cat fetchByPrimaryKey(long catId) throws SystemException {
		return fetchByPrimaryKey((Serializable)catId);
	}

	/**
	 * Returns all the cats.
	 *
	 * @return the cats
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Cat> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Cat> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Cat> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Cat> list = (List<Cat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CAT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CAT;

				if (pagination) {
					sql = sql.concat(CatModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Cat>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Cat>(list);
				}
				else {
					list = (List<Cat>)QueryUtil.list(q, getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cats from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Cat cat : findAll()) {
			remove(cat);
		}
	}

	/**
	 * Returns the number of cats.
	 *
	 * @return the number of cats
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CAT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the cat persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.io.lims.kotlin.service.generated.model.Cat")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Cat>> listenersList = new ArrayList<ModelListener<Cat>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Cat>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CatImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CAT = "SELECT cat FROM Cat cat";
	private static final String _SQL_COUNT_CAT = "SELECT COUNT(cat) FROM Cat cat";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cat.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Cat exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CatPersistenceImpl.class);
	private static Cat _nullCat = new CatImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Cat> toCacheModel() {
				return _nullCatCacheModel;
			}
		};

	private static CacheModel<Cat> _nullCatCacheModel = new CacheModel<Cat>() {
			@Override
			public Cat toEntityModel() {
				return _nullCat;
			}
		};
}