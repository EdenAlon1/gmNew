package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqmo extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler");
    public final cqnw b;
    public final ffbr c;
    private final ffsk d;
    private final ffbr e;

    public cqmo(ffsk ffskVar, cqnw cqnwVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.d = ffskVar;
        this.b = cqnwVar;
        this.c = ffbrVar;
        this.e = ffbrVar2;
    }

    private static final ceyt m(String str, ffix ffixVar) {
        try {
            ffixVar.invoke();
            return ceyt.i();
        } catch (cqmf e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleTelephony");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler", "runTelephonyDatabaseUpdateWork", 132, "TelephonyDatabaseUpdateWorkItemHandler.kt")).t("Telephony Database update failed due to insufficient permissions. Cancelling work: %s", str);
            return ceyt.k();
        } catch (Exception e2) {
            ensk j2 = a.j();
            j2.Y(ente.a, "BugleTelephony");
            ((enrr) ((enrr) j2).g(e2).h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler", "runTelephonyDatabaseUpdateWork", 141, "TelephonyDatabaseUpdateWorkItemHandler.kt")).t("Telephony Database update failed. Scheduling retry for work: %s", str);
            return ceyt.m();
        }
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(1);
        l.f(poa.LINEAR);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("TelephonyDatabaseUpdateWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = ezgn.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        ezgn ezgnVar = (ezgn) eyhsVar;
        ezgnVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cqmn(ezgnVar, this, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r9.d(r3) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.ffgu r9) {
        /*
            r8 = this;
            java.lang.String r0 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdateWorkItemHandler"
            java.lang.String r1 = "TelephonyDatabaseUpdateWorkItemHandler.kt"
            java.lang.String r2 = "BugleTelephony"
            boolean r3 = r9 instanceof defpackage.cqml
            if (r3 == 0) goto L19
            r3 = r9
            cqml r3 = (defpackage.cqml) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            cqml r3 = new cqml
            r3.<init>(r8, r9)
        L1e:
            java.lang.Object r9 = r3.a
            ffhh r4 = defpackage.ffhh.a
            int r5 = r3.c
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L3e
            if (r5 == r7) goto L38
            if (r5 != r6) goto L30
            defpackage.ffci.b(r9)
            goto L90
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            ceto r0 = r3.d
            defpackage.ffci.b(r9)
            return r0
        L3e:
            defpackage.ffci.b(r9)
            ffbr r9 = r8.e
            java.lang.Object r9 = r9.b()
            auxa r9 = (defpackage.auxa) r9
            boolean r9 = r9.a()
            java.lang.String r5 = "attemptTextPartCharsetUpdate"
            if (r9 == 0) goto L7a
            cqmj r9 = new cqmj
            r9.<init>()
            ceyt r9 = m(r5, r9)
            ceyt r0 = defpackage.ceyt.i()
            boolean r0 = defpackage.ffkj.e(r9, r0)
            if (r0 == 0) goto L79
            ffbr r0 = r8.c
            java.lang.Object r0 = r0.b()
            cqoa r0 = (defpackage.cqoa) r0
            r1 = r9
            ceto r1 = (defpackage.ceto) r1
            r3.d = r1
            r3.c = r7
            java.lang.Object r0 = r0.d(r3)
            if (r0 == r4) goto L8f
        L79:
            return r9
        L7a:
            cqnw r9 = r8.b     // Catch: java.lang.Exception -> L95 defpackage.cqmf -> Lb9
            r9.o()     // Catch: java.lang.Exception -> L95 defpackage.cqmf -> Lb9
            ffbr r9 = r8.c
            java.lang.Object r9 = r9.b()
            cqoa r9 = (defpackage.cqoa) r9
            r3.c = r6
            java.lang.Object r9 = r9.d(r3)
            if (r9 != r4) goto L90
        L8f:
            return r4
        L90:
            ceyt r9 = defpackage.ceyt.i()
            return r9
        L95:
            r9 = move-exception
            enru r3 = defpackage.cqmo.a
            ensk r3 = r3.j()
            ensn r4 = defpackage.ente.a
            r3.Y(r4, r2)
            enrr r3 = (defpackage.enrr) r3
            ensk r9 = r3.g(r9)
            r2 = 96
            ensk r9 = r9.h(r0, r5, r2, r1)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Telephony Database update failed. Scheduling retry."
            r9.q(r0)
            ceyt r9 = defpackage.ceyt.m()
            return r9
        Lb9:
            r9 = move-exception
            enru r3 = defpackage.cqmo.a
            ensk r3 = r3.j()
            ensn r4 = defpackage.ente.a
            r3.Y(r4, r2)
            enrr r3 = (defpackage.enrr) r3
            ensk r9 = r3.g(r9)
            r2 = 93
            ensk r9 = r9.h(r0, r5, r2, r1)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Telephony Database update failed due to insufficient permissions. Cancelling work."
            r9.q(r0)
            ceyt r9 = defpackage.ceyt.k()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqmo.k(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cqmm
            if (r0 == 0) goto L13
            r0 = r6
            cqmm r0 = (defpackage.cqmm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqmm r0 = new cqmm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ceto r0 = r0.d
            defpackage.ffci.b(r6)
            return r0
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            cqmk r6 = new cqmk
            r6.<init>()
            java.lang.String r2 = "attemptUpdateForMessagesInThreadZero"
            ceyt r6 = m(r2, r6)
            ceyt r2 = defpackage.ceyt.i()
            boolean r2 = defpackage.ffkj.e(r6, r2)
            if (r2 == 0) goto L60
            ffbr r2 = r5.c
            java.lang.Object r2 = r2.b()
            cqoa r2 = (defpackage.cqoa) r2
            r4 = r6
            ceto r4 = (defpackage.ceto) r4
            r0.d = r4
            r0.c = r3
            java.lang.Object r0 = r2.c(r0)
            if (r0 == r1) goto L5f
            goto L60
        L5f:
            return r1
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqmo.l(ffgu):java.lang.Object");
    }
}
