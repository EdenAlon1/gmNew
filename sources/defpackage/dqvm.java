package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqvm extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dqvo c;
    final /* synthetic */ String d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqvm(dqvo dqvoVar, String str, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqvoVar;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqvm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0024, code lost:
    
        if (r10 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r9.a
            defpackage.ffci.b(r10)
            goto L47
        Lf:
            defpackage.ffci.b(r10)
            goto L26
        L13:
            defpackage.ffci.b(r10)
            dqvo r10 = r9.c
            java.lang.String r1 = r9.d
            dqok r10 = r10.a()
            r9.b = r2
            java.lang.Object r10 = r10.d(r1, r9)
            if (r10 == r0) goto L8b
        L26:
            dqof r10 = (defpackage.dqof) r10
            if (r10 != 0) goto L32
            java.lang.String r10 = r9.d
            dqnr r1 = new dqnr
            r1.<init>(r10)
            r10 = r1
        L32:
            dqvo r1 = r9.c
            java.lang.String r2 = r9.d
            dqok r1 = r1.a()
            r9.a = r10
            r3 = 2
            r9.b = r3
            java.lang.Object r1 = r1.e(r2, r9)
            if (r1 == r0) goto L8b
            r0 = r10
            r10 = r1
        L47:
            dqqj r10 = (defpackage.dqqj) r10
            if (r10 != 0) goto L57
            dqqh r10 = new dqqh
            r1 = r0
            dqof r1 = (defpackage.dqof) r1
            dqns r1 = r1.b()
            r10.<init>(r1)
        L57:
            r3 = r10
            dqvo r10 = r9.c
            ffix r10 = r10.bE()
            java.lang.Object r10 = r10.invoke()
            dqls r10 = (defpackage.dqls) r10
            dqmn r10 = r10.a
            dqvo r1 = r9.c
            dqwj r1 = r1.ah
            if (r1 == 0) goto L76
            java.lang.String r1 = r1.i
            if (r1 == 0) goto L76
            dqrn r2 = new dqrn
            r2.<init>(r1)
            goto L78
        L76:
            dqrk r2 = defpackage.dqrk.a
        L78:
            r6 = r2
            boolean r7 = r9.e
            dqrp r2 = new dqrp
            r4 = r0
            dqof r4 = (defpackage.dqof) r4
            r5 = 0
            r8 = 4
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.f(r2)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqvm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqvm(this.c, this.d, this.e, ffguVar);
    }
}
