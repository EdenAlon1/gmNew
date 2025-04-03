package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmid extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ djrm c;
    final /* synthetic */ cmis d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmid(cmii cmiiVar, djrm djrmVar, cmis cmisVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = djrmVar;
        this.d = cmisVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmid) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r5.x(r1, r3, r4) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r5.p(r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            goto L2d
        Ld:
            cmii r5 = r4.b
            djrm r1 = r4.c
            cmis r3 = r4.d
            r4.a = r2
            java.lang.Object r5 = r5.x(r1, r3, r4)
            if (r5 == r0) goto L34
        L1b:
            cmis r5 = r4.d
            cmis r1 = defpackage.cmis.PER_SIM_TOGGLE_STATE_DISABLED
            if (r5 != r1) goto L2d
            cmii r5 = r4.b
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.p(r4)
            if (r5 != r0) goto L2d
            goto L34
        L2d:
            cmii r5 = r4.b
            r5.k()
            r5 = 0
            return r5
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmid.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmid(this.b, this.c, this.d, ffguVar);
    }
}
