/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        
        // Services
        attributes.put("0000191a-0000-1000-8000-00805f9b34fb","VOLIAM_SERVICE");
        
        // Characteristics，00 00 00 00 00 00
        attributes.put("00002b23-0000-1000-8000-00805f9b34fb","SYSTEM_ID_UUID");
        
        // 可连接设备地址。保证模块在部署后，只有指定的蓝牙设备才能连接并修改参数。防止模块被恶意连接，并消耗电量。
        attributes.put("00002b24-0000-1000-8000-00805f9b34fb","LOGIN_UUID");
        
        // 当前时间
        attributes.put("00002b25-0000-1000-8000-00805f9b34fb","DATETIME_UUID");
        
        // iBeacon技术中的MajorID,MinorID
        attributes.put("00002b26-0000-1000-8000-00805f9b34fb","MAJOR_UUID");
        attributes.put("00002b27-0000-1000-8000-00805f9b34fb","MINOR_UUID");
        
        attributes.put("00002b28-0000-1000-8000-00805f9b34fb","SOFTWARE_REVISION_UUID");
        
        // 固件版本号
        attributes.put("00002b29-0000-1000-8000-00805f9b34fb","FIRMWARE_REVISION_UUID");
        
        // iBeacon技术中公告时间间隔。可设定在100毫秒~10秒之间。
        attributes.put("00002b2a-0000-1000-8000-00805f9b34fb","ADV_INT_UUID");
        
        //发射功率(TXPower),可设定在65~225之间的值
        attributes.put("00002b2b-0000-1000-8000-00805f9b34fb","TXPOWER_UUID"); 
        
        // 工作时间段设定
        attributes.put("00002b2c-0000-1000-8000-00805f9b34fb","WORK_TIME_UUID");
        
        
        attributes.put("00002b2e-0000-1000-8000-00805f9b34fb","NAME_UUID");
        attributes.put("00002b2f-0000-1000-8000-00805f9b34fb","未识别特征");
        
        // Services
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb","BATTERY_SERVICE");
        //Characteristics，电池电量信息。可读取30~100%的电量值
        attributes.put("00002a19-0000-1000-8000-00805f9b34fb","BATTERY_UUID");


    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
