package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import defpackage.albq;
import defpackage.baon;
import defpackage.bbfw;
import defpackage.cbgf;
import defpackage.cish;
import defpackage.cngd;
import defpackage.cove;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctwb;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class TelephonyChangeReceiver extends cngd {
    private static final cskc c = cskc.g("Bugle", "TelephonyChangeReceiver");
    public ffbr a;
    public ffbr b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.b.b()).b("TelephonyChangeReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.TelephonyChange.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 9;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.TelephonyChange.Latency";
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        csjb d = c.d();
        d.I("onReceive:");
        d.I(intent);
        d.r();
        if ("android.provider.action.EXTERNAL_PROVIDER_CHANGE".equals(action)) {
            baon baonVar = (baon) this.a.b();
            Uri data = intent.getData();
            Context context2 = (Context) baonVar.a.b();
            context2.getClass();
            ctwb ctwbVar = (ctwb) baonVar.d.b();
            ctwbVar.getClass();
            albq albqVar = (albq) baonVar.e.b();
            albqVar.getClass();
            bbfw bbfwVar = (bbfw) baonVar.f.b();
            bbfwVar.getClass();
            cish cishVar = (cish) baonVar.g.b();
            cishVar.getClass();
            cbgf cbgfVar = (cbgf) baonVar.h.b();
            cbgfVar.getClass();
            cove coveVar = (cove) baonVar.i.b();
            coveVar.getClass();
            ffbr ffbrVar = baonVar.k;
            ffbr ffbrVar2 = baonVar.j;
            new ProcessTelephonyChangeAction(context2, baonVar.b, baonVar.c, ctwbVar, albqVar, bbfwVar, cishVar, cbgfVar, coveVar, ffbrVar2, ffbrVar, data).r(this);
        }
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.updating_conversations_foreground_notification_text);
    }
}
