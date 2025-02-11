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

package com.obs.services.model;

/**
*
* Keyword for replicating historical objects. If the value is Enabled, 
* historical objects that meet the rule are replicated.
*
*/
public enum HistoricalObjectReplicationEnum {
    /**
     * Enable the rule.
     */
    ENABLED("Enabled"),

    /**
     * Disable the rule.
     */
    DISABLED("Disabled");

    private String code;

    private HistoricalObjectReplicationEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static HistoricalObjectReplicationEnum getValueFromCode(String code) {
        for (HistoricalObjectReplicationEnum val : HistoricalObjectReplicationEnum.values()) {
            if (val.code.equals(code)) {
                return val;
            }
        }
        return null;
    }
}
