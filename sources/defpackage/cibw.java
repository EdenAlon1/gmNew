package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibw implements cifg {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate");
    private final ffsk b;
    private final ffsk c;
    private final ffbr d;
    private final Optional e;
    private final cgvp f;

    public cibw(ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, Optional optional, cgvp cgvpVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        cgvpVar.getClass();
        this.b = ffskVar;
        this.c = ffskVar2;
        this.d = ffbrVar;
        this.e = optional;
        this.f = cgvpVar;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        elfl c;
        elfl c2;
        eslc eslcVar = (eslc) eyhsVar;
        eslcVar.getClass();
        if (((cgcu) this.d.b()).a()) {
            c = axol.c(this.c, ffhe.a, ffsm.a, new cibv(this, eslcVar, null));
            return c;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleGDitto");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.O, "CancelGaiaPairingDelegate");
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate", "handleRequestInternal", 64, "CancelGaiaPairingDelegate.kt")).q("Gaia Pairing is disabled. Skipping handleRequestInternal in delegate.");
        c2 = axol.c(this.b, ffhe.a, ffsm.a, new cibu(null));
        return c2;
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        if (((cgcu) this.d.b()).a()) {
            eslc eslcVar = (eslc) eyfy.parseFrom(eslc.a, eyeeVar, eyfc.a());
            eslcVar.getClass();
            return eslcVar;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleGDitto");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.O, "CancelGaiaPairingDelegate");
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate", "parseRequest", 49, "CancelGaiaPairingDelegate.kt")).q("Gaia Pairing is disabled. Skipping parseRequest in delegate.");
        eslb eslbVar = (eslb) eslc.a.createBuilder();
        eslbVar.getClass();
        eyfy build = eslbVar.build();
        build.getClass();
        return (eslc) build;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v10, types: [bzme, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.eslc r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cibt
            if (r0 == 0) goto L13
            r0 = r10
            cibt r0 = (defpackage.cibt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cibt r0 = new cibt
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.ffci.b(r10)
            goto Lb9
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            defpackage.ffci.b(r10)
            java.lang.String r9 = r9.b
            cgvp r10 = r8.f
            java.util.concurrent.atomic.AtomicReference r10 = r10.a
            java.lang.Object r10 = r10.get()
            boolean r9 = defpackage.ffkj.e(r9, r10)
            java.lang.String r10 = "getCancelPairingResponse"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/net/handler/ditto/CancelGaiaPairingDelegate"
            java.lang.String r4 = "CancelGaiaPairingDelegate.kt"
            java.lang.String r5 = "CancelGaiaPairingDelegate"
            java.lang.String r6 = "BugleGDitto"
            if (r9 != 0) goto L80
            enru r9 = defpackage.cibw.a
            ensk r9 = r9.h()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r6)
            enrr r9 = (defpackage.enrr) r9
            ensn r0 = defpackage.csux.O
            r9.Y(r0, r5)
            r0 = 82
            ensk r9 = r9.h(r2, r10, r0, r4)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Pairing attempt id doesn't match. Ignore cancel pairing request."
            r9.q(r10)
            esle r9 = defpackage.esle.a
            eyfq r9 = r9.createBuilder()
            esld r9 = (defpackage.esld) r9
            r9.getClass()
            r10 = 0
            defpackage.eslf.b(r10, r9)
            esle r9 = defpackage.eslf.a(r9)
            return r9
        L80:
            enru r9 = defpackage.cibw.a
            ensk r9 = r9.e()
            ensn r7 = defpackage.ente.a
            r9.Y(r7, r6)
            enrr r9 = (defpackage.enrr) r9
            ensn r6 = defpackage.csux.O
            r9.Y(r6, r5)
            r5 = 85
            ensk r9 = r9.h(r2, r10, r5, r4)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Cancel gaia pairing."
            r9.q(r10)
            j$.util.Optional r9 = r8.e
            r9.isPresent()
            j$.util.Optional r9 = r8.e
            java.lang.Object r9 = r9.get()
            bzlz r10 = defpackage.bzlz.ERROR_USER_CANCELED_VERIFICATION_FROM_DITTO
            elfl r9 = r9.g(r10)
            r0.c = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 != r1) goto Lb9
            return r1
        Lb9:
            esle r9 = defpackage.esle.a
            eyfq r9 = r9.createBuilder()
            esld r9 = (defpackage.esld) r9
            r9.getClass()
            defpackage.eslf.b(r3, r9)
            esle r9 = defpackage.eslf.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cibw.d(eslc, ffgu):java.lang.Object");
    }
}
