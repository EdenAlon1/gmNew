package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cosn extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cosp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosn(cosp cospVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cospVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cosn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        if (r4 != r1) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a9 A[LOOP:0: B:6:0x00a3->B:8:0x00a9, LOOP_END] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cosn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cosn(this.c, ffguVar);
    }
}
