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
 * Set event notification for a bucket.
 * 
 * @since 3.20.3
 */
public class SetBucketNotificationRequest extends BaseBucketRequest {

    {
        httpMethod = HttpMethodEnum.PUT;
    }

    private BucketNotificationConfiguration bucketNotificationConfiguration;

    public SetBucketNotificationRequest(String bucketName,
            BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.bucketName = bucketName;
        this.bucketNotificationConfiguration = bucketNotificationConfiguration;
    }

    public BucketNotificationConfiguration getBucketNotificationConfiguration() {
        return bucketNotificationConfiguration;
    }

    public void setBucketNotificationConfiguration(BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.bucketNotificationConfiguration = bucketNotificationConfiguration;
    }

    @Override
    public String toString() {
        return "SetBucketNotificationRequest [bucketNotificationConfiguration=" + bucketNotificationConfiguration
                + ", getBucketName()=" + getBucketName() + ", isRequesterPays()=" + isRequesterPays() + "]";
    }
}
