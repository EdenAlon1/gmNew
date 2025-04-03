package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cufd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cufe b;
    final /* synthetic */ eiks c;
    final /* synthetic */ cuep d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cufd(cufe cufeVar, eiks eiksVar, cuep cuepVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cufeVar;
        this.c = eiksVar;
        this.d = cuepVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cufd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        if (r2.a(r3, defpackage.cuen.CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED, r6, r9) == r0) goto L55;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cufd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cufd(this.b, this.c, this.d, ffguVar);
    }
}
