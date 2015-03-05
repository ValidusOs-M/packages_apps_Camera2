/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.camera.one.v2;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.util.DisplayMetrics;

import com.android.camera.FatalErrorHandler;
import com.android.camera.SoundPlayer;
import com.android.camera.async.MainThread;
import com.android.camera.burst.BurstFacade;
import com.android.camera.one.OneCamera;
import com.android.camera.one.OneCameraCaptureSetting;
import com.android.camera.one.config.OneCameraFeatureConfig;
import com.android.camera.one.v2.photo.ImageRotationCalculator;
import com.android.camera.util.Size;

public class OneCameraCreator {
    public static OneCamera create(
            CameraDevice device,
            CameraCharacteristics characteristics,
            OneCameraFeatureConfig featureConfig,
            OneCameraCaptureSetting captureSetting,
            DisplayMetrics displayMetrics,
            Context context,
            MainThread mainThread,
            ImageRotationCalculator imageRotationCalculator,
            BurstFacade burstController,
            SoundPlayer soundPlayer,
            FatalErrorHandler fatalErrorHandler) {
        // TODO: Might want to switch current camera to vendor HDR.
        return new OneCameraImpl(device, characteristics, captureSetting.getCaptureSize());
    }
}
