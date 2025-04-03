package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceyc implements cexi {
    public static final cfup a = cfvl.b("force_scheduler_v2_for_tests", false);
    private static final cskc f = cskc.g("BugleWorkQueue", "WorkQueueMigrationLatchImpl");
    public final ffbr b;
    public final ffbr c;
    public final ffsk d;
    public final ffsk e;
    private final ffbz g;
    private final ffbz h;

    public ceyc(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffsk ffskVar2) {
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffskVar;
        this.e = ffskVar2;
        this.g = ffca.a(new ffix() { // from class: cexl
            @Override // defpackage.ffix
            public final Object invoke() {
                efbd.b();
                comy comyVar = (comy) ceyc.this.c.b();
                comu c = comv.c();
                c.d(comb.PWQ_SCHEDULER_MIGRATION);
                c.f(ceyi.a);
                return comyVar.a(c.a());
            }
        });
        this.h = ffca.a(new ffix() { // from class: cexm
            @Override // defpackage.ffix
            public final Object invoke() {
                fgcm a2 = fgdm.a(ffem.a);
                ceyc ceycVar = ceyc.this;
                axol.k(ceycVar.e, null, new cexy(ceycVar, a2, null), 3);
                return a2;
            }
        });
    }

    private final fgdj i() {
        return (fgdj) this.h.a();
    }

    @Override // defpackage.cexi
    public final cexh a(String str) {
        str.getClass();
        if (((Boolean) a.e()).booleanValue()) {
            return cexh.b;
        }
        Map map = (Map) i().c();
        if (map == null) {
            return null;
        }
        return (cexh) map.get(str);
    }

    @Override // defpackage.cexi
    public final cexh b(final String str) {
        if (!((Boolean) a.e()).booleanValue()) {
            ffbr ffbrVar = (ffbr) ((Map) this.b.b()).get(str);
            if (ffbrVar == null) {
                ffbrVar = h(str);
            }
            if (((cetj) ((ceve) ffbrVar.b()).a()).j) {
                if (!((ceyi) e().l()).b.contains(str)) {
                    if (!cexo.a(str)) {
                        csjb c = f.c();
                        c.I("Migrated to Scheduler V2 in transaction");
                        c.A("handlerKey", str);
                        c.r();
                        return cexh.b;
                    }
                }
            }
            return cexh.a;
        }
        return cexh.b;
    }

    @Override // defpackage.cexi
    public final elfl c(cexh cexhVar) {
        elfl c;
        cexhVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cexq(this, cexhVar, null));
        return c;
    }

    @Override // defpackage.cexi
    public final Object d(String str, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d.hT()), new ceyb(null, this, str), ffguVar);
    }

    public final comc e() {
        return (comc) this.g.a();
    }

    public final Object f(ffgu ffguVar) {
        return fgbj.a(new cext(i()), ffguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (defpackage.fgbj.b(r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(final java.lang.String r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cexz
            if (r0 == 0) goto L13
            r0 = r8
            cexz r0 = (defpackage.cexz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cexz r0 = new cexz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            java.lang.String r3 = "handlerKey"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r7 = r0.a
            java.lang.String r7 = (java.lang.String) r7
            defpackage.ffci.b(r8)
            goto L83
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.String r7 = r0.e
            java.lang.Object r2 = r0.a
            ceyc r2 = (defpackage.ceyc) r2
            defpackage.ffci.b(r8)
            goto L5b
        L42:
            defpackage.ffci.b(r8)
            comc r8 = r6.e()
            cexk r2 = new cexk
            r2.<init>()
            r0.a = r6
            r0.e = r7
            r0.d = r5
            java.lang.Object r8 = r8.d(r2, r0)
            if (r8 == r1) goto L97
            r2 = r6
        L5b:
            cskc r8 = defpackage.ceyc.f
            csjb r8 = r8.c()
            java.lang.String r5 = "Migrated to Scheduler V2. Waiting for sync"
            r8.I(r5)
            r8.A(r3, r7)
            r8.r()
            fgdj r8 = r2.i()
            ceya r2 = new ceya
            r5 = 0
            r2.<init>(r7, r5)
            r0.a = r7
            r0.e = r5
            r0.d = r4
            java.lang.Object r8 = defpackage.fgbj.b(r8, r2, r0)
            if (r8 != r1) goto L83
            goto L97
        L83:
            cskc r8 = defpackage.ceyc.f
            csjb r8 = r8.d()
            java.lang.String r0 = "Migration synced"
            r8.I(r0)
            r8.A(r3, r7)
            r8.r()
            ffcu r7 = defpackage.ffcu.a
            return r7
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceyc.g(java.lang.String, ffgu):java.lang.Object");
    }

    public final ffbr h(String str) {
        ffbr ffbrVar = (ffbr) ((Map) this.b.b()).get("__UNHANDLED_HANDLER");
        if (ffbrVar != null) {
            return ffbrVar;
        }
        throw new IllegalArgumentException("Invalid handler key and no unhandled handler: ".concat(str));
    }
}
