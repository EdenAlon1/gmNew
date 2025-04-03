package com.google.android.gms.people.contactssync;

import android.app.Activity;
import android.content.Context;
import defpackage.dhhl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DeviceContactsSync {
    private DeviceContactsSync() {
    }

    public static DeviceContactsSyncClient getClient(Activity activity) {
        return new dhhl(activity);
    }

    public static DeviceContactsSyncClient getClient(Context context) {
        return new dhhl(context);
    }
}
