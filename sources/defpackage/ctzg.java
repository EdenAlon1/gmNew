package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzg {
    private final ctyx a;

    public ctzg(ctyx ctyxVar) {
        this.a = ctyxVar;
    }

    public final ctzf a(String str) {
        return new ctzf(str, this.a.d(str, 0));
    }

    public final boolean b(ctzf ctzfVar) {
        return c(ctzfVar, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r8 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r8 != 4) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if (r8 == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r8 == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        r8 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.ctzf r7, int r8) {
        /*
            r6 = this;
            int r0 = r7.b
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r8) goto L8
            goto L25
        L8:
            r2 = 0
            r3 = 2
            if (r0 != r1) goto L12
            if (r8 != r3) goto L10
        Le:
            r8 = r3
            goto L25
        L10:
            r1 = r2
            goto L25
        L12:
            if (r0 != r3) goto L17
            if (r8 != r1) goto L10
            goto L25
        L17:
            r4 = 3
            r5 = 4
            if (r0 != r4) goto L20
            if (r8 == r3) goto L25
            if (r8 != r5) goto L10
            goto L25
        L20:
            if (r0 != r5) goto L10
            if (r8 != r3) goto L10
            goto Le
        L25:
            if (r1 == 0) goto L2e
            ctyx r0 = r6.a
            java.lang.String r7 = r7.a
            r0.j(r7, r8)
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctzg.c(ctzf, int):boolean");
    }

    public final boolean d(String str, boolean z) {
        return c(a(str), true != z ? 2 : 1);
    }
}
