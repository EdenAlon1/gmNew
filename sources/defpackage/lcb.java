package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lcb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffkz c;
    final /* synthetic */ lcc d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcb(ffkz ffkzVar, lcc lccVar, Object obj, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffkzVar;
        this.d = lccVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lcb) c((lcq) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r6 == r0) goto L24;
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
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L60
        Ld:
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.g
            lcq r2 = (defpackage.lcq) r2
            defpackage.ffci.b(r6)
            goto L35
        L17:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.g
            lcq r6 = (defpackage.lcq) r6
            ffkz r1 = r5.c
            lcc r3 = r5.d
            lcs r3 = r3.c()
            r5.g = r6
            r5.a = r1
            r5.b = r2
            java.lang.Object r2 = r3.e()
            if (r2 == r0) goto L81
            r4 = r2
            r2 = r6
            r6 = r4
        L35:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            ffkz r1 = (defpackage.ffkz) r1
            r1.a = r6
            java.lang.Object r6 = r5.e
            r1 = 0
            r5.g = r1
            r5.a = r1
            r3 = 2
            r5.b = r3
            r2.c()
            lcp r3 = new lcp
            r3.<init>(r2, r6, r1)
            java.io.File r6 = r2.a
            java.lang.Object r6 = defpackage.lco.a(r6, r3, r5)
            ffhh r1 = defpackage.ffhh.a
            if (r6 == r1) goto L5d
            ffcu r6 = defpackage.ffcu.a
        L5d:
            if (r6 != r0) goto L60
            goto L81
        L60:
            boolean r6 = r5.f
            if (r6 == 0) goto L7e
            lcc r6 = r5.d
            java.lang.Object r0 = r5.e
            lah r1 = new lah
            if (r0 == 0) goto L71
            int r2 = r0.hashCode()
            goto L72
        L71:
            r2 = 0
        L72:
            lcd r6 = r6.c
            ffkz r3 = r5.c
            int r3 = r3.a
            r1.<init>(r0, r2, r3)
            r6.b(r1)
        L7e:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lcb lcbVar = new lcb(this.c, this.d, this.e, this.f, ffguVar);
        lcbVar.g = obj;
        return lcbVar;
    }
}
