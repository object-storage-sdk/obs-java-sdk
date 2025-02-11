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

/**
 * 
 * Parameters in an appendable upload request
 * 
 *
 */
public class AppendObjectRequest extends PutObjectRequest {

    protected long position;

    {
        this.httpMethod = HttpMethodEnum.POST;
    }

    public AppendObjectRequest() {
    }

    public AppendObjectRequest(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Obtain the position where data is to be appended.
     * 
     * @return Location where the data is to be appended
     */
    public long getPosition() {
        return position;
    }

    /**
     * Set the position where the data is to be appended.
     * 
     * @param position
     *            Location where the data is to be appended
     */
    public void setPosition(long position) {
        this.position = position;
    }

}
