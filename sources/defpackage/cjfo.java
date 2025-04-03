package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cjfw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfo(boolean z, cjfw cjfwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = cjfwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r1.r(r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r1.t(r6) == r0) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Lc
            java.lang.Object r0 = r6.d
            goto Le
        Lc:
            java.lang.Object r0 = r6.d
        Le:
            elfl r0 = (defpackage.elfl) r0
            defpackage.ffci.b(r7)
            goto L49
        L14:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.d
            ffsk r7 = (defpackage.ffsk) r7
            cjfw r1 = r6.c
            boolean r3 = r6.b
            cjfn r4 = new cjfn
            r5 = 0
            r4.<init>(r1, r3, r5)
            elfl r7 = defpackage.axol.h(r7, r4)
            boolean r1 = r6.b
            if (r1 != 0) goto L3a
            cjfw r1 = r6.c
            r6.d = r7
            r6.a = r2
            java.lang.Object r1 = r1.r(r6)
            if (r1 != r0) goto L48
            goto L47
        L3a:
            cjfw r1 = r6.c
            r6.d = r7
            r2 = 2
            r6.a = r2
            java.lang.Object r1 = r1.t(r6)
            if (r1 != r0) goto L48
        L47:
            return r0
        L48:
            r0 = r7
        L49:
            cjfw r7 = r6.c
            ffbr r7 = r7.e
            java.lang.Object r7 = r7.b()
            ejvp r7 = (defpackage.ejvp) r7
            ejui r1 = defpackage.cjfw.b
            r7.a(r0, r1)
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjfo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfo cjfoVar = new cjfo(this.b, this.c, ffguVar);
        cjfoVar.d = obj;
        return cjfoVar;
    }
}
