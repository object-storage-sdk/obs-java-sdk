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
 * Request for setting the versioning status of a bucket
 * 
 * @since 3.20.3
 *
 */
public class SetBucketVersioningRequest extends BaseBucketRequest {

    {
        httpMethod = HttpMethodEnum.PUT;
    }

    private VersioningStatusEnum status;

    public SetBucketVersioningRequest() {
    }

    public SetBucketVersioningRequest(String bucketName, VersioningStatusEnum status) {
        this.bucketName = bucketName;
        this.status = status;
    }

    public VersioningStatusEnum getStatus() {
        return status;
    }

    public void setStatus(VersioningStatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SetBucketVersioningRequest [status=" + status + ", getBucketName()=" + getBucketName()
                + ", isRequesterPays()=" + isRequesterPays() + "]";
    }
}
