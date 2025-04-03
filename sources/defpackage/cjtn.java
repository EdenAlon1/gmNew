package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjtn implements cjsx {
    public static final String a = new String();
    public final effy b;
    public final errm c;
    private final ffhd d;

    public cjtn(effy effyVar, errm errmVar, ffhd ffhdVar) {
        effyVar.getClass();
        errmVar.getClass();
        ffhdVar.getClass();
        this.b = effyVar;
        this.c = errmVar;
        this.d = ffhdVar;
    }

    @Override // defpackage.cjsx
    public final Object a(String str, String str2, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new cjsy(null, this, str, str2), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjsx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cjtb
            if (r0 == 0) goto L13
            r0 = r6
            cjtb r0 = (defpackage.cjtb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjtb r0 = new cjtb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.d
            ffhd r6 = defpackage.ekxi.a(r6)
            cjta r2 = new cjta
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjtn.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.cjsx
    public final Object c(ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new cjtc(null, this), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.cjsx
    public final Object d(ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new cjte(null, this), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.cjsx
    public final Object e(String str, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new cjtg(null, this, str), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.cjsx
    public final Object f(eyja eyjaVar, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new cjtj(null, this, eyjaVar), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.cjsx
    public final Object g(String str, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.d), new cjtl(null, this, str), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }
}
