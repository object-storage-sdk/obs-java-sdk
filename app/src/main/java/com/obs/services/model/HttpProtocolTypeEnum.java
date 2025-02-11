/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 **/

package com.obs.services.model;

/**
 * HTTP type
 *
 */
public enum HttpProtocolTypeEnum {

    /**
     * HTTP 1.1
     */
    HTTP1_1("http1.1"),
    /**
     * HTTP 2.0
     */
    HTTP2_0("http2.0");

    private String code;

    private HttpProtocolTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static HttpProtocolTypeEnum getValueFromCode(String code) {
        for (HttpProtocolTypeEnum val : HttpProtocolTypeEnum.values()) {
            if (val.code.equals(code)) {
                return val;
            }
        }
        return HTTP1_1;
    }

}