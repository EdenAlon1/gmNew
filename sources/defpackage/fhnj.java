package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnj implements fhnv {
    private final fhmv a;
    private final fhmt b;
    private fhnq c;
    private int d;
    private boolean e;
    private long f;

    public fhnj(fhmv fhmvVar) {
        this.a = fhmvVar;
        fhmt fhmtVar = ((fhnp) fhmvVar).b;
        this.b = fhmtVar;
        fhnq fhnqVar = fhmtVar.a;
        this.c = fhnqVar;
        this.d = fhnqVar != null ? fhnqVar.b : -1;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r8 == r9.b) goto L13;
     */
    @Override // defpackage.fhnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.fhmt r7, long r8) {
        /*
            r6 = this;
            boolean r8 = r6.e
            if (r8 != 0) goto L5b
            fhnq r8 = r6.c
            if (r8 == 0) goto L20
            fhmt r9 = r6.b
            fhnq r9 = r9.a
            if (r8 != r9) goto L18
            int r8 = r6.d
            r9.getClass()
            int r9 = r9.b
            if (r8 != r9) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            r7.<init>(r8)
            throw r7
        L20:
            fhmv r8 = r6.a
            long r0 = r6.f
            r2 = 1
            long r0 = r0 + r2
            boolean r8 = r8.E(r0)
            if (r8 != 0) goto L30
            r7 = -1
            return r7
        L30:
            fhnq r8 = r6.c
            if (r8 != 0) goto L40
            fhmt r8 = r6.b
            fhnq r8 = r8.a
            if (r8 == 0) goto L40
            r6.c = r8
            int r8 = r8.b
            r6.d = r8
        L40:
            fhmt r8 = r6.b
            long r8 = r8.b
            long r0 = r6.f
            long r8 = r8 - r0
            fhmt r0 = r6.b
            r1 = 8192(0x2000, double:4.0474E-320)
            long r4 = java.lang.Math.min(r1, r8)
            long r2 = r6.f
            r1 = r7
            r0.H(r1, r2, r4)
            long r7 = r6.f
            long r7 = r7 + r4
            r6.f = r7
            return r4
        L5b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhnj.b(fhmt, long):long");
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }
}
