package com.google.android.libraries.mdi.download.workmanager.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dwub;
import defpackage.elfr;
import defpackage.emwl;
import defpackage.erog;
import defpackage.erqt;
import defpackage.errl;
import defpackage.pot;
import defpackage.ppn;
import defpackage.ppr;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PeriodicWorker extends ppr {
    public final dwub e;
    private final Executor f;

    public PeriodicWorker(Context context, WorkerParameters workerParameters, dwub dwubVar, errl errlVar) {
        super(context, workerParameters);
        this.e = dwubVar;
        this.f = errlVar;
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        Log.d("MddPeriodicWorker", "PeriodicWorker: startWork");
        final pot f = f();
        final String d = f.d("MDD_TASK_TAG_KEY");
        if (d != null) {
            return elfr.j(elfr.i(new erog() { // from class: dycr
                /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        r11 = this;
                        pot r0 = r3
                        java.lang.String r1 = "MDD_TASK_PERIOD_HOURS_KEY"
                        r2 = -1
                        long r5 = r0.b(r1, r2)
                        int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                        java.lang.String r2 = "MddPeriodicWorker"
                        if (r1 != 0) goto L19
                        java.lang.String r0 = "can't find MDD task info"
                        android.util.Log.w(r2, r0)
                        emux r0 = defpackage.emux.a
                        goto L88
                    L19:
                        java.lang.String r1 = "MDD_TASK_NETWORK_STATE_KEY"
                        java.lang.String r1 = r0.d(r1)
                        if (r1 != 0) goto L29
                        java.lang.String r0 = "can't find MDD task network state"
                        android.util.Log.e(r2, r0)
                        emux r0 = defpackage.emux.a
                        goto L88
                    L29:
                        int r2 = r1.hashCode()
                        r3 = -553837936(0xffffffffdefd1a90, float:-9.119024E18)
                        r4 = 2
                        r7 = 1
                        if (r2 == r3) goto L53
                        r3 = 494669930(0x1d7c106a, float:3.3360408E-21)
                        if (r2 == r3) goto L49
                        r3 = 534741005(0x1fdf800d, float:9.4656016E-20)
                        if (r2 == r3) goto L3f
                        goto L5d
                    L3f:
                        java.lang.String r2 = "NETWORK_STATE_ANY"
                        boolean r1 = r1.equals(r2)
                        if (r1 == 0) goto L5d
                        r1 = r4
                        goto L5e
                    L49:
                        java.lang.String r2 = "NETWORK_STATE_CONNECTED"
                        boolean r1 = r1.equals(r2)
                        if (r1 == 0) goto L5d
                        r1 = 0
                        goto L5e
                    L53:
                        java.lang.String r2 = "NETWORK_STATE_UNMETERED"
                        boolean r1 = r1.equals(r2)
                        if (r1 == 0) goto L5d
                        r1 = r7
                        goto L5e
                    L5d:
                        r1 = -1
                    L5e:
                        if (r1 == 0) goto L6d
                        if (r1 == r7) goto L6c
                        if (r1 != r4) goto L66
                        r4 = 3
                        goto L6c
                    L66:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        r0.<init>()
                        throw r0
                    L6c:
                        r7 = r4
                    L6d:
                        java.lang.String r1 = "MDD_TASK_REQUIRES_BATTERY_NOT_LOW_KEY"
                        boolean r8 = r0.h(r1)
                        java.lang.String r1 = "MDD_TASK_REQUIRES_CHARGING_KEY"
                        boolean r9 = r0.h(r1)
                        java.lang.String r1 = "MDD_TASK_REQUIRES_DEVICE_IDLE_KEY"
                        boolean r10 = r0.h(r1)
                        dwoo r4 = new dwoo
                        r4.<init>(r5, r7, r8, r9, r10)
                        emxc r0 = defpackage.emxc.j(r4)
                    L88:
                        com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker r1 = com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker.this
                        java.lang.String r2 = r2
                        dwub r1 = r1.e
                        com.google.common.util.concurrent.ListenableFuture r0 = r1.m(r2, r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dycr.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.f), new emwl() { // from class: dycs
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return new ppp();
                }
            }, this.f);
        }
        Log.e("MddPeriodicWorker", "can't find MDD task tag");
        return erqt.i(new ppn());
    }
}
