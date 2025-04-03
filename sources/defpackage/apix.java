package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apix implements aqge {
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/EmergencyRcsAvailabilitySupplier");
    public final ffsk a;
    public final aqge b;
    public ctbx c;
    public final ctbl d;

    public apix(ffsk ffskVar, ctbk ctbkVar, aqge aqgeVar) {
        this.a = ffskVar;
        this.b = aqgeVar;
        this.d = ctbkVar.a(new apit(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.d.a(new ctbf() { // from class: apiq
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "EmergencyRcsAvailabilitySupplier::Register", "EmergencyRcsAvailabilitySupplier::Callback", "EmergencyRcsAvailabilitySupplier:Unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new apir(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.apiu
            if (r0 == 0) goto L13
            r0 = r5
            apiu r0 = (defpackage.apiu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apiu r0 = new apiu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            aqge r5 = r4.b
            elfl r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L80
        L43:
            r5.getClass()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = defpackage.ffdx.U(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            if (r5 != 0) goto L6f
            enru r5 = defpackage.apix.e
            ensk r5 = r5.j()
            java.lang.String r0 = "hasMatchingEmergencyConfig"
            r1 = 66
            java.lang.String r2 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/EmergencyRcsAvailabilitySupplier"
            java.lang.String r3 = "EmergencyRcsAvailabilitySupplier.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "No recipient or too many recipients found for emergency rcs"
            r5.q(r0)
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L6f:
            aoku r5 = r5.g()
            j$.util.Optional r5 = r5.b()
            boolean r5 = r5.isPresent()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apix.d(ffgu):java.lang.Object");
    }
}
