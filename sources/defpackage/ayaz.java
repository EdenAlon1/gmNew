package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayaz extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ayba c;
    final /* synthetic */ ceuw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayaz(ayba aybaVar, ceuw ceuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aybaVar;
        this.d = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayaz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r9 != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0033, code lost:
    
        if (r9 != r0) goto L18;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayaz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ayaz(this.c, this.d, ffguVar);
    }
}
