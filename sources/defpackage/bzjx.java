package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzjx implements bzib {
    public final eisx a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final chvu e;
    public final bzic f;
    public final ffbr g;
    public final ffsk h;
    public final enru i;
    public final AtomicBoolean j;
    private final ffbr k;
    private final ffbr l;
    private final ffsk m;
    private final AtomicBoolean n;

    public bzjx(eisx eisxVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, chvu chvuVar, bzic bzicVar, ffbr ffbrVar6, ffsk ffskVar, ffsk ffskVar2) {
        eisxVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        bzicVar.getClass();
        ffbrVar6.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.a = eisxVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.k = ffbrVar4;
        this.l = ffbrVar5;
        this.e = chvuVar;
        this.f = bzicVar;
        this.g = ffbrVar6;
        this.h = ffskVar;
        this.m = ffskVar2;
        this.i = enru.c("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl");
        this.j = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
    }

    @Override // defpackage.bzib
    public final ejxi a(eisx eisxVar) {
        eisxVar.getClass();
        return new bzjt(this, eisxVar);
    }

    @Override // defpackage.bzib
    public final elfl b(List list) {
        elfl c;
        list.getClass();
        c = axol.c(this.m, ffhe.a, ffsm.a, new bzjo(list, this, null));
        return c;
    }

    @Override // defpackage.bzib
    public final elfl c() {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new bzjp(this, null));
        return c;
    }

    @Override // defpackage.bzib
    public final elfl d() {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new bzjr(this, null));
        return c;
    }

    @Override // defpackage.bzib
    public final elfl e() {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new bzjv(this, null));
        return c;
    }

    @Override // defpackage.bzib
    public final elfl f() {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new bzjw(this, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bb, code lost:
    
        if (r2 != r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012b, code lost:
    
        if (r2 == r4) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bd  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.eixn r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzjx.g(eixn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.eixn r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bzjq
            if (r0 == 0) goto L13
            r0 = r6
            bzjq r0 = (defpackage.bzjq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzjq r0 = new bzjq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            bzjx r5 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L29
            goto L59
        L29:
            r6 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.l     // Catch: java.lang.Exception -> L5c
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Exception -> L5c
            ebwq r6 = (defpackage.ebwq) r6     // Catch: java.lang.Exception -> L5c
            eixz r5 = r5.b()     // Catch: java.lang.Exception -> L5c
            java.lang.String r5 = r5.g     // Catch: java.lang.Exception -> L5c
            r2 = 32
            com.google.common.util.concurrent.ListenableFuture r5 = r6.g(r5, r2)     // Catch: java.lang.Exception -> L5c
            r5.getClass()     // Catch: java.lang.Exception -> L5c
            r0.d = r4     // Catch: java.lang.Exception -> L5c
            r0.c = r3     // Catch: java.lang.Exception -> L5c
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)     // Catch: java.lang.Exception -> L5c
            if (r6 != r1) goto L58
            return r1
        L58:
            r5 = r4
        L59:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch: java.lang.Exception -> L29
            return r6
        L5c:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L5f:
            enru r5 = r5.i
            ensk r5 = r5.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleGDitto"
            r5.Y(r0, r1)
            enrr r5 = (defpackage.enrr) r5
            ensk r5 = r5.g(r6)
            java.lang.String r6 = "getAccountAvatar"
            r0 = 396(0x18c, float:5.55E-43)
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl"
            java.lang.String r2 = "GaiaDevicePairingManagerImpl.kt"
            ensk r5 = r5.h(r1, r6, r0, r2)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "No able to get the avatar bitmap"
            r5.q(r6)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzjx.h(eixn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (r11.h(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r2.g(r12, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.bzju
            if (r0 == 0) goto L13
            r0 = r12
            bzju r0 = (defpackage.bzju) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzju r0 = new bzju
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.ffci.b(r12)
            goto L98
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            bzjx r11 = r0.d
            defpackage.ffci.b(r12)
            goto L8b
        L3c:
            java.lang.String r11 = r0.e
            bzjx r2 = r0.d
            defpackage.ffci.b(r12)
            r12 = r11
            r11 = r2
            goto L5d
        L46:
            defpackage.ffci.b(r12)
            bzic r12 = r10.f
            elfl r12 = r12.b(r11)
            r0.d = r10
            r0.e = r11
            r0.c = r6
            java.lang.Object r12 = defpackage.fgfz.c(r12, r0)
            if (r12 == r1) goto L9b
            r12 = r11
            r11 = r10
        L5d:
            enru r2 = r11.i
            ensk r2 = r2.h()
            ensn r6 = defpackage.ente.a
            java.lang.String r7 = "BugleGDitto"
            r2.Y(r6, r7)
            java.lang.String r6 = "optOutGaiaPairing"
            r7 = 276(0x114, float:3.87E-43)
            java.lang.String r8 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl"
            java.lang.String r9 = "GaiaDevicePairingManagerImpl.kt"
            ensk r2 = r2.h(r8, r6, r7, r9)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r6 = "Disabled Gaia device pairing"
            r2.q(r6)
            bzic r2 = r11.f
            r0.d = r11
            r0.e = r3
            r0.c = r5
            java.lang.Object r12 = r2.g(r12, r0)
            if (r12 == r1) goto L9b
        L8b:
            bzic r11 = r11.f
            r0.d = r3
            r0.c = r4
            java.lang.Object r11 = r11.h(r0)
            if (r11 != r1) goto L98
            goto L9b
        L98:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzjx.i(java.lang.String, ffgu):java.lang.Object");
    }

    public final void j(String str, bzkv bzkvVar) {
        ensk j = this.i.j();
        j.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) j).g(bzkvVar).h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl", "logGaiaPairingDisableFailure", 405, "GaiaDevicePairingManagerImpl.kt")).q("Failed to disable Gaia device pairing due to GaiaPairingOptOutException");
        ((akzt) this.g.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        akzt akztVar = (akzt) this.g.b();
        int i = bzkvVar.b;
        if (i == 0) {
            throw null;
        }
        akztVar.e(str, i - 1);
    }

    public final void k(String str, Throwable th) {
        ensk j = this.i.j();
        j.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl", "logGaiaPairingDisableFailure", 419, "GaiaDevicePairingManagerImpl.kt")).q("Failed to disable Gaia device pairing due to unknown error");
        ((akzt) this.g.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        ((akzt) this.g.b()).e(str, 0);
    }
}
