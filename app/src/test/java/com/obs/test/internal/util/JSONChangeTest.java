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


package com.obs.test.internal.util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.obs.services.internal.OefExceptionMessage;
import com.obs.services.internal.utils.JSONChange;

public class JSONChangeTest {
    @Test
    public void test_trans_oef_exception_message() {
        String jsonTxt = "{\"code\": \"OEF.0006\", "
                + "\"message\": \"Attribute not found.\", "
                + "\"request_id\": \"test_request_id\"}";
        
        OefExceptionMessage oefException = (OefExceptionMessage) JSONChange
                .jsonToObj(new OefExceptionMessage(), jsonTxt);
        
        assertEquals(oefException.getCode(), "OEF.0006");
        assertEquals(oefException.getMessage(), "Attribute not found.");
        assertEquals(oefException.getRequestId(), "test_request_id");
    }
}
