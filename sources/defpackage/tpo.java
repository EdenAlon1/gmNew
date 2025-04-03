package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tpq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpo(ffgu ffguVar, tpq tpqVar) {
        super(2, ffguVar);
        this.b = tpqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tpo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r5 != r0) goto L10;
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            return r5
        Ld:
            defpackage.ffci.b(r5)
            goto L44
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffsk r5 = (defpackage.ffsk) r5
            tpq r5 = r4.b
            ffbr r5 = r5.a
            java.lang.Object r5 = r5.b()
            crty r5 = (defpackage.crty) r5
            eyfh r1 = defpackage.eyfh.a
            eyfq r1 = r1.createBuilder()
            eyfg r1 = (defpackage.eyfg) r1
            java.lang.String r3 = "box_devices"
            r1.a(r3)
            eyfy r1 = r1.build()
            eyfh r1 = (defpackage.eyfh) r1
            elfl r5 = r5.k(r1)
            r5.getClass()
            r4.a = r2
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 == r0) goto L5f
        L44:
            tpq r1 = r4.b
            esvv r5 = (defpackage.esvv) r5
            ffbr r1 = r1.b
            java.lang.Object r1 = r1.b()
            tns r1 = (defpackage.tns) r1
            elfl r5 = r1.a(r5)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = defpackage.fgfz.c(r5, r4)
            if (r5 != r0) goto L5e
            goto L5f
        L5e:
            return r5
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        tpo tpoVar = new tpo(ffguVar, this.b);
        tpoVar.c = obj;
        return tpoVar;
    }
}
