package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvrx extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cvsa d;
    final /* synthetic */ aoku e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvrx(cvsa cvsaVar, aoku aokuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = cvsaVar;
        this.e = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvrx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r2.a(r1, (defpackage.aqux) r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L3c
        Ld:
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.ffci.b(r5)
            goto L2b
        L15:
            defpackage.ffci.b(r5)
            cvsa r5 = r4.d
            aoku r1 = r4.e
            cwde r3 = r5.c
            r4.a = r3
            r4.b = r1
            r4.c = r2
            java.lang.Object r5 = r5.d()
            if (r5 == r0) goto L3f
            r2 = r3
        L2b:
            aqux r5 = (defpackage.aqux) r5
            r3 = 0
            r4.a = r3
            r4.b = r3
            r3 = 2
            r4.c = r3
            java.lang.Object r5 = r2.a(r1, r5, r4)
            if (r5 != r0) goto L3c
            goto L3f
        L3c:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvrx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvrx(this.d, this.e, ffguVar);
    }
}
