package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import defpackage.a;
import defpackage.bdtd;
import defpackage.cins;
import defpackage.csjy;
import defpackage.ctvb;
import defpackage.ctwb;
import defpackage.cwwl;
import defpackage.cxfw;
import defpackage.cxfx;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SimFullReceiver extends cwwl {
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.c.b()).b("SimFullReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        if ("android.provider.Telephony.SIM_FULL".equals(intent.getAction())) {
            int a = ((ctwb) this.a.b()).h(intent.getIntExtra("subscription", -1)).a();
            csjy.i("Bugle", a.f(a, "SIM ", " storage full"));
            if (((ctvb) this.b.b()).K()) {
                cxfx cxfxVar = (cxfx) this.d.b();
                Resources resources = context.getResources();
                ctwb ctwbVar = (ctwb) cxfxVar.a.b();
                ctwbVar.getClass();
                bdtd bdtdVar = (bdtd) cxfxVar.b.b();
                bdtdVar.getClass();
                cins cinsVar = (cins) cxfxVar.c.b();
                cinsVar.getClass();
                resources.getClass();
                new cxfw(ctwbVar, bdtdVar, cinsVar, resources, a).e(new Void[0]);
            }
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 16;
    }
}
