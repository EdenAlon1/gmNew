package com.google.android.gms.people.contactssync;

import android.content.Context;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;
import defpackage.dhre;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface DeviceContactsSyncClient {

    /* compiled from: PG */
    public interface SyncSettingUpdatedListener {
        void onDeviceContactsSyncSettingUpdated();
    }

    dhre<DeviceContactsSyncSetting> getDeviceContactsSyncSetting();

    dhre<Void> launchDeviceContactsSyncSettingActivity(Context context);

    dhre<Void> registerSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);

    dhre<Boolean> unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener syncSettingUpdatedListener);
}
