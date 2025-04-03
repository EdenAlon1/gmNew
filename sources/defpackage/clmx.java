package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clmx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ awxk c;
    final /* synthetic */ clmy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clmx(awxk awxkVar, clmy clmyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = awxkVar;
        this.d = clmyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clmx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clmx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clmx(this.c, this.d, ffguVar);
    }
}
