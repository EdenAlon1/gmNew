package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import defpackage.cnfx;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SmsDeliverReceiver extends cnfx {
    private static final cskc h = cskc.g("Bugle", "SmsDeliverReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.e.b()).b("SmsDeliverReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.SmsDeliver.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 8;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.SmsDeliver.Latency";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: all -> 0x0100, LOOP:0: B:26:0x00e4->B:27:0x00e6, LOOP_END, TryCatch #0 {all -> 0x0100, blocks: (B:25:0x00dd, B:27:0x00e6, B:29:0x00f6), top: B:24:0x00dd, outer: #5 }] */
    @Override // defpackage.cnhy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.SmsDeliverReceiver.g(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.incoming_message_foreground_notification_text);
    }
}
