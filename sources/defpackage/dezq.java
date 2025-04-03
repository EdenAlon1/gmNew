package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dezq {
    public final AtomicLong a = new AtomicLong(-1);
    private final emyl b;

    private dezq(final Context context) {
        final dfxg dfxgVar = new dfxg("auth:gau");
        this.b = emys.a(new emyl() { // from class: dezo
            @Override // defpackage.emyl
            public final Object get() {
                return new dfxo(context, dfxgVar);
            }
        });
    }

    public static dezq a(Context context) {
        ecwj.f(context);
        return new dezq(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if ((r2 - r18.a.get()) <= java.util.concurrent.TimeUnit.MINUTES.toMillis(30)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(int r19, int r20, long r21, long r23) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7c
            fdlq r0 = defpackage.fdlq.a     // Catch: java.lang.Throwable -> L7c
            fdlr r0 = r0.get()     // Catch: java.lang.Throwable -> L7c
            double r4 = r0.a()     // Catch: java.lang.Throwable -> L7c
            java.util.Random r0 = new java.util.Random     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            float r0 = r0.nextFloat()     // Catch: java.lang.Throwable -> L7c
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L7c
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L20
            goto L7a
        L20:
            java.util.concurrent.atomic.AtomicLong r0 = r1.a     // Catch: java.lang.Throwable -> L7c
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L7c
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L2d
            goto L41
        L2d:
            java.util.concurrent.atomic.AtomicLong r0 = r1.a     // Catch: java.lang.Throwable -> L7c
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L7c
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L7c
            r6 = 30
            long r6 = r0.toMillis(r6)     // Catch: java.lang.Throwable -> L7c
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L7a
        L41:
            emyl r0 = r1.b     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L7c
            dfxf r0 = (defpackage.dfxf) r0     // Catch: java.lang.Throwable -> L7c
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L7c
            r5 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r5 = new com.google.android.gms.common.internal.MethodInvocation[r5]     // Catch: java.lang.Throwable -> L7c
            com.google.android.gms.common.internal.MethodInvocation r6 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L7c
            r16 = 0
            r17 = -1
            r9 = 0
            r14 = 0
            r15 = 0
            r7 = r19
            r8 = r20
            r10 = r21
            r12 = r23
            r6.<init>(r7, r8, r9, r10, r12, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7c
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L7c
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L7c
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L7c
            dhre r0 = r0.a(r4)     // Catch: java.lang.Throwable -> L7c
            dezp r4 = new dezp     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            r0.t(r4)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r18)
            return
        L7a:
            monitor-exit(r18)
            return
        L7c:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L7c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dezq.b(int, int, long, long):void");
    }
}
