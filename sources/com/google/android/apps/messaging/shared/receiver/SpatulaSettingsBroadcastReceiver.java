package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.axol;
import defpackage.cngb;
import defpackage.cnhj;
import defpackage.cubs;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;
import defpackage.ffkj;
import defpackage.ffsk;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SpatulaSettingsBroadcastReceiver extends cngb {
    public ffbr a;
    public ffbr b;
    public ffbr c;

    @Override // defpackage.cniz
    public final ekzm a() {
        ffbr ffbrVar = this.a;
        if (ffbrVar == null) {
            ffkj.c("traceCreation");
            ffbrVar = null;
        }
        return ((elbx) ffbrVar.b()).b("SpatulaSettingsBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SpatulaSettingsBroadcastReceiver.Latency";
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return null;
    }

    @Override // defpackage.cnhy
    protected final void g(Context context, Intent intent) {
        String stringExtra;
        context.getClass();
        intent.getClass();
        if (!ffkj.e(intent.getAction(), "com.google.android.gms.spatula.settings.core.SPATULA_SETTING_UPDATED") || (stringExtra = intent.getStringExtra("ACCOUNT_NAME")) == null) {
            return;
        }
        ffbr ffbrVar = this.c;
        if (ffbrVar == null) {
            ffkj.c("blockingScope");
            ffbrVar = null;
        }
        Object b = ffbrVar.b();
        b.getClass();
        axol.k((ffsk) b, null, new cnhj(this, stringExtra, null), 3);
    }

    @Override // defpackage.cnhy
    protected final boolean h(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        return cubs.f();
    }
}
