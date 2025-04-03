package com.google.android.apps.messaging.shared.alarm;

import android.content.Context;
import android.content.Intent;
import defpackage.akvl;
import defpackage.akvv;
import defpackage.axol;
import defpackage.ekxi;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.enru;
import defpackage.ffbr;
import defpackage.ffhe;
import defpackage.ffkj;
import defpackage.ffra;
import defpackage.ffsk;
import defpackage.ffsm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class BugleAlarmReceiver extends akvv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/alarm/BugleAlarmReceiver");
    public ffbr b;
    public ffbr c;
    public ffbr d;

    @Override // defpackage.cniz
    public final ekzm a() {
        ffbr ffbrVar = this.b;
        if (ffbrVar == null) {
            ffkj.c("traceCreation");
            ffbrVar = null;
        }
        return ((elbx) ffbrVar.b()).b("BugleAlarmReceiver receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.BugleAlarm.Latency";
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.BugleAlarm.Latency";
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        intent.getClass();
        return true;
    }

    @Override // defpackage.cnhy
    protected final elfl j(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ffbr ffbrVar = this.d;
        if (ffbrVar == null) {
            ffkj.c("blockingScope");
            ffbrVar = null;
        }
        Object b = ffbrVar.b();
        b.getClass();
        return axol.a(ffra.b((ffsk) b, ekxi.a(ffhe.a), ffsm.a, new akvl(null, intent, this)));
    }
}
