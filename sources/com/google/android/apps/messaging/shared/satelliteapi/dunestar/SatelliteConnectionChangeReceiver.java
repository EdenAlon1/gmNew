package com.google.android.apps.messaging.shared.satelliteapi.dunestar;

import android.content.Context;
import android.content.Intent;
import defpackage.axol;
import defpackage.cnon;
import defpackage.cnpa;
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
/* loaded from: classes8.dex */
public final class SatelliteConnectionChangeReceiver extends cnon {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionChangeReceiver");
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
        return ((elbx) ffbrVar.b()).b("SatelliteConnectionChangeReceiver receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SatelliteConnectionChange.Latency";
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.SatelliteConnectionChange.Latency";
    }

    @Override // defpackage.cnhy
    protected final elfl j(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ffbr ffbrVar = this.d;
        if (ffbrVar == null) {
            ffkj.c("lightweightExecutor");
            ffbrVar = null;
        }
        Object b = ffbrVar.b();
        b.getClass();
        return axol.a(ffra.b((ffsk) b, ekxi.a(ffhe.a), ffsm.a, new cnpa(null, intent, this)));
    }

    public final ffbr m() {
        ffbr ffbrVar = this.c;
        if (ffbrVar != null) {
            return ffbrVar;
        }
        ffkj.c("tikTokWorkManager");
        return null;
    }
}
