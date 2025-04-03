package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.cjcr;
import defpackage.cnfy;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctid;
import defpackage.ctvb;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class SmsReceiver extends cnfy {
    private static final cskc d = cskc.g("Bugle", "SmsReceiver");
    public ffbr a;
    public elbx b;
    public ffbr c;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("SmsReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SmsReceiver.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        cskc cskcVar = d;
        csjb d2 = cskcVar.d();
        d2.I("onReceive");
        d2.I(intent);
        d2.r();
        if (((ctvb) this.a.b()).K()) {
            String action = intent.getAction();
            if (ctid.h(context)) {
                if ("android.provider.Telephony.SMS_RECEIVED".equals(action) || "android.provider.Telephony.MMS_DOWNLOADED".equals(action)) {
                    cskcVar.p("Received sms");
                    ((cjcr) this.c.b()).a();
                }
            }
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 1;
    }
}
