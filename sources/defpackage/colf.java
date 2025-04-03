package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class colf implements ckao {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl");
    public final ffbr b;
    public final ffbr c;
    public final avjf d;
    private final crgh e;
    private final ffsk f;

    public colf(ffbr ffbrVar, ffbr ffbrVar2, crgh crghVar, avjf avjfVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        crghVar.getClass();
        avjfVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.e = crghVar;
        this.d = avjfVar;
        this.f = ffskVar;
    }

    @Override // defpackage.ckao
    public final elfl a(aoku aokuVar) {
        elfl c;
        aokuVar.getClass();
        String j = aokuVar.j();
        String c2 = cskt.c(aokuVar);
        if (j == null) {
            ensk j2 = a.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) j2.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 50, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).t("No short code in local destination: %s", c2);
            this.d.l(null, 5);
            elfl e = elfo.e(Optional.empty());
            e.getClass();
            return e;
        }
        eqna d = this.e.d();
        if (!d.equals(eqna.TRANSPORT_UNKNOWN)) {
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 63, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).D("Enabled transport %s: %s", d, c2);
            this.d.b(j);
            c = axol.c(this.f, ffhe.a, ffsm.a, new cole(this, j, null));
            return c;
        }
        ensk j3 = a.j();
        j3.Y(ente.a, "Bugle");
        ((enrr) j3.h("com/google/android/apps/messaging/shared/service/RbmBotIdResolverViaBotInfoServiceImpl", "getBotChatEndpoint", 58, "RbmBotIdResolverViaBotInfoServiceImpl.kt")).t("There is no enabled transport, %s", c2);
        this.d.l(j, 5);
        elfl e2 = elfo.e(Optional.empty());
        e2.getClass();
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.avgr r5, java.lang.String r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cold
            if (r0 == 0) goto L13
            r0 = r7
            cold r0 = (defpackage.cold) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cold r0 = new cold
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            j$.util.Optional r7 = j$.util.Optional.empty()
            elfl r5 = r5.e(r6, r7)
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.colf.b(avgr, java.lang.String, ffgu):java.lang.Object");
    }
}
