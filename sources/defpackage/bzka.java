package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzka implements bzjz {
    public final ffbr a;
    public final ejar b;
    public final ffbr c;
    public final cskc d;
    public final enru e;
    private final Context f;
    private final ffsk g;

    /* compiled from: PG */
    public interface a {
        bzic aI();
    }

    public bzka(Context context, ffsk ffskVar, ffbr ffbrVar, ejar ejarVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ejarVar.getClass();
        ffbrVar2.getClass();
        this.f = context;
        this.g = ffskVar;
        this.a = ffbrVar;
        this.b = ejarVar;
        this.c = ffbrVar2;
        this.d = cskc.g("BugleGDitto", "GaiaDevicePairingOptOutManagerImpl");
        this.e = enru.c("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingOptOutManagerImpl");
    }

    @Override // defpackage.bzjz
    public final elfl a() {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new bzkb(this, null));
        return c;
    }

    @Override // defpackage.bzjz
    public final elfl b(eisx eisxVar) {
        elfl c;
        eisxVar.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new bzkd(eisxVar, this, null));
        return c;
    }

    @Override // defpackage.bzjz
    public final elfl c(eiyc eiycVar) {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new bzkf(eiycVar, this, null));
        return c;
    }

    @Override // defpackage.bzjz
    public final elfl d(eisx eisxVar) {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new bzkk(eisxVar, this, null));
        return c;
    }

    public final a e(eisx eisxVar) {
        Object a2 = ekhv.a(this.f, a.class, eisxVar);
        a2.getClass();
        return (a) a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r12.k(4, r11, true, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.bzkg
            if (r0 == 0) goto L13
            r0 = r12
            bzkg r0 = (defpackage.bzkg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bzkg r0 = new bzkg
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L49
            if (r2 == r6) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r5) goto L2f
            defpackage.ffci.b(r12)
            goto L86
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            java.lang.Object r11 = r0.a
            java.lang.String r11 = (java.lang.String) r11
            defpackage.ffci.b(r12)
            goto L75
        L3f:
            java.lang.String r11 = r0.e
            java.lang.Object r2 = r0.a
            bzka r2 = (defpackage.bzka) r2
            defpackage.ffci.b(r12)
            goto L60
        L49:
            defpackage.ffci.b(r12)
            bzku r12 = defpackage.bzkv.a
            bzkh r2 = new bzkh
            r2.<init>(r10, r7)
            r0.a = r10
            r0.e = r11
            r0.d = r6
            java.lang.Object r12 = r12.a(r11, r5, r2, r0)
            if (r12 == r1) goto L89
            r2 = r10
        L60:
            eisx r12 = (defpackage.eisx) r12
            bzku r8 = defpackage.bzkv.a
            bzki r9 = new bzki
            r9.<init>(r2, r7)
            r0.a = r11
            r0.e = r7
            r0.d = r4
            java.lang.Object r12 = r8.a(r12, r3, r9, r0)
            if (r12 == r1) goto L89
        L75:
            bzka$a r12 = (bzka.a) r12
            bzic r12 = r12.aI()
            r0.a = r7
            r0.d = r5
            java.lang.Object r11 = r12.k(r3, r11, r6, r0)
            if (r11 != r1) goto L86
            goto L89
        L86:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzka.f(java.lang.String, ffgu):java.lang.Object");
    }

    public final void g(String str, bzkv bzkvVar) {
        this.d.s("GaiaPairingOptOutException while opting out Gaia device pairing", bzkvVar);
        ((akzt) this.c.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        akzt akztVar = (akzt) this.c.b();
        int i = bzkvVar.b;
        if (i == 0) {
            throw null;
        }
        akztVar.e(str, i - 1);
    }

    public final void h(String str, Throwable th) {
        this.d.s("Unknown error while opting out Gaia device pairing", th);
        ((akzt) this.c.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        ((akzt) this.c.b()).e(str, 0);
    }
}
