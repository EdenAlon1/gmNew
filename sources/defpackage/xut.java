package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xut extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ xhm e;
    final /* synthetic */ xuw f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xut(xhm xhmVar, xuw xuwVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = xhmVar;
        this.f = xuwVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xut) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        if (r2 != r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xut.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xut(this.e, this.f, this.g, ffguVar);
    }
}
