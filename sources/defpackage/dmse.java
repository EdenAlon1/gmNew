package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmse extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fflb b;
    final /* synthetic */ hho c;
    final /* synthetic */ iir d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmse(fflb fflbVar, hho hhoVar, iir iirVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fflbVar;
        this.c = hhoVar;
        this.d = iirVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmse) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
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
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Lb
            goto L1c
        Lb:
            fflb r4 = r3.b
            java.lang.Object r4 = r4.a
            ffss r4 = (defpackage.ffss) r4
            if (r4 == 0) goto L23
            r3.a = r2
            java.lang.Object r4 = r4.c(r3)
            if (r4 != r0) goto L1c
            return r0
        L1c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L24
        L23:
            r4 = r2
        L24:
            hho r0 = r3.c
            r4 = r4 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.b(r4)
            hho r4 = r3.c
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L42
            iir r4 = r3.d
            r0 = 0
            r4.a(r0)
        L42:
            fflb r4 = r3.b
            r0 = 0
            r4.a = r0
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmse.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmse(this.b, this.c, this.d, ffguVar);
    }
}
