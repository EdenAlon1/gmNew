package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmig extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cmii c;
    final /* synthetic */ cmip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmig(cmii cmiiVar, cmip cmipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cmiiVar;
        this.d = cmipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmig) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        if (r6 != r0) goto L11;
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
            int r1 = r5.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 == r3) goto L11
            defpackage.ffci.b(r6)
            goto L51
        L11:
            java.lang.Object r1 = r5.a
            defpackage.ffci.b(r6)
            goto L39
        L17:
            defpackage.ffci.b(r6)
            goto L28
        L1b:
            defpackage.ffci.b(r6)
            cmii r6 = r5.c
            r5.b = r4
            java.lang.Object r6 = r6.i(r5)
            if (r6 == r0) goto L52
        L28:
            cmii r1 = r5.c
            cmip r4 = r5.d
            cmip r6 = (defpackage.cmip) r6
            r5.a = r6
            r5.b = r3
            java.lang.Object r1 = r1.y(r4, r5)
            if (r1 == r0) goto L52
            r1 = r6
        L39:
            cmip r6 = defpackage.cmip.TOGGLE_STATE_AUTOMATICALLY_DISABLED
            if (r1 != r6) goto L51
            cmip r6 = r5.d
            cmip r1 = defpackage.cmip.TOGGLE_STATE_ENABLED
            if (r6 != r1) goto L51
            cmii r6 = r5.c
            r5.a = r2
            r1 = 3
            r5.b = r1
            java.lang.Object r6 = r6.q(r5)
            if (r6 != r0) goto L51
            goto L52
        L51:
            return r2
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmig.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmig(this.c, this.d, ffguVar);
    }
}
