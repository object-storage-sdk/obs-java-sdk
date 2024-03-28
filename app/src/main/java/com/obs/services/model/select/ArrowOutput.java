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

import com.obs.services.internal.xml.OBSXMLBuilder;

/**
 * Arrow output serialization format
 */
public class ArrowOutput extends XmlSerialization {
    /**
     * Formats the output settings into the XML request
     * 
     * @param xmlBuilder
     *              The xml serializer
     */
    @Override
    public void appendToXml(OBSXMLBuilder xmlBuilder) {
        xmlBuilder.elem("Arrow");
    }
}
