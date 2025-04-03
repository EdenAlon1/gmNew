package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cadl extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cadm c;
    final /* synthetic */ fbzt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cadl(cadm cadmVar, fbzt fbztVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cadmVar;
        this.d = fbztVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cadl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a9, code lost:
    
        if (defpackage.fgfz.c(r11, r10) == r4) goto L26;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cadl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cadl(this.c, this.d, ffguVar);
    }
}
