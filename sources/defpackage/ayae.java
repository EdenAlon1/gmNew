package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayae extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ayaf b;
    final /* synthetic */ ceuw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayae(ayaf ayafVar, ceuw ceuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ayafVar;
        this.c = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayae) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r6.a(r5) == r0) goto L26;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayae.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayae(this.b, this.c, ffguVar);
    }
}
