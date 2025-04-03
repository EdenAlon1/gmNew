package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exq {
    public final jpg a;
    public ioc b = null;
    public ioc c;

    public exq(jpg jpgVar, ioc iocVar) {
        this.a = jpgVar;
        this.c = iocVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long f(long r7) {
        /*
            r6 = this;
            ioc r0 = r6.b
            if (r0 == 0) goto L19
            boolean r1 = r0.t()
            if (r1 == 0) goto L15
            ioc r1 = r6.c
            if (r1 == 0) goto L13
            iam r0 = defpackage.iob.a(r1, r0)
            goto L17
        L13:
            r0 = 0
            goto L17
        L15:
            iam r0 = defpackage.iam.a
        L17:
            if (r0 != 0) goto L1b
        L19:
            iam r0 = defpackage.iam.a
        L1b:
            r1 = 32
            long r2 = r7 >> r1
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r4 = r0.b
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2b
            goto L3c
        L2b:
            float r3 = r0.d
            float r4 = java.lang.Float.intBitsToFloat(r2)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L38
            float r4 = r0.d
            goto L3c
        L38:
            float r4 = java.lang.Float.intBitsToFloat(r2)
        L3c:
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            float r5 = r0.c
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L50
            float r7 = r0.c
            goto L61
        L50:
            float r8 = r0.e
            float r5 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L5d
            float r7 = r0.e
            goto L61
        L5d:
            float r7 = java.lang.Float.intBitsToFloat(r7)
        L61:
            int r8 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            long r0 = r4 << r1
            long r7 = r7 & r2
            long r7 = r7 | r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exq.f(long):long");
    }

    public final int a(long j, boolean z) {
        if (z) {
            j = f(j);
        }
        return this.a.k(b(j));
    }

    public final long b(long j) {
        ioc iocVar;
        ioc iocVar2 = this.b;
        if (iocVar2 == null) {
            return j;
        }
        if (true != iocVar2.t()) {
            iocVar2 = null;
        }
        if (iocVar2 == null || (iocVar = this.c) == null) {
            return j;
        }
        ioc iocVar3 = true == iocVar.t() ? iocVar : null;
        return iocVar3 != null ? iocVar2.h(iocVar3, j) : j;
    }

    public final long c(long j) {
        ioc iocVar;
        ioc iocVar2 = this.b;
        if (iocVar2 == null) {
            return j;
        }
        if (true != iocVar2.t()) {
            iocVar2 = null;
        }
        if (iocVar2 == null || (iocVar = this.c) == null) {
            return j;
        }
        ioc iocVar3 = true == iocVar.t() ? iocVar : null;
        return iocVar3 != null ? iocVar3.h(iocVar2, j) : j;
    }

    public final boolean d(long j) {
        long b = b(f(j));
        int i = this.a.i(Float.intBitsToFloat((int) (4294967295L & b)));
        int i2 = (int) (b >> 32);
        if (Float.intBitsToFloat(i2) >= this.a.c(i)) {
            return Float.intBitsToFloat(i2) <= this.a.d(i);
        }
        return false;
    }
}
