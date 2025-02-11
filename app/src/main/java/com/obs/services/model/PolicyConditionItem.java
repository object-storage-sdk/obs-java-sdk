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
**/

package com.obs.services.model;

public class PolicyConditionItem {

    private ConditionOperator operator;

    private String key;

    private String value;

    public PolicyConditionItem(ConditionOperator operator, String key, String value) {
        this.operator = operator;
        this.key = key;
        this.value = value;
    }

    public String toString() {
        if (null == value) {
            value = "";
        }
        return String.format("[\"%s\",\"$%s\",\"%s\"]", operator.getOperationCode(), key, value);
    }

    public static enum ConditionOperator {

        EQUAL("eq"),

        STARTS_WITH("starts-with");

        private String operationCode;

        private ConditionOperator(String operationCode) {
            this.operationCode = operationCode;
        }

        public String getOperationCode() {
            return this.operationCode;
        }
    }
}
