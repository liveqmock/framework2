/*
 * Copyright (C) 2009 aileron.cc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cc.aileron.accessor;

import java.util.List;

import cc.aileron.commons.instance.InstanceManager;

/**
 * @author Aileron
 * @param <T>
 *            対象
 */
public interface PojoAccessor<T>
{
    /**
     * @param key
     * @return exist
     */
    boolean exist(String key);

    /**
     * @return {@link InstanceManager}
     */
    InstanceManager instanceManager();

    /**
     * @param method
     * @return keys
     */
    List<String> keys(PojoAccessorMethod method);

    /**
     * @param objects
     * @return accessor
     */
    PojoAccessor<?> mixin(Object... objects);

    /**
     * @param method
     * @return set
     */
    Iterable<PojoAccessorValue> set(PojoAccessorMethod method);

    /**
     * @param key
     * @return value
     * @throws PojoAccessorValueNotFoundException
     * @throws PojoPropertiesNotFoundException
     */
    PojoAccessorValue to(String key)
            throws PojoAccessorValueNotFoundException,
            PojoPropertiesNotFoundException;

    /**
     * @return target
     */
    T toTarget();
}
