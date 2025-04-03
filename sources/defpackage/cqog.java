package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqog implements cqoa {
    public final ffbr a;
    private final ffbz b;

    public cqog(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffca.a(new ffix() { // from class: cqod
            @Override // defpackage.ffix
            public final Object invoke() {
                comy comyVar = (comy) cqog.this.a.b();
                comu c = comv.c();
                c.d(comb.TELEPHONY_DATABASE_UPDATE_SETTINGS);
                c.f(cqny.a);
                return comyVar.a(c.a());
            }
        });
    }

    private final comc e() {
        return (comc) this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cqoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqoe
            if (r0 == 0) goto L13
            r0 = r5
            cqoe r0 = (defpackage.cqoe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqoe r0 = new cqoe
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            comc r5 = r4.e()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cqny r5 = (defpackage.cqny) r5
            boolean r5 = r5.c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqog.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cqoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqof
            if (r0 == 0) goto L13
            r0 = r5
            cqof r0 = (defpackage.cqof) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqof r0 = new cqof
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            comc r5 = r4.e()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cqny r5 = (defpackage.cqny) r5
            boolean r5 = r5.d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqog.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.cqoa
    public final Object c(ffgu ffguVar) {
        Object d = e().d(new ffji() { // from class: cqob
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cqny cqnyVar = (cqny) obj;
                cqnyVar.getClass();
                cqnx cqnxVar = (cqnx) cqnyVar.toBuilder();
                cqnxVar.getClass();
                cqnxVar.copyOnWrite();
                cqny cqnyVar2 = (cqny) cqnxVar.instance;
                cqnyVar2.b |= 2;
                cqnyVar2.d = true;
                return cqnz.a(cqnxVar);
            }
        }, ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    @Override // defpackage.cqoa
    public final Object d(ffgu ffguVar) {
        Object d = e().d(new ffji() { // from class: cqoc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cqny cqnyVar = (cqny) obj;
                cqnyVar.getClass();
                cqnx cqnxVar = (cqnx) cqnyVar.toBuilder();
                cqnxVar.getClass();
                cqnxVar.copyOnWrite();
                cqny cqnyVar2 = (cqny) cqnxVar.instance;
                cqnyVar2.b |= 1;
                cqnyVar2.c = true;
                return cqnz.a(cqnxVar);
            }
        }, ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }
}
