package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axsw extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffkz c;
    final /* synthetic */ ffxy d;
    final /* synthetic */ ffjn e;
    final /* synthetic */ ffkx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsw(ffkz ffkzVar, ffxy ffxyVar, ffjn ffjnVar, ffkx ffkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffkzVar;
        this.d = ffxyVar;
        this.e = ffjnVar;
        this.f = ffkxVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axsw) c(new ffws(((ffws) obj).b), (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (r7.fQ(r1, r6) != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto L11
            java.lang.Object r0 = r6.b
            ffkx r0 = (defpackage.ffkx) r0
            defpackage.ffci.b(r7)
            goto L53
        L11:
            java.lang.Object r1 = r6.b
            defpackage.ffci.b(r7)
            goto L37
        L17:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.b
            ffws r7 = (defpackage.ffws) r7
            java.lang.Object r1 = r7.b
            ffkz r7 = r6.c
            int r3 = r7.a
            int r3 = r3 + r2
            r7.a = r3
            ffxy r7 = r6.d
            boolean r3 = r1 instanceof defpackage.ffwr
            if (r3 != 0) goto L37
            r6.b = r1
            r6.a = r2
            java.lang.Object r7 = r7.fQ(r1, r6)
            if (r7 == r0) goto L56
        L37:
            ffjn r7 = r6.e
            ffxy r3 = r6.d
            ffkx r4 = r6.f
            boolean r5 = r1 instanceof defpackage.ffwq
            if (r5 == 0) goto L5d
            java.lang.Throwable r1 = defpackage.ffws.b(r1)
            if (r1 == 0) goto L57
            r6.b = r4
            r5 = 2
            r6.a = r5
            java.lang.Object r7 = r7.a(r3, r1, r6)
            if (r7 == r0) goto L56
            r0 = r4
        L53:
            r0.a = r2
            goto L57
        L56:
            return r0
        L57:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L5d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axsw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axsw axswVar = new axsw(this.c, this.d, this.e, this.f, ffguVar);
        axswVar.b = obj;
        return axswVar;
    }
}
