package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dely {
    public static final void b(String str) {
        ensk h = deme.b.h();
        h.Y(ente.a, "BugleWelcome");
        ((enrr) h.h("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker$Companion", "logInfo", 174, "VerificationWorker.kt")).D("%s %s", "VerificationWorker:", str);
    }

    public static final void c(String str, Throwable th) {
        ensk i = deme.b.i();
        i.Y(ente.a, "BugleWelcome");
        ((enrr) ((enrr) i).g(th).h("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker$Companion", "logSevere", 179, "VerificationWorker.kt")).D("%s %s", "VerificationWorker:", str);
    }

    public static final void d(String str) {
        ensk j = deme.b.j();
        j.Y(ente.a, "BugleWelcome");
        ((enrr) j.h("com/google/android/apps/messaging/welcome/v1/consent/VerificationWorker$Companion", "logWarning", 176, "VerificationWorker.kt")).D("%s %s", "VerificationWorker:", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ejoc r8, long r9, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.delx
            if (r0 == 0) goto L13
            r0 = r11
            delx r0 = (defpackage.delx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            delx r0 = new delx
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r11)
            goto L7a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r11)
            java.lang.Class<deme> r11 = defpackage.deme.class
            ejoe r11 = defpackage.ejoi.n(r11)
            poh r2 = new poh
            r2.<init>()
            r4 = 2
            r2.c(r4)
            poj r2 = r2.a()
            r11.d(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            ejnw r4 = new ejnw
            r4.<init>(r9, r2)
            r2 = r11
            ejnt r2 = (defpackage.ejnt) r2
            r2.c = r4
            poz r4 = defpackage.poz.CANCEL_AND_REENQUEUE
            ejnx r5 = new ejnx
            java.lang.String r6 = "CONSENT_VERIFICATION_WORKER"
            r5.<init>(r6, r4)
            r11.g(r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            ejnw r5 = new ejnw
            r5.<init>(r9, r4)
            r2.c = r5
            ejoi r9 = r11.h()
            com.google.common.util.concurrent.ListenableFuture r8 = r8.c(r9)
            r0.c = r3
            java.lang.Object r11 = defpackage.fgfz.c(r8, r0)
            if (r11 != r1) goto L7a
            return r1
        L7a:
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dely.a(ejoc, long, ffgu):java.lang.Object");
    }
}
