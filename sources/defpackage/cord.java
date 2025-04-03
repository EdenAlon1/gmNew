package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cord extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler");
    public final ffbr b;
    private final ffsk c;
    private final ffbr d;
    private final long e;

    public cord(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, long j) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.c = ffskVar;
        this.b = ffbrVar;
        this.d = ffbrVar2;
        this.e = j;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        l.c((int) this.e);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("SimStateUpdateHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = corf.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "sim_state_update_queue";
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        corf corfVar = (corf) eyhsVar;
        corfVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new corc(this, corfVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.eraj r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.corb
            if (r0 == 0) goto L13
            r0 = r9
            corb r0 = (defpackage.corb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            corb r0 = new corb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cord r8 = r0.d
            defpackage.ffci.b(r9)
            goto L61
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r9)
            enru r9 = defpackage.cord.a
            ensk r9 = r9.h()
            java.lang.String r2 = "handleUpdatePhoneSimsState"
            r4 = 114(0x72, float:1.6E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler"
            java.lang.String r6 = "SimStateUpdateHandler.kt"
            ensk r9 = r9.h(r5, r2, r4, r6)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r2 = "Handling update phone SIM state."
            r9.q(r2)
            ffbr r9 = r7.b
            java.lang.Object r9 = r9.b()
            coqc r9 = (defpackage.coqc) r9
            r0.d = r7
            r0.c = r3
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            r8 = r7
        L61:
            cosw r9 = (defpackage.cosw) r9
            corq r9 = defpackage.corq.WORK_TYPE_UPDATE_PHONE_SIMS_STATE
            r8.l(r9)
            ceyt r8 = defpackage.ceyt.i()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cord.k(eraj, ffgu):java.lang.Object");
    }

    public final void l(corq corqVar) {
        cosh coshVar = (cosh) this.d.b();
        corqVar.getClass();
        ((akzt) coshVar.a.b()).e("Bugle.Dsdr.SimStateUpdateHandler", corqVar.ordinal());
    }
}
