package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjsx b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ eyja f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjsm(ffgu ffguVar, cjsx cjsxVar, String str, String str2, String str3, eyja eyjaVar) {
        super(2, ffguVar);
        this.b = cjsxVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = eyjaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjsm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r6.f(r1, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r6.g(r1, r5) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r6.a(r1, r4, r5) != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 == r2) goto L10
            defpackage.ffci.b(r6)
            goto L50
        L10:
            defpackage.ffci.b(r6)
            goto L42
        L14:
            defpackage.ffci.b(r6)
            goto L2d
        L18:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.g
            ffsk r6 = (defpackage.ffsk) r6
            cjsx r6 = r5.b
            java.lang.String r1 = r5.c
            java.lang.String r4 = r5.d
            r5.a = r3
            java.lang.Object r6 = r6.a(r1, r4, r5)
            if (r6 == r0) goto L53
        L2d:
            cjsx r6 = r5.b
            java.lang.String r1 = defpackage.cjsn.a
            java.lang.String r1 = r5.e
            if (r1 != 0) goto L3a
            java.lang.String r1 = new java.lang.String
            r1.<init>()
        L3a:
            r5.a = r2
            java.lang.Object r6 = r6.g(r1, r5)
            if (r6 == r0) goto L53
        L42:
            cjsx r6 = r5.b
            eyja r1 = r5.f
            r2 = 3
            r5.a = r2
            java.lang.Object r6 = r6.f(r1, r5)
            if (r6 != r0) goto L50
            goto L53
        L50:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjsm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjsm cjsmVar = new cjsm(ffguVar, this.b, this.c, this.d, this.e, this.f);
        cjsmVar.g = obj;
        return cjsmVar;
    }
}
