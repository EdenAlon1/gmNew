package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuu(gmk gmkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gmkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fuu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r4.g(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r4.f(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
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
            goto L24
        Lb:
            gmk r4 = r3.b
            boolean r1 = r4.b
            if (r1 != 0) goto L1a
            r3.a = r2
            java.lang.Object r4 = r4.f(r3)
            if (r4 != r0) goto L24
            goto L23
        L1a:
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.g(r3)
            if (r4 != r0) goto L24
        L23:
            return r0
        L24:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fuu(this.b, ffguVar);
    }
}
