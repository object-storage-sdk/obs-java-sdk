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
 * Configure CORS for a bucket.
 * 
 * @since 3.20.3
 */
public class SetBucketCorsRequest extends BaseBucketRequest {

    {
        httpMethod = HttpMethodEnum.PUT;
    }

    private BucketCors bucketCors;

    public SetBucketCorsRequest(String bucketName, BucketCors bucketCors) {
        this.bucketName = bucketName;
        this.bucketCors = bucketCors;
    }

    public BucketCors getBucketCors() {
        return bucketCors;
    }

    public void setBucketCors(BucketCors bucketCors) {
        this.bucketCors = bucketCors;
    }

    @Override
    public String toString() {
        return "SetBucketCorsRequest [bucketCors=" + bucketCors + ", getBucketName()=" + getBucketName()
                + ", isRequesterPays()=" + isRequesterPays() + "]";
    }
}
