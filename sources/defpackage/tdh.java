package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tdh extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ tdi c;
    final /* synthetic */ fbzt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdh(tdi tdiVar, fbzt fbztVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = tdiVar;
        this.d = fbztVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tdh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0259, code lost:
    
        if (defpackage.fgfz.c(r13, r12) == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f0, code lost:
    
        if (r13 != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ab, code lost:
    
        if (r13 != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0217  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tdh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tdh(this.c, this.d, ffguVar);
    }
}
