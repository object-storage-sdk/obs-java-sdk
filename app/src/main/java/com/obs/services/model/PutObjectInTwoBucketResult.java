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

import com.obs.services.exception.ObsException;

public class PutObjectInTwoBucketResult {
    private PutObjectResult mainBucketResult;
    private PutObjectResult backupBucketResult;
    private ObsException mainBucketException;
    private ObsException backupBucketException;

    public PutObjectResult getMainBucketResult() {
        return mainBucketResult;
    }

    public void setMainBucketResult(PutObjectResult mainBucketResult) {
        this.mainBucketResult = mainBucketResult;
    }

    public PutObjectResult getBackupBucketResult() {
        return backupBucketResult;
    }

    public void setBackupBucketResult(PutObjectResult backupBucketResult) {
        this.backupBucketResult = backupBucketResult;
    }

    public ObsException getMainBucketException() {
        return mainBucketException;
    }

    public void setMainBucketException(ObsException mainBucketException) {
        this.mainBucketException = mainBucketException;
    }

    public ObsException getBackupBucketException() {
        return backupBucketException;
    }

    public void setBackupBucketException(ObsException backupBucketException) {
        this.backupBucketException = backupBucketException;
    }
}
