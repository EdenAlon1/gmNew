package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djz extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djz(ffji ffjiVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djz) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r6 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L45
        Ld:
            java.lang.Object r1 = r5.c
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r6)
            goto L27
        L15:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            iju r1 = (defpackage.iju) r1
            r5.c = r1
            r5.a = r2
            java.lang.Object r6 = defpackage.dka.a(r1, r5)
            if (r6 == r0) goto L4f
        L27:
            iku r6 = (defpackage.iku) r6
            r6.b()
            ffji r2 = r5.b
            long r3 = r6.c
            iak r6 = new iak
            r6.<init>(r3)
            r2.invoke(r6)
            r6 = 0
            r5.c = r6
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.dtr.l(r1, r5)
            if (r6 != r0) goto L45
            goto L4f
        L45:
            iku r6 = (defpackage.iku) r6
            if (r6 == 0) goto L4c
            r6.b()
        L4c:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djz djzVar = new djz(this.b, ffguVar);
        djzVar.c = obj;
        return djzVar;
    }
}
