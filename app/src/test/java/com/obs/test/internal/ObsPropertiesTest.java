/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.obs.test.internal;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.obs.services.internal.ObsProperties;

public class ObsPropertiesTest {
    @Test
    public void test_getBoolProperty() {
        ObsProperties obsProperties = new ObsProperties();
        obsProperties.setProperty("testKey", "true");
        assertTrue(obsProperties.getBoolProperty("testKey", true));
        
        obsProperties.setProperty("testKey", "false");
        assertFalse(obsProperties.getBoolProperty("testKey", true));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_getBoolProperty_IllegalArgumentException() {
        ObsProperties obsProperties = new ObsProperties();
        
        obsProperties.setProperty("testKey", "ff");
        assertFalse(obsProperties.getBoolProperty("testKey", true));
    }
}
