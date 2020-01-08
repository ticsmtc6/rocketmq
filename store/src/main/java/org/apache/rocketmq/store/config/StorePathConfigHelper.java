/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.store.config;

import java.io.File;

public class StorePathConfigHelper {

    public static String getStorePathConsumeQueue(final String rootDir) {
        return rootDir + File.separator + "consumequeue";
    }

    /**
     * 默认enableConsumeQueueExt为false,可以不用管这个
     * @param rootDir
     * @return
     */
    public static String getStorePathConsumeQueueExt(final String rootDir) {
        return rootDir + File.separator + "consumequeue_ext";
    }

    public static String getStorePathIndex(final String rootDir) {
        return rootDir + File.separator + "index";
    }

    /**
     * Checkpoint
     * 文件路径store/checkpoint
     * @param rootDir
     * @return
     */
    public static String getStoreCheckpoint(final String rootDir) {
        return rootDir + File.separator + "checkpoint";
    }

    /**
     * 该文件用来检测上次是否正常关闭，如果正常关闭会删除abort文件，非正常关闭则该文件不会被删除
     * 文件路径store/abort
     * @param rootDir
     * @return
     */
    public static String getAbortFile(final String rootDir) {
        return rootDir + File.separator + "abort";
    }

    /**
     * 基于lock文件创建文件锁，确保只会被启动一次
     * 文件路径store/lock
     * @param rootDir
     * @return
     */
    public static String getLockFile(final String rootDir) {
        return rootDir + File.separator + "lock";
    }

    /**
     * 保存延迟队列各个queue的offset(该offset值表示消息条数，相当于ConsumerQueue中的offset(未乘以20))
     * 文件路径store/config/delayOffset.json
     * @param rootDir
     * @return
     */
    public static String getDelayOffsetStorePath(final String rootDir) {
        return rootDir + File.separator + "config" + File.separator + "delayOffset.json";
    }

    public static String getTranStateTableStorePath(final String rootDir) {
        return rootDir + File.separator + "transaction" + File.separator + "statetable";
    }

    public static String getTranRedoLogStorePath(final String rootDir) {
        return rootDir + File.separator + "transaction" + File.separator + "redolog";
    }

}
