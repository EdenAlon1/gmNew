package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.badx;
import defpackage.cnge;
import defpackage.ctid;
import defpackage.ekzm;
import defpackage.elbx;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class WapPushSiExpiringEventReceiver extends cnge {
    public elbx a;
    public badx b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.a.b("WapPushSiExpiringEventReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.WapPushSiExpiring.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        if (ctid.i(context)) {
            this.b.a().r(this);
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
