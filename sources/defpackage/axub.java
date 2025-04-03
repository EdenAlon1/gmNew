package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axub {
    private final cqoh a;
    private final long b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final fgjb g;
    private double h;
    private long i;

    public axub(cqoh cqohVar, int i, Duration duration) {
        this.a = cqohVar;
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (duration.compareTo(Duration.ZERO) < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long a = ernc.a(duration);
        this.b = a;
        double a2 = ernc.a(ernk.g(1)) / i;
        this.c = a2;
        double d = a;
        double d2 = (0.5d * d) / a2;
        this.d = d2;
        double d3 = 3.0d * a2;
        double d4 = ((d + d) / (a2 + d3)) + d2;
        this.e = d4;
        this.f = (d3 - a2) / (d4 - d2);
        this.g = new fgjf();
        this.h = d4;
        Instant f = cqohVar.f();
        f.getClass();
        d(ernd.a(f));
    }

    private final double c(double d) {
        return this.c + (d * this.f);
    }

    private final void d(long j) {
        if (j > this.i) {
            long j2 = this.b;
            double d = this.e;
            this.h = Math.min(d, this.h + ((j - r0) / (j2 / d)));
            this.i = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r7 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.axtz
            if (r0 == 0) goto L13
            r0 = r7
            axtz r0 = (defpackage.axtz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            axtz r0 = new axtz
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.ffci.b(r7)
            goto L43
        L38:
            defpackage.ffci.b(r7)
            r0.d = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 == r1) goto L52
        L43:
            r6 = r7
            j$.time.Duration r6 = (j$.time.Duration) r6
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = defpackage.ernj.a(r6, r0)
            if (r6 != r1) goto L51
            goto L52
        L51:
            return r7
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axub.a(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[Catch: all -> 0x00be, TryCatch #0 {all -> 0x00be, blocks: (B:11:0x0054, B:13:0x007c, B:14:0x0099), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r22, defpackage.ffgu r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof defpackage.axua
            if (r2 == 0) goto L17
            r2 = r0
            axua r2 = (defpackage.axua) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            axua r2 = new axua
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.b
            ffhh r3 = defpackage.ffhh.a
            int r4 = r2.d
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            int r3 = r2.a
            fgjf r4 = r2.f
            axub r2 = r2.e
            defpackage.ffci.b(r0)
            r0 = r3
            goto L54
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            defpackage.ffci.b(r0)
            fgjb r4 = r1.g
            r2.e = r1
            r0 = r4
            fgjf r0 = (defpackage.fgjf) r0
            r2.f = r0
            r0 = r22
            r2.a = r0
            r2.d = r5
            java.lang.Object r2 = r4.a(r6, r2)
            if (r2 == r3) goto Lc4
            r2 = r1
        L54:
            cqoh r3 = r2.a     // Catch: java.lang.Throwable -> Lbe
            j$.time.Instant r3 = r3.f()     // Catch: java.lang.Throwable -> Lbe
            r3.getClass()     // Catch: java.lang.Throwable -> Lbe
            long r7 = defpackage.ernd.a(r3)     // Catch: java.lang.Throwable -> Lbe
            r2.d(r7)     // Catch: java.lang.Throwable -> Lbe
            long r9 = r2.i     // Catch: java.lang.Throwable -> Lbe
            double r11 = (double) r0     // Catch: java.lang.Throwable -> Lbe
            double r13 = r2.h     // Catch: java.lang.Throwable -> Lbe
            double r13 = java.lang.Math.min(r11, r13)     // Catch: java.lang.Throwable -> Lbe
            double r11 = r11 - r13
            r15 = r7
            double r6 = r2.h     // Catch: java.lang.Throwable -> Lbe
            double r0 = r2.d     // Catch: java.lang.Throwable -> Lbe
            double r6 = r6 - r0
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r22 = r0
            if (r22 <= 0) goto L96
            double r17 = java.lang.Math.min(r6, r13)     // Catch: java.lang.Throwable -> Lbe
            double r19 = r2.c(r6)     // Catch: java.lang.Throwable -> Lbe
            double r6 = r6 - r17
            double r5 = r2.c(r6)     // Catch: java.lang.Throwable -> Lbe
            double r19 = r19 + r5
            double r19 = r19 * r17
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r19 / r5
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lbe
            double r7 = r13 - r17
            goto L99
        L96:
            r7 = r13
            r5 = 0
        L99:
            double r0 = r2.c     // Catch: java.lang.Throwable -> Lbe
            double r7 = r7 * r0
            long r7 = (long) r7     // Catch: java.lang.Throwable -> Lbe
            long r5 = r5 + r7
            double r11 = r11 * r0
            long r0 = (long) r11     // Catch: java.lang.Throwable -> Lbe
            long r5 = r5 + r0
            long r0 = r2.i     // Catch: java.lang.Throwable -> Lbe
            long r0 = defpackage.erlc.g(r0, r5)     // Catch: java.lang.Throwable -> Lbe
            r2.i = r0     // Catch: java.lang.Throwable -> Lbe
            double r0 = r2.h     // Catch: java.lang.Throwable -> Lbe
            double r0 = r0 - r13
            r2.h = r0     // Catch: java.lang.Throwable -> Lbe
            long r9 = r9 - r15
            r0 = 0
            long r0 = java.lang.Math.max(r9, r0)     // Catch: java.lang.Throwable -> Lbe
            j$.time.Duration r0 = defpackage.ernk.c(r0)     // Catch: java.lang.Throwable -> Lbe
            r1 = 0
            r4.b(r1)
            return r0
        Lbe:
            r0 = move-exception
            r1 = 0
            r4.b(r1)
            throw r0
        Lc4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axub.b(int, ffgu):java.lang.Object");
    }
}
