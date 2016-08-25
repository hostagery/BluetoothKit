package com.inuker.bluetooth.library;

import com.inuker.bluetooth.library.connect.IBluetoothApi;
import com.inuker.bluetooth.library.connect.response.BleResponse;

import java.util.UUID;

/**
 * Created by liwentian on 2016/8/25.
 */
public interface IBluetoothClient extends IBluetoothApi {

    void connect(String mac, BleResponse response);

    void disconnect(String mac);

    void read(String mac, UUID service, UUID character, BleResponse response);

    void write(String mac, UUID service, UUID character, byte[] value, BleResponse response);

    void notify(String mac, UUID service, UUID character, BleResponse response);

    void unnotify(String mac, UUID service, UUID character);

    void readRssi(String mac, BleResponse response);
}