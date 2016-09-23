/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package io.lims.kotlin.service.generated.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import io.lims.kotlin.service.generated.model.Cat;
import io.lims.kotlin.service.generated.service.base.CatLocalServiceBaseImpl;
import org.jetbrains.annotations.Nullable;

/**
 * The implementation of the cat local service.
 * <p>
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link io.lims.kotlin.service.generated.service.CatLocalService} interface.
 * <p>
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Marcel Mika
 * @see io.lims.kotlin.service.generated.service.base.CatLocalServiceBaseImpl
 * @see io.lims.kotlin.service.generated.service.CatLocalServiceUtil
 */
public class CatLocalServiceImpl extends CatLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link io.lims.kotlin.service.generated.service.CatLocalServiceUtil} to access the cat local service.
	 */

    // Log
    private static Log log = LogFactoryUtil.getLog(CatLocalServiceImpl.class);

    /**
     * Creates new cat with the given name
     *
     * @param name String
     * @return Cat
     */
    @Override
    public @Nullable Cat addCat(String name) {
        try {

            // Create primary key
            long catId = counterLocalService.increment(Cat.class.getName());

            // Create new entity
            Cat cat = catPersistence.create(catId);

            // Map properties
            cat.setName(name);

            // Save cat
            super.addCat(cat);

            return cat;

        } catch (SystemException e) {
            log.error(e);

            return null;
        }
    }
}