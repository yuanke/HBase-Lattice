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
package com.inadco.hbl.client.impl;

/**
 * Slice operation enumeration.
 * <P>
 * 
 * Major things that one can do with slices are to sum up, or to find a
 * complement aggregate of S1\S2.
 * <P>
 * 
 * @author dmitriy
 * 
 */
public enum SliceOperation {
    ADD, COMPLEMENT, IGNORE
}
