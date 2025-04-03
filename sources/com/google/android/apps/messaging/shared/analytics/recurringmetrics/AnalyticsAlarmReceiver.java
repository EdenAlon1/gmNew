package com.google.android.apps.messaging.shared.analytics.recurringmetrics;

import android.content.Context;
import android.content.Intent;
import defpackage.alla;
import defpackage.almw;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class AnalyticsAlarmReceiver extends alla {
    public ffbr a;
    public ffbr b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.b.b()).b("AnalyticsAlarmReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.AnalyticsAlarm.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.AnalyticsAlarm.Latency";
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        ((almw) this.a.b()).k(this);
    }
}
