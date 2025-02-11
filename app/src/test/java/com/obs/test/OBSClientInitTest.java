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


package com.obs.test;

import org.junit.Test;

import com.obs.services.ObsClient;
import com.obs.services.ObsConfiguration;
import com.obs.services.SecretFlexibleObsClient;

public class OBSClientInitTest {
    @Test
    public void init_client_1() {
        ObsConfiguration config = new ObsConfiguration();
        config.setSocketTimeout(30000);
        config.setConnectionTimeout(10000);
        config.setEndPoint("test");
        ObsClient client = new ObsClient(config);
    }
    
    @Test
    public void init_client_2() {
        ObsConfiguration config = new ObsConfiguration();
        config.setSocketTimeout(30000);
        config.setConnectionTimeout(10000);
        config.setEndPoint("test");
        SecretFlexibleObsClient client = new SecretFlexibleObsClient(config);
    }
    
    @Test
    public void init_client_3() {
        SecretFlexibleObsClient client = new SecretFlexibleObsClient("endpoint");
    }
}
