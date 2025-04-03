package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpss extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dptb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpss(dptb dptbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dptbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpss) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r4.c.f(r1, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r4.c.e(r1, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Lb
            goto L38
        Lb:
            dptb r4 = r3.b
            fgcm r4 = r4.h
            java.lang.Object r4 = r4.c()
            dptl r4 = (defpackage.dptl) r4
            int r4 = r4.a
            if (r4 != r2) goto L28
            dptb r4 = r3.b
            dpgl r1 = defpackage.dpgl.b
            r3.a = r2
            dpqm r4 = r4.c
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 != r0) goto L38
            goto L37
        L28:
            dptb r4 = r3.b
            dpgl r1 = defpackage.dpgl.b
            r2 = 2
            r3.a = r2
            dpqm r4 = r4.c
            java.lang.Object r4 = r4.f(r1, r3)
            if (r4 != r0) goto L38
        L37:
            return r0
        L38:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpss.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpss(this.b, ffguVar);
    }
}
