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
 * Indicates whether to quote fields
 */
public enum QuoteFields {
    ALWAYS("ALWAYS"),
    ASNEEDED("ASNEEDED");

    private final String quoteFieldsType;

    /**
     * Constructor
     * 
     * @param jsonType
     *            Type of field quoting
     */
    private QuoteFields(String quoteFieldsType) {
        this.quoteFieldsType = quoteFieldsType;
    }

    /**
     * Formats the current quoting format to a string
     * 
     * @return File type as a string
     */
    public String toString() {
        return this.quoteFieldsType;
    }
}
