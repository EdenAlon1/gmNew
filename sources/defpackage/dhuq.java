package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhuq {
    public final AtomicLong a;
    private final dfxf b;

    private dhuq() {
        this.a = new AtomicLong(-1L);
        this.b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if ((r2 - r18.a.get()) > java.util.concurrent.TimeUnit.MINUTES.toMillis(30)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(int r19, long r20, long r22, int r24) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            java.util.concurrent.atomic.AtomicLong r0 = r1.a     // Catch: java.lang.Throwable -> L60
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L60
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L60
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L14
            goto L28
        L14:
            java.util.concurrent.atomic.AtomicLong r0 = r1.a     // Catch: java.lang.Throwable -> L60
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L60
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L60
            r6 = 30
            long r6 = r0.toMillis(r6)     // Catch: java.lang.Throwable -> L60
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L5e
        L28:
            dfxf r0 = r1.b     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L2d
            goto L5e
        L2d:
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L60
            r5 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L60
            com.google.android.gms.common.internal.MethodInvocation r6 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L60
            r15 = 0
            r16 = 0
            r7 = 29813(0x7475, float:4.1777E-41)
            r9 = 0
            r14 = 0
            r8 = r19
            r10 = r20
            r12 = r22
            r17 = r24
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L60
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L60
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L60
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L60
            dhre r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L60
            dhup r4 = new dhup     // Catch: java.lang.Throwable -> L60
            r4.<init>()     // Catch: java.lang.Throwable -> L60
            r0.t(r4)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r18)
            return
        L5e:
            monitor-exit(r18)
            return
        L60:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L60
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhuq.a(int, long, long, int):void");
    }

    public dhuq(Context context) {
        this.a = new AtomicLong(-1L);
        this.b = new dfxo(context, new dfxg("trusted_time"));
    }
}
