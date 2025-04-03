package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfh extends ceut {
    public final axkm a;
    public final babm b;
    public final cdfd c;
    public final Optional d;
    public final akzt e;
    public final cskc f;
    private final ffsk g;
    private final ffhd h;

    public cdfh(ffsk ffskVar, ffhd ffhdVar, axkm axkmVar, babm babmVar, cdfd cdfdVar, Optional optional, axdf axdfVar, akzt akztVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        axkmVar.getClass();
        babmVar.getClass();
        axdfVar.getClass();
        akztVar.getClass();
        this.g = ffskVar;
        this.h = ffhdVar;
        this.a = axkmVar;
        this.b = babmVar;
        this.c = cdfdVar;
        this.d = optional;
        this.e = akztVar;
        this.f = cskc.g("BugleCmsBatchBackup", "DropUnscheduledItemToDlqWorkHandler");
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        Object e = cdfi.a.e();
        e.getClass();
        l.c(((Number) e).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DropUnscheduledItemToDlqWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cdvx.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cdvx cdvxVar = (cdvx) eyhsVar;
        cdvxVar.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new cdfg(this, ceuwVar, cdvxVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cdff
            if (r0 == 0) goto L13
            r0 = r6
            cdff r0 = (defpackage.cdff) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdff r0 = new cdff
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.h
            ffhd r6 = defpackage.ekxi.a(r6)
            cdfe r2 = new cdfe
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfh.k(ffgu):java.lang.Object");
    }
}
