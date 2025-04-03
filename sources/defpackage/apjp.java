package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apjp implements aqge {
    private static final enru g = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/geofilter/GeofilterDbSupplier");
    public final ffsk a;
    public final aqge b;
    public ctbx d;
    public final ctbl f;
    private final amrt h;
    public final fgjb c = new fgjf();
    public final AtomicReference e = new AtomicReference(null);

    public apjp(ffsk ffskVar, ctbk ctbkVar, amrt amrtVar, aqge aqgeVar) {
        this.a = ffskVar;
        this.h = amrtVar;
        this.b = aqgeVar;
        this.f = ctbkVar.a(new apjm(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.f.a(new ctbf() { // from class: apjh
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "GeofilterDbSupplier::Register", "GeofilterDbSupplier::Callback", "GeofilterDbSupplier::Unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new apjj(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.apji
            if (r0 == 0) goto L13
            r0 = r11
            apji r0 = (defpackage.apji) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apji r0 = new apji
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "fetchAndSaveGeofilterDb"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/geofilter/GeofilterDbSupplier"
            java.lang.String r5 = "GeofilterDbSupplier.kt"
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L41
            if (r2 == r7) goto L3b
            if (r2 != r6) goto L33
            apjp r0 = r0.d
            defpackage.ffci.b(r11)
            goto L86
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3b:
            apjp r2 = r0.d
            defpackage.ffci.b(r11)
            goto L4f
        L41:
            defpackage.ffci.b(r11)
            r0.d = r10
            r0.c = r7
            java.lang.Object r11 = r10.e(r0)
            if (r11 == r1) goto La4
            r2 = r10
        L4f:
            fdab r11 = (defpackage.fdab) r11
            if (r11 != 0) goto L67
            enru r11 = defpackage.apjp.g
            ensk r11 = r11.h()
            r0 = 82
            ensk r11 = r11.h(r4, r3, r0, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "ERCSConfig not available"
            r11.q(r0)
            return r8
        L67:
            amrt r7 = r2.h
            java.net.URL r9 = new java.net.URL
            java.lang.String r11 = r11.d
            r9.<init>(r11)
            r0.d = r2
            r0.c = r6
            ffhd r11 = r7.b
            ffhd r11 = defpackage.ekxi.a(r11)
            amrs r6 = new amrs
            r6.<init>(r8, r9, r7)
            java.lang.Object r11 = defpackage.ffra.a(r11, r6, r0)
            if (r11 == r1) goto La4
            r0 = r2
        L86:
            exdz r11 = (defpackage.exdz) r11
            if (r11 != 0) goto L9e
            enru r11 = defpackage.apjp.g
            ensk r11 = r11.j()
            r0 = 87
            ensk r11 = r11.h(r4, r3, r0, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "Failed to fetch geofilterdb"
            r11.q(r0)
            return r8
        L9e:
            java.util.concurrent.atomic.AtomicReference r0 = r0.e
            r0.set(r11)
            return r11
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apjp.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.apjk
            if (r0 == 0) goto L13
            r0 = r6
            apjk r0 = (defpackage.apjk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            apjk r0 = new apjk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            aqge r6 = r5.b
            elfl r6 = r6.b()
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L92
        L43:
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = defpackage.ffdx.U(r6)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            r0 = 0
            java.lang.String r1 = "getERCSConfigOrNull"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/geofilter/GeofilterDbSupplier"
            java.lang.String r3 = "GeofilterDbSupplier.kt"
            if (r6 != 0) goto L6b
            enru r6 = defpackage.apjp.g
            ensk r6 = r6.j()
            r4 = 98
            ensk r6 = r6.h(r2, r1, r4, r3)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r1 = "No recipient or too many recipients found for emergency rcs"
            r6.q(r1)
            return r0
        L6b:
            aoku r6 = r6.g()
            j$.util.Optional r6 = r6.b()
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L8d
            enru r6 = defpackage.apjp.g
            ensk r6 = r6.h()
            r4 = 103(0x67, float:1.44E-43)
            ensk r6 = r6.h(r2, r1, r4, r3)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r1 = "ERCSConfig not available for conversation"
            r6.q(r1)
            return r0
        L8d:
            java.lang.Object r6 = r6.get()
            return r6
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apjp.e(ffgu):java.lang.Object");
    }
}
