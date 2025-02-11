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

package com.oef.services.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisPolicy {
    @JsonProperty(value = "rules")
    private ArrayList<DisPolicyBean> rules;

    public DisPolicy() {

    }

    public DisPolicy(ArrayList<DisPolicyBean> rules) {
        this.rules = rules;
    }

    public ArrayList<DisPolicyBean> getRules() {
        return rules;
    }

    public void setRules(ArrayList<DisPolicyBean> rules) {
        this.rules = rules;
    }

    public void addRules(DisPolicyBean rule) {
        if (this.rules == null) {
            this.rules = new ArrayList<DisPolicyBean>();
        }
        this.rules.add(rule);
    }

    @Override
    public String toString() {
        StringBuilder strRules = new StringBuilder();
        if (rules != null) {
            for (DisPolicyBean rule : rules) {
                strRules.append(rule.toString());
                strRules.append("\n");
            }
        }
        return "DisPolicy[" + strRules + "]";
    }
}
