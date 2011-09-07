/*
 * 
 *  Copyright © 2010, 2011 Inadco, Inc. All rights reserved.
 *  
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *  
 *         http://www.apache.org/licenses/LICENSE-2.0
 *  
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *  
 *  
 */
package com.inadco.hbl.api;

import java.io.IOException;
import java.util.List;

/**
 * Cuboid api
 * 
 * @author dmitriy
 * 
 */
public interface Cuboid {

    List<String> getCuboidPath();

    List<Dimension> getCuboidDimenions();

    /**
     * Get cuboids' hbase table name.
     * <P>
     * This rule will be used both in compiler and scanning client, so it better
     * be in the model domain.
     * 
     * @return cuboid's hbase table name.
     */
    String getCuboidTableName() throws IOException;
    
    void setTablePrefix ( String prefix );
    
    int getKeyLen();
    
    // hbase attributes: TTL,
    int getHbaseTTL() ;

    boolean isHbaseInMemory() ;

    int getHbaseMaxVersions() ;

}