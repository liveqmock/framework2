/**
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
package cc.aileron.dao.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import cc.aileron.accessor.PojoAccessorValueNotFoundException;
import cc.aileron.accessor.PojoPropertiesNotFoundException;

/**
 * 処理実行時に、シーケンスからナンバが生成された際の ナンバを取得する為のインタフェース
 * 
 * @author Aileron
 * 
 */
public interface G2DaoSerial
{
    /**
     * 生成されたIDを取得し、dtoに設定します
     * 
     * @param statement
     *            PreparedStatement
     * @return 生成されたID
     * @throws SQLException
     * @throws PojoPropertiesNotFoundException
     * @throws PojoAccessorValueNotFoundException
     */
    Long getSerialNumber(PreparedStatement statement)
            throws SQLException, PojoAccessorValueNotFoundException,
            PojoPropertiesNotFoundException;
}