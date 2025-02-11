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

package com.obs.services.model.select;

/**
 * The type of the expression, currently it only supports SQL statements
 */
public enum ExpressionType {
    SQL("SQL");

    private final String expressionType;

    /**
     * Constructor
     * 
     * @param expressionType
     *          Expression type
     */
    private ExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * Formats the current expression type to a string
     * 
     * @return Expression type as a string
     */
    public String toString() {
        return this.expressionType;
    }
}
