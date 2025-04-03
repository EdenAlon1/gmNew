package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlck implements dlat {
    public final dlgb a;
    public final dlij b;
    public final ffsd c;
    public final dlib d;
    public final dlas e;
    public final ffsk f;
    public final dlbf g;
    private long h;

    public dlck(dlgb dlgbVar, dlij dlijVar, ffsd ffsdVar, dlbf dlbfVar, dlib dlibVar, dlas dlasVar) {
        dlibVar.getClass();
        this.a = dlgbVar;
        this.b = dlijVar;
        this.c = ffsdVar;
        this.g = dlbfVar;
        this.d = dlibVar;
        this.e = dlasVar;
        this.f = ffsl.b(ffsdVar);
        this.h = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        if (r1 == r3) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    @Override // defpackage.dlat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlck.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dlat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.dlch
            if (r0 == 0) goto L13
            r0 = r10
            dlch r0 = (defpackage.dlch) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlch r0 = new dlch
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            dlck r2 = r0.d
            defpackage.ffci.b(r10)
            goto L4e
        L38:
            defpackage.ffci.b(r10)
            dlib r10 = r9.d
            dlgb r2 = r9.a
            dlia r10 = r10.a(r2)
            r0.d = r9
            r0.c = r4
            java.lang.Object r10 = r10.d(r0)
            if (r10 == r1) goto L6b
            r2 = r9
        L4e:
            java.lang.Long r10 = (java.lang.Long) r10
            r4 = 0
            if (r10 == 0) goto L6a
            long r5 = r10.longValue()
            long r7 = r2.h
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L5e
            goto L6a
        L5e:
            r0.d = r4
            r0.c = r3
            java.lang.Object r10 = r2.a(r0)
            if (r10 != r1) goto L69
            goto L6b
        L69:
            return r10
        L6a:
            return r4
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlck.b(ffgu):java.lang.Object");
    }
}
