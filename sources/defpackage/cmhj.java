package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmhj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ djrm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhj(ffgu ffguVar, cmii cmiiVar, djrm djrmVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r6 == defpackage.cmis.PER_SIM_TOGGLE_STATE_ENABLED) goto L16;
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
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r5.d
            cmii r0 = (defpackage.cmii) r0
            defpackage.ffci.b(r6)
            goto L24
        Lf:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffsk r6 = (defpackage.ffsk) r6
            cmii r6 = r5.b
            r5.d = r6
            r5.a = r2
            java.lang.Object r1 = r6.v(r5)
            if (r1 == r0) goto L46
            r0 = r6
            r6 = r1
        L24:
            djrm r1 = r5.c
            java.util.Map r6 = (java.util.Map) r6
            enru r3 = defpackage.cmii.a
            boolean r3 = r0.n()
            r4 = 0
            if (r3 != 0) goto L33
        L31:
            r2 = r4
            goto L41
        L33:
            java.lang.Object r6 = r6.get(r1)
            if (r6 != 0) goto L3d
            cmis r6 = r0.o(r1)
        L3d:
            cmis r0 = defpackage.cmis.PER_SIM_TOGGLE_STATE_ENABLED
            if (r6 != r0) goto L31
        L41:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmhj cmhjVar = new cmhj(ffguVar, this.b, this.c);
        cmhjVar.d = obj;
        return cmhjVar;
    }
}
