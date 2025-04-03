package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvn extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dvq c;
    final /* synthetic */ float d;
    final /* synthetic */ ffji e;
    final /* synthetic */ drd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvn(dvq dvqVar, float f, ffji ffjiVar, drd drdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dvqVar;
        this.d = f;
        this.e = ffjiVar;
        this.f = drdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r12 != r0) goto L13;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r12)
            return r12
        Ld:
            java.lang.Object r1 = r11.a
            defpackage.ffci.b(r12)
            r8 = r11
            goto L69
        L14:
            defpackage.ffci.b(r12)
            dvq r12 = r11.c
            float r1 = r11.d
            dvw r3 = r12.a
            cyj r12 = r12.c
            float r12 = defpackage.cyk.b(r12, r1)
            float r12 = r3.a(r1, r12)
            boolean r1 = java.lang.Float.isNaN(r12)
            if (r1 == 0) goto L32
            java.lang.String r1 = "calculateApproachOffset returned NaN. Please use a valid value."
            defpackage.dwv.d(r1)
        L32:
            ffky r1 = new ffky
            r1.<init>()
            float r12 = java.lang.Math.abs(r12)
            float r3 = r11.d
            float r3 = java.lang.Math.signum(r3)
            float r12 = r12 * r3
            r1.a = r12
            ffji r3 = r11.e
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r12)
            r3.invoke(r4)
            dvq r5 = r11.c
            drd r6 = r11.f
            float r7 = r1.a
            float r8 = r11.d
            ffji r12 = r11.e
            dvm r9 = new dvm
            r9.<init>(r1, r12)
            r11.a = r1
            r11.b = r2
            r10 = r11
            java.lang.Object r12 = r5.d(r6, r7, r8, r9, r10)
            r8 = r10
            if (r12 == r0) goto Laf
        L69:
            dvq r2 = r8.c
            cxv r12 = (defpackage.cxv) r12
            java.lang.Object r3 = r12.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            dvw r2 = r2.a
            float r3 = r2.b(r3)
            boolean r2 = java.lang.Float.isNaN(r3)
            if (r2 == 0) goto L88
            java.lang.String r2 = "calculateSnapOffset returned NaN. Please use a valid value."
            defpackage.dwv.d(r2)
        L88:
            ffky r1 = (defpackage.ffky) r1
            r1.a = r3
            drd r2 = r8.f
            r4 = 30
            r5 = 0
            cxv r5 = defpackage.cxw.d(r12, r5, r5, r4)
            dvq r12 = r8.c
            ffji r4 = r8.e
            dvl r7 = new dvl
            r7.<init>(r1, r4)
            r1 = 0
            r8.a = r1
            r1 = 2
            r8.b = r1
            cxt r6 = r12.b
            r4 = r3
            java.lang.Object r12 = defpackage.dvv.b(r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto Lae
            goto Laf
        Lae:
            return r12
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvn(this.c, this.d, this.e, this.f, ffguVar);
    }
}
