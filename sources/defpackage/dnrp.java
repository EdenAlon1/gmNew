package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnrp extends ffhu implements ffjm {
    int a;
    final /* synthetic */ hho b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffkx d;
    final /* synthetic */ ffix e;
    final /* synthetic */ kah f;
    final /* synthetic */ iir g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnrp(hho hhoVar, ffji ffjiVar, ffkx ffkxVar, ffix ffixVar, kah kahVar, iir iirVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = hhoVar;
        this.c = ffjiVar;
        this.d = ffkxVar;
        this.e = ffixVar;
        this.f = kahVar;
        this.g = iirVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnrp) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r11 != r0) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 == r4) goto L11
            defpackage.ffci.b(r11)
            goto L69
        L11:
            java.lang.Object r1 = r10.h
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r11)
            goto L48
        L19:
            java.lang.Object r1 = r10.h
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r11)
            goto L35
        L21:
            defpackage.ffci.b(r11)
            java.lang.Object r11 = r10.h
            iju r11 = (defpackage.iju) r11
            r10.h = r11
            r10.a = r3
            java.lang.Object r1 = defpackage.dtr.g(r11, r2, r10, r4)
            if (r1 == r0) goto Lbd
            r9 = r1
            r1 = r11
            r11 = r9
        L35:
            iku r11 = (defpackage.iku) r11
            long r5 = r11.a
            dnrn r11 = new dnrn
            r11.<init>()
            r10.h = r1
            r10.a = r4
            java.lang.Object r11 = defpackage.doo.e(r1, r5, r11, r10)
            if (r11 == r0) goto Lbd
        L48:
            iku r11 = (defpackage.iku) r11
            if (r11 == 0) goto Lba
            kah r4 = r10.f
            hho r5 = r10.b
            ffkx r6 = r10.d
            iir r7 = r10.g
            ffji r8 = r10.c
            dnro r3 = new dnro
            r3.<init>()
            r10.h = r2
            r2 = 3
            r10.a = r2
            long r4 = r11.a
            java.lang.Object r11 = defpackage.doo.k(r1, r4, r3, r10)
            if (r11 != r0) goto L69
            goto Lbd
        L69:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r0 = 0
            r1 = 0
            if (r11 == 0) goto L97
            hho r11 = r10.b
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.b(r2)
            ffji r11 = r10.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.invoke(r2)
            ffkx r11 = r10.d
            boolean r11 = r11.a
            if (r11 == 0) goto Lba
            ffix r11 = r10.e
            r11.invoke()
            ffkx r11 = r10.d
            r11.a = r0
            goto Lba
        L97:
            hho r11 = r10.b
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.b(r2)
            ffji r11 = r10.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r11.invoke(r2)
            ffkx r11 = r10.d
            boolean r11 = r11.a
            if (r11 == 0) goto Lba
            ffix r11 = r10.e
            r11.invoke()
            ffkx r11 = r10.d
            r11.a = r0
        Lba:
            ffcu r11 = defpackage.ffcu.a
            return r11
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnrp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dnrp dnrpVar = new dnrp(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
        dnrpVar.h = obj;
        return dnrpVar;
    }
}
