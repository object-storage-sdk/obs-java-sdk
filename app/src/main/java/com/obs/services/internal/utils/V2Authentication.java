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

package com.obs.services.internal.utils;

import com.obs.services.internal.IHeaders;
import com.obs.services.internal.V2Headers;

public class V2Authentication extends AbstractAuthentication {

    private static V2Authentication instance = new V2Authentication();

    private V2Authentication() {

    }

    public static AbstractAuthentication getInstance() {
        return instance;
    }

    @Override
    protected IHeaders getIHeaders() {
        return V2Headers.getInstance();
    }

    @Override
    protected String getAuthPrefix() {
        return "AWS";
    }

}
