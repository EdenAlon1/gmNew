package com.google.android.apps.messaging.shared.simstatetracker;

import android.content.Context;
import android.content.Intent;
import defpackage.akzt;
import defpackage.axol;
import defpackage.copx;
import defpackage.copz;
import defpackage.cosh;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.enru;
import defpackage.ffbr;
import defpackage.ffhe;
import defpackage.ffkj;
import defpackage.ffsk;
import defpackage.ffsm;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class AsyncTelephonySimStateReceiver extends copz {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/simstatetracker/AsyncTelephonySimStateReceiver");
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;

    @Override // defpackage.cniz
    public final ekzm a() {
        ffbr ffbrVar = this.b;
        if (ffbrVar == null) {
            ffkj.c("traceCreation");
            ffbrVar = null;
        }
        return ((elbx) ffbrVar.b()).b("AsyncTelephonySimStateReceiver receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.AsyncTelephonySimStateReceiver.Latency";
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.AsyncTelephonySimStateReceiver.Latency";
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        intent.getClass();
        return false;
    }

    @Override // defpackage.cnhy
    protected final elfl j(Context context, Intent intent) {
        elfl c;
        context.getClass();
        intent.getClass();
        ffbr ffbrVar = this.c;
        if (ffbrVar == null) {
            ffkj.c("blockingScope");
            ffbrVar = null;
        }
        Object b = ffbrVar.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new copx(this, intent, null));
        return c;
    }

    public final ffbr m() {
        ffbr ffbrVar = this.d;
        if (ffbrVar != null) {
            return ffbrVar;
        }
        ffkj.c("simStateScheduler");
        return null;
    }

    public final void n(int i) {
        ffbr ffbrVar = this.e;
        if (ffbrVar == null) {
            ffkj.c("countersUtil");
            ffbrVar = null;
        }
        ((akzt) ((cosh) ffbrVar.b()).a.b()).e("Bugle.Dsdr.AsyncTelephonySimStateReceiver", i - 1);
    }
}
