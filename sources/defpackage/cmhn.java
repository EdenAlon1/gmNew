package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmhn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhn(ffgu ffguVar, cmii cmiiVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        if (r4 != r0) goto L9;
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
            goto L4b
        Ld:
            java.lang.Object r1 = r3.c
            cmii r1 = (defpackage.cmii) r1
            defpackage.ffci.b(r4)
            goto L28
        L15:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.c
            ffsk r4 = (defpackage.ffsk) r4
            cmii r1 = r3.b
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = r1.t(r3)
            if (r4 == r0) goto L58
        L28:
            cmiu r4 = (defpackage.cmiu) r4
            int r4 = r4.e
            cmip r4 = defpackage.cmip.b(r4)
            if (r4 != 0) goto L34
            cmip r4 = defpackage.cmip.TOGGLE_STATE_UNSPECIFIED
        L34:
            r4.getClass()
            enru r2 = defpackage.cmii.a
            r1.A(r4)
            cmii r4 = r3.b
            r1 = 0
            r3.c = r1
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.t(r3)
            if (r4 != r0) goto L4b
            goto L58
        L4b:
            cmiu r4 = (defpackage.cmiu) r4
            int r4 = r4.e
            cmip r4 = defpackage.cmip.b(r4)
            if (r4 != 0) goto L57
            cmip r4 = defpackage.cmip.TOGGLE_STATE_UNSPECIFIED
        L57:
            return r4
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmhn cmhnVar = new cmhn(ffguVar, this.b);
        cmhnVar.c = obj;
        return cmhnVar;
    }
}
