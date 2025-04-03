package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxz implements eikt {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler");
    private final ffsk b;
    private final ffbr c;

    public cjxz(ffsk ffskVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        this.b = ffskVar;
        this.c = ffbrVar;
    }

    @Override // defpackage.eikt
    public final /* bridge */ /* synthetic */ void a(eyhs eyhsVar, eiks eiksVar) {
        cjyb cjybVar = (cjyb) eyhsVar;
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleProfiles");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler", "onMessageReceived", 29, "IncomingProfileActionHandler.kt");
        int c = cjyr.c(cjybVar.d);
        if (c == 0) {
            c = 1;
        }
        enrrVar.t("Received profile action: %s", cjyr.a(c));
        int c2 = cjyr.c(cjybVar.d);
        if (c2 == 0) {
            c2 = 1;
        }
        int i = c2 - 2;
        if (i == 1) {
            axol.k(this.b, null, new cjxx(this, cjybVar, eiksVar, null), 3);
            return;
        }
        if (i == 2) {
            axol.k(this.b, null, new cjxy(this, eiksVar, null), 3);
            return;
        }
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleProfiles");
        enrr enrrVar2 = (enrr) h2.h("com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler", "onMessageReceived", 40, "IncomingProfileActionHandler.kt");
        int c3 = cjyr.c(cjybVar.d);
        enrrVar2.t("Unable to handle profile action: %s", cjyr.a(c3 != 0 ? c3 : 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        if (defpackage.fgfz.c(r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aoku r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cjxv
            if (r0 == 0) goto L13
            r0 = r11
            cjxv r0 = (defpackage.cjxv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjxv r0 = new cjxv
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r11)
            goto Lba
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            cjxz r10 = r0.d
            defpackage.ffci.b(r11)
            goto L53
        L39:
            defpackage.ffci.b(r11)
            ffbr r11 = r9.c
            java.lang.Object r11 = r11.b()
            aqkp r11 = (defpackage.aqkp) r11
            elfl r10 = r11.m(r10)
            r0.d = r9
            r0.c = r4
            java.lang.Object r11 = defpackage.fgfz.c(r10, r0)
            if (r11 == r1) goto Lbd
            r10 = r9
        L53:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r11 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r11
            java.lang.String r2 = "handleProfileRevoke"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler"
            java.lang.String r5 = "IncomingProfileActionHandler.kt"
            java.lang.String r6 = "BugleProfiles"
            if (r11 != 0) goto L7a
            enru r10 = defpackage.cjxz.a
            ensk r10 = r10.h()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r6)
            r11 = 74
            ensk r10 = r10.h(r4, r2, r11, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Not updating profile metadata, unable to find recipient"
            r10.q(r11)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L7a:
            enru r7 = defpackage.cjxz.a
            ensk r7 = r7.h()
            ensn r8 = defpackage.ente.a
            r7.Y(r8, r6)
            r6 = 80
            ensk r2 = r7.h(r4, r2, r6, r5)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r4 = "Received revoke action from recipient=%s, remove profile data"
            aqkv r5 = r11.F()
            r2.t(r4, r5)
            ffbr r10 = r10.c
            java.lang.Object r10 = r10.b()
            aqkp r10 = (defpackage.aqkp) r10
            aqkv r11 = r11.F()
            aqkl r2 = new aqkl
            r4 = 0
            r2.<init>(r4, r4, r4)
            elfl r10 = r10.C(r11, r2)
            r10.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 != r1) goto Lba
            goto Lbd
        Lba:
            ffcu r10 = defpackage.ffcu.a
            return r10
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjxz.b(aoku, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        if (defpackage.fgfz.c(r10, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cjzb r10, defpackage.aoku r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.cjxw
            if (r0 == 0) goto L13
            r0 = r12
            cjxw r0 = (defpackage.cjxw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjxw r0 = new cjxw
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r12)
            goto Ld9
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            cjzb r10 = r0.e
            cjxz r11 = r0.d
            defpackage.ffci.b(r12)
            goto L57
        L3b:
            defpackage.ffci.b(r12)
            ffbr r12 = r9.c
            java.lang.Object r12 = r12.b()
            aqkp r12 = (defpackage.aqkp) r12
            elfl r11 = r12.m(r11)
            r0.d = r9
            r0.e = r10
            r0.c = r4
            java.lang.Object r12 = defpackage.fgfz.c(r11, r0)
            if (r12 == r1) goto Ldc
            r11 = r9
        L57:
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r12 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r12
            java.lang.String r2 = "handleProfileShare"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/profile/transport/IncomingProfileActionHandler"
            java.lang.String r5 = "IncomingProfileActionHandler.kt"
            java.lang.String r6 = "BugleProfiles"
            if (r12 != 0) goto L7e
            enru r10 = defpackage.cjxz.a
            ensk r10 = r10.h()
            ensn r11 = defpackage.ente.a
            r10.Y(r11, r6)
            r11 = 52
            ensk r10 = r10.h(r4, r2, r11, r5)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r11 = "Not updating profile metadata, unable to find recipient"
            r10.q(r11)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L7e:
            enru r7 = defpackage.cjxz.a
            ensk r7 = r7.h()
            ensn r8 = defpackage.ente.a
            r7.Y(r8, r6)
            r6 = 56
            ensk r2 = r7.h(r4, r2, r6, r5)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r4 = "Received profile metadata from recipient=%s, updating DB"
            aqkv r5 = r12.F()
            r2.t(r4, r5)
            ffbr r11 = r11.c
            java.lang.Object r11 = r11.b()
            aqkp r11 = (defpackage.aqkp) r11
            aqkv r12 = r12.F()
            aqkl r2 = new aqkl
            java.lang.String r4 = r10.c
            java.lang.String r5 = r10.d
            eyja r10 = r10.e
            if (r10 != 0) goto Lb2
            eyja r10 = defpackage.eyja.a
        Lb2:
            r10.getClass()
            j$.time.Instant r10 = defpackage.eykn.d(r10)
            long r6 = r10.toEpochMilli()
            java.lang.String r10 = java.lang.String.valueOf(r6)
            r2.<init>(r4, r5, r10)
            elfl r10 = r11.C(r12, r2)
            r10.getClass()
            r11 = 0
            r0.d = r11
            r0.e = r11
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 != r1) goto Ld9
            goto Ldc
        Ld9:
            ffcu r10 = defpackage.ffcu.a
            return r10
        Ldc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjxz.c(cjzb, aoku, ffgu):java.lang.Object");
    }
}
