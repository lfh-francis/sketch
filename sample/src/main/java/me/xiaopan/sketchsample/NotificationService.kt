/*
 * Copyright 2013 Peng fei Pan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.sketchsample

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder

/**
 * 这个 Service 只是为了测试 Sketch 在多进程下的兼容性
 */
class NotificationService : Service() {
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        Handler(mainLooper).postDelayed({ stopSelf() }, (60 * 1000).toLong())
    }
}
