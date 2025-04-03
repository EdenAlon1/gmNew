package com.google.android.apps.messaging.shared.receiver;

import android.content.Intent;
import defpackage.cguo;
import defpackage.cnfm;
import defpackage.cort;
import defpackage.cosz;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.dimn;
import defpackage.djai;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class ConfigSmsReceiver extends cnfm {
    private static final cskc f = cskc.g("Bugle", "ConfigSmsReceiver");
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.b.b()).b("ConfigSmsReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.ConfigSmsReceiver.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 2;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.ConfigSmsReceiver.Latency";
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[LOOP:0: B:40:0x0084->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4 A[Catch: dkvd -> 0x00d0, TryCatch #4 {dkvd -> 0x00d0, blocks: (B:34:0x006f, B:36:0x0079, B:39:0x0080, B:40:0x0084, B:42:0x008a, B:51:0x00b8, B:56:0x00b4, B:64:0x00aa, B:67:0x00c8, B:44:0x0094, B:46:0x0098, B:48:0x009c, B:60:0x00a4, B:61:0x00a9), top: B:33:0x006f, inners: #2 }] */
    @Override // defpackage.cnhy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Context r14, final android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.receiver.ConfigSmsReceiver.g(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    final int m(Intent intent) {
        int intValue;
        if (djai.z() && djai.ab()) {
            int intExtra = intent.getIntExtra("subscription", -1);
            if (intExtra < 0) {
                csjb e = f.e();
                e.I("Invalid/Missing subId in intent.");
                e.y("subId", intExtra);
                e.r();
            }
            int max = Math.max(intExtra, -1);
            try {
                intValue = ((cguo) this.d.b()).c(((cosz) ((cort) this.e.b()).i(max).orElseThrow()).c).k;
                csjb a = f.a();
                a.I("getSmsPort from mobileConfig");
                a.y("expectedPort", intValue);
                a.r();
            } catch (NoSuchElementException unused) {
                csjb e2 = f.e();
                e2.I("no SimSubscriptionInfo found for subId in the intent.");
                e2.y("subId", max);
                e2.r();
                return 0;
            }
        } else {
            intValue = ((Integer) dimn.E().C().a()).intValue();
            csjb a2 = f.a();
            a2.I("getSmsPort from RcsFlags");
            a2.y("expectedPort", intValue);
            a2.r();
        }
        return Math.max(0, intValue);
    }
}
