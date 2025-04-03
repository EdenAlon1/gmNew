package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofs extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ oft d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofs(oft oftVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = oftVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ofs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (defpackage.ffra.a(r13.j, r4, r12) != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ofs(this.d, ffguVar);
    }
}
