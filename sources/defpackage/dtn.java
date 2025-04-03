package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffud b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtn(ffud ffudVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffudVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r4.a(r1, r3) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r4.o(r3) != r0) goto L9;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L38
        Ld:
            java.lang.Object r1 = r3.d
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r4)
            goto L29
        L15:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.d
            r1 = r4
            ffsk r1 = (defpackage.ffsk) r1
            ffud r4 = r3.b
            r3.d = r1
            r3.a = r2
            java.lang.Object r4 = r4.o(r3)
            if (r4 == r0) goto L3b
        L29:
            ffjm r4 = r3.c
            r2 = 0
            r3.d = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.a(r1, r3)
            if (r4 != r0) goto L38
            goto L3b
        L38:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtn dtnVar = new dtn(this.b, this.c, ffguVar);
        dtnVar.d = obj;
        return dtnVar;
    }
}
