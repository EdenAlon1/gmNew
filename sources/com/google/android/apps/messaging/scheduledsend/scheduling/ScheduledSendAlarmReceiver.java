package com.google.android.apps.messaging.scheduledsend.scheduling;

import android.content.Context;
import android.content.Intent;
import defpackage.akto;
import defpackage.cnvu;
import defpackage.coja;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScheduledSendAlarmReceiver extends akto {
    public ffbr a;
    public ffbr b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.b.b()).b("ScheduledSendAlarmReceiver Receiver broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.ScheduledSendAlarm.Latency";
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.ScheduledSendAlarm.Latency";
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    public final elfl j(Context context, Intent intent) {
        return !((Boolean) cnvu.a.e()).booleanValue() ? elfo.e(null) : ((coja) this.a.b()).g(this);
    }
}
