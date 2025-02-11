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
 * Set a bucket policy.
 * 
 * @since 3.20.3
 */
public class SetBucketStoragePolicyRequest extends BaseBucketRequest {

    {
        httpMethod = HttpMethodEnum.PUT;
    }

    private BucketStoragePolicyConfiguration bucketStorage;

    public SetBucketStoragePolicyRequest() {
    }

    public SetBucketStoragePolicyRequest(String bucketName) {
        this.bucketName = bucketName;
    }

    public SetBucketStoragePolicyRequest(String bucketName, BucketStoragePolicyConfiguration bucketStorage) {
        this.bucketName = bucketName;
        this.bucketStorage = bucketStorage;
    }

    public BucketStoragePolicyConfiguration getBucketStorage() {
        return bucketStorage;
    }

    public void setBucketStorage(BucketStoragePolicyConfiguration bucketStorage) {
        this.bucketStorage = bucketStorage;
    }

    @Override
    public String toString() {
        return "SetBucketStoragePolicyRequest [bucketStorage=" + bucketStorage + ", getBucketName()=" + getBucketName()
                + ", isRequesterPays()=" + isRequesterPays() + "]";
    }
}
