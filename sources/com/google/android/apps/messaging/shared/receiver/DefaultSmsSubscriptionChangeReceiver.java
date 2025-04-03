package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import defpackage.bavz;
import defpackage.cnfp;
import defpackage.cnjr;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.emuz;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class DefaultSmsSubscriptionChangeReceiver extends cnfp implements cnjr {
    public static final cskc a = cskc.g("Bugle", "DefaultSmsSubscriptionChangeReceiver");
    public elbx b;
    public bavz c;

    public static boolean f() {
        return emuz.e("HUAWEI", Build.MANUFACTURER) || emuz.e("HONOR", Build.MANUFACTURER);
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("DefaultSmsSubscriptionChangeReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.DefaultSubscriptionChanged.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        this.c.b().r(this);
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 12;
    }
}
