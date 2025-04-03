package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzid implements bzic {
    public final eisx a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final chvu e;
    public final ffbr f;
    public final ffbr g;
    public final ffsk h;
    public final ejar i;
    public final Context j;
    public final ffbr k;
    public final enru l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    /* compiled from: PG */
    public interface a {
        bzid aJ();
    }

    public bzid(eisx eisxVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, chvu chvuVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffsk ffskVar, ejar ejarVar, Context context, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14) {
        eisxVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar11.getClass();
        ffskVar.getClass();
        ejarVar.getClass();
        context.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        this.a = eisxVar;
        this.b = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
        this.e = chvuVar;
        this.o = ffbrVar6;
        this.p = ffbrVar9;
        this.f = ffbrVar10;
        this.g = ffbrVar11;
        this.h = ffskVar;
        this.i = ejarVar;
        this.j = context;
        this.k = ffbrVar12;
        this.q = ffbrVar13;
        this.r = ffbrVar14;
        this.l = enru.c("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl");
    }

    public static final /* synthetic */ void x(bzid bzidVar, Throwable th) {
        int i;
        ensk j = bzidVar.l.j();
        j.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) j).g(th).h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "logGaiaPairingDisableFailure", 847, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Error when opting out Gaia device pairing");
        ((akzt) bzidVar.k.b()).e("Bugle.Gaia.Pairing.Disabled.Count", 2);
        if (th instanceof bzkv) {
            int i2 = ((bzkv) th).b;
            if (i2 == 0) {
                throw null;
            }
            i = i2 - 1;
        } else {
            i = 0;
        }
        ((akzt) bzidVar.k.b()).e("Bugle.Gaia.Pairing.Disabled.When.Switching.Account.Failure.Count", i);
    }

    private static final String z(int i, boolean z) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? i2 != 2 ? z ? "Bugle.Gaia.Pairing.Enabled.When.Resetting.Primary.Device.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Resetting.Primary.Device.Failure.Count" : z ? "Bugle.Gaia.Pairing.Enabled.When.Opening.Settings.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Opening.Settings.Failure.Count" : z ? "Bugle.Gaia.Pairing.Enabled.When.Switching.Account.Success.Count" : "Bugle.Gaia.Pairing.Enabled.When.Switching.Account.Failure.Count";
        }
        return null;
    }

    @Override // defpackage.bzic
    public final elfl a() {
        elfl d;
        ekzz f = eleg.f("GaiaDevicePairingManagerImpl#bindTachyon");
        try {
            if (!((aslq) this.r.b()).a() || ((cspt) this.q.b()).a()) {
                ensk h = this.l.h();
                h.Y(ente.a, "BugleGDitto");
                ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "bindTachyon", 561, "GaiaDevicePairingManagerDelegateImpl.kt")).q("tachyonReceiver startBind");
                d = ((cilj) this.f.b()).d();
            } else {
                ensk h2 = this.l.h();
                h2.Y(ente.a, "BugleGDitto");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "bindTachyon", 558, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Device data over satellite, skipping start bind");
                d = elfo.e(null);
            }
            ffig.a(f, null);
            d.getClass();
            return d;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.bzic
    public final elfl b(String str) {
        elfl c;
        str.getClass();
        c = axol.c(this.h, ffhe.a, ffsm.a, new bzig(str, this, null));
        return c;
    }

    @Override // defpackage.bzic
    public final elfl c() {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new bzjk(this, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0201, code lost:
    
        if (defpackage.fgfz.c(r1, r2) != r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        if (r1 != r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cb, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // defpackage.bzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.bzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.e(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (defpackage.ffkj.e(r8, r7) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.bzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bzim
            if (r0 == 0) goto L13
            r0 = r8
            bzim r0 = (defpackage.bzim) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bzim r0 = new bzim
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.a
            java.lang.String r7 = (java.lang.String) r7
            defpackage.ffci.b(r8)
            goto L80
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.String r7 = r0.e
            java.lang.Object r2 = r0.a
            bzid r2 = (defpackage.bzid) r2
            defpackage.ffci.b(r8)
            goto L5d
        L41:
            defpackage.ffci.b(r8)
            ffbr r8 = r6.c
            java.lang.Object r8 = r8.b()
            bzgw r8 = (defpackage.bzgw) r8
            elfl r8 = r8.e()
            r0.a = r6
            r0.e = r7
            r0.d = r4
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto L95
            r2 = r6
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L67
        L65:
            r4 = r5
            goto L90
        L67:
            ffbr r8 = r2.c
            java.lang.Object r8 = r8.b()
            bzgw r8 = (defpackage.bzgw) r8
            elfl r8 = r8.c()
            r0.a = r7
            r2 = 0
            r0.e = r2
            r0.d = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 == r1) goto L95
        L80:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L65
            int r0 = r8.length()
            if (r0 <= 0) goto L65
            boolean r7 = defpackage.ffkj.e(r8, r7)
            if (r7 == 0) goto L65
        L90:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.f(java.lang.String, ffgu):java.lang.Object");
    }

    @Override // defpackage.bzic
    public final Object g(String str, ffgu ffguVar) {
        Object c = bzkv.a.c(str, 8, new bzjl(this, null), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    @Override // defpackage.bzic
    public final Object h(ffgu ffguVar) {
        Object b = bzkv.a.b(9, new bzjm(this, null), ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    @Override // defpackage.bzic
    public final elfl i(int i) {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new bziu(this, i, null));
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(2:17|18))(9:19|20|21|22|23|(1:25)|26|27|28))(10:51|52|53|54|(1:57)|23|(0)|26|27|28))(5:59|60|61|(8:63|54|(1:57)|23|(0)|26|27|28)|42))(2:65|66))(3:69|(5:73|74|75|76|77)(1:71)|72)|67))|87|6|7|(0)(0)|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0199, code lost:
    
        if (r12.v(r2) == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        if (r10.t(r0, r2) == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cd, code lost:
    
        if (r0.c(8, r15, r2) == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a2, code lost:
    
        if (s(r2) == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r12 = r11;
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0117 A[Catch: all -> 0x006f, TryCatch #4 {all -> 0x006f, blocks: (B:23:0x0105, B:25:0x0117, B:26:0x0122, B:53:0x006a, B:54:0x00e8, B:57:0x00f2), top: B:52:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13, types: [bzid, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // defpackage.bzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(boolean r18, int r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.j(boolean, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r11.u(r10, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r12.h(r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r12.g(r11, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.bzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r10, java.lang.String r11, boolean r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.k(int, java.lang.String, boolean, ffgu):java.lang.Object");
    }

    @Override // defpackage.bzic
    public final elfl l(eiyc eiycVar) {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new bziv(eiycVar, this, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.bzie
            if (r0 == 0) goto L13
            r0 = r11
            bzie r0 = (defpackage.bzie) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzie r0 = new bzie
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            java.lang.String r4 = "cleanupQrPairing"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r6 = "GaiaDevicePairingManagerDelegateImpl.kt"
            java.lang.String r7 = "BugleGDitto"
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            bzid r0 = r0.d
            defpackage.ffci.b(r11)
            goto Lda
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3a:
            defpackage.ffci.b(r11)
            ffbr r11 = r10.d
            java.lang.Object r11 = r11.b()
            bzgd r11 = (defpackage.bzgd) r11
            defpackage.efbd.b()
            bsuz r2 = defpackage.bsve.a()
            java.lang.String r8 = "getQrDesktops"
            r2.z(r8)
            bzer r8 = new bzer
            r8.<init>()
            r2.f(r8)
            bsux r2 = r2.b()
            engw r2 = r2.y()
            engw r11 = r11.k(r2)
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L86
            enru r11 = r10.l
            ensk r11 = r11.h()
            ensn r0 = defpackage.ente.a
            r11.Y(r0, r7)
            r0 = 387(0x183, float:5.42E-43)
            ensk r11 = r11.h(r5, r4, r0, r6)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "No QR paired devices to cleanup"
            r11.q(r0)
            ffcu r11 = defpackage.ffcu.a
            return r11
        L86:
            enru r2 = r10.l
            ensk r2 = r2.h()
            ensn r8 = defpackage.ente.a
            r2.Y(r8, r7)
            r8 = 390(0x186, float:5.47E-43)
            ensk r2 = r2.h(r5, r4, r8, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r8 = "Start cleaning up existing QR paired devices"
            r2.q(r8)
            r11.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.ffdx.n(r11, r8)
            r2.<init>(r8)
            enqv r11 = r11.iterator()
        Lb0:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto Lce
            java.lang.Object r8 = r11.next()
            bzej r8 = (defpackage.bzej) r8
            chvu r9 = r10.e
            bzge r8 = r8.c()
            elfl r8 = r9.b(r8)
            ffss r8 = defpackage.axol.e(r8)
            r2.add(r8)
            goto Lb0
        Lce:
            r0.d = r10
            r0.c = r3
            java.lang.Object r11 = defpackage.ffqv.a(r2, r0)
            if (r11 != r1) goto Ld9
            return r1
        Ld9:
            r0 = r10
        Lda:
            enru r11 = r0.l
            ensk r11 = r11.h()
            ensn r0 = defpackage.ente.a
            r11.Y(r0, r7)
            r0 = 396(0x18c, float:5.55E-43)
            ensk r11 = r11.h(r5, r4, r0, r6)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "Completed cleaning up existing QR paired devices"
            r11.q(r0)
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.m(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bzih
            if (r0 == 0) goto L13
            r0 = r10
            bzih r0 = (defpackage.bzih) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzih r0 = new bzih
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r9 = r0.e
            bzid r0 = r0.d
            defpackage.ffci.b(r10)
            goto L4f
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.ffci.b(r10)
            ffbr r10 = r8.c
            java.lang.Object r10 = r10.b()
            bzgw r10 = (defpackage.bzgw) r10
            elfl r10 = r10.c()
            r0.d = r8
            r0.e = r9
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)
            if (r10 == r1) goto Lca
            r0 = r8
        L4f:
            java.lang.String r10 = (java.lang.String) r10
            r1 = 0
            java.lang.String r2 = "disablePairingCore"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r5 = "GaiaDevicePairingManagerDelegateImpl.kt"
            java.lang.String r6 = "BugleGDitto"
            if (r10 == 0) goto Lac
            int r7 = r10.length()
            if (r7 != 0) goto L63
            goto Lac
        L63:
            boolean r9 = defpackage.ffkj.e(r10, r9)
            if (r9 != 0) goto L88
            enru r9 = r0.l
            ensk r9 = r9.j()
            ensn r10 = defpackage.ente.a
            r9.Y(r10, r6)
            r10 = 529(0x211, float:7.41E-43)
            ensk r9 = r9.h(r4, r2, r10, r5)
            enrr r9 = (defpackage.enrr) r9
            eisx r10 = r0.a
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Cannot disable the Gaia pairing as it is enabled for another account, accountId = %s"
            r9.t(r0, r10)
            goto Lc4
        L88:
            ffbr r9 = r0.c
            java.lang.Object r9 = r9.b()
            bzgw r9 = (defpackage.bzgw) r9
            r9.k()
            enru r9 = r0.l
            ensk r9 = r9.h()
            ensn r10 = defpackage.ente.a
            r9.Y(r10, r6)
            r10 = 537(0x219, float:7.52E-43)
            ensk r9 = r9.h(r4, r2, r10, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Gaia device pairing has been disabled"
            r9.q(r10)
            goto Lc5
        Lac:
            enru r9 = r0.l
            ensk r9 = r9.j()
            ensn r10 = defpackage.ente.a
            r9.Y(r10, r6)
            r10 = 523(0x20b, float:7.33E-43)
            ensk r9 = r9.h(r4, r2, r10, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "No need to disable the Gaia pairing as it is already disabled on the device"
            r9.q(r10)
        Lc4:
            r3 = r1
        Lc5:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.n(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bzik
            if (r0 == 0) goto L13
            r0 = r5
            bzik r0 = (defpackage.bzik) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzik r0 = new bzik
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.n
            java.lang.Object r5 = r5.b()
            axkm r5 = (defpackage.axkm) r5
            elfl r5 = r5.r()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.o(ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:(8:10|11|12|13|14|(1:22)|19|20)(2:26|27))(1:28))(3:37|(1:39)|34)|29|30|31|(7:33|13|14|(0)|22|19|20)|34))|40|6|(0)(0)|29|30|31|(0)|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        r1 = r7;
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bzin
            if (r0 == 0) goto L13
            r0 = r7
            bzin r0 = (defpackage.bzin) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzin r0 = new bzin
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            axeu r1 = r0.e
            bzid r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: defpackage.babn -> L6c
            goto L67
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            bzid r2 = r0.d
            defpackage.ffci.b(r7)
            goto L4a
        L3c:
            defpackage.ffci.b(r7)
            r0.d = r6
            r0.c = r4
            java.lang.Object r7 = r6.o(r0)
            if (r7 == r1) goto L8f
            r2 = r6
        L4a:
            axeu r7 = (defpackage.axeu) r7
            ffbr r5 = r2.m     // Catch: defpackage.babn -> L6a
            java.lang.Object r5 = r5.b()     // Catch: defpackage.babn -> L6a
            babf r5 = (defpackage.babf) r5     // Catch: defpackage.babn -> L6a
            elfl r5 = r5.a()     // Catch: defpackage.babn -> L6a
            r0.d = r2     // Catch: defpackage.babn -> L6a
            r0.e = r7     // Catch: defpackage.babn -> L6a
            r0.c = r3     // Catch: defpackage.babn -> L6a
            java.lang.Object r0 = defpackage.fgfz.c(r5, r0)     // Catch: defpackage.babn -> L6a
            if (r0 == r1) goto L8f
            r1 = r7
            r7 = r0
            r0 = r2
        L67:
            eisx r7 = (defpackage.eisx) r7     // Catch: defpackage.babn -> L6c
            goto L6d
        L6a:
            r1 = r7
            r0 = r2
        L6c:
            r7 = 0
        L6d:
            ffbr r2 = r0.n
            java.lang.Object r2 = r2.b()
            axkm r2 = (defpackage.axkm) r2
            axkl r2 = r2.n
            boolean r1 = defpackage.axkl.f(r1)
            r2 = 0
            if (r1 == 0) goto L89
            if (r7 == 0) goto L89
            eisx r0 = r0.a
            boolean r7 = defpackage.ffkj.e(r7, r0)
            if (r7 == 0) goto L89
            goto L8a
        L89:
            r4 = r2
        L8a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.p(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bzio
            if (r0 == 0) goto L13
            r0 = r5
            bzio r0 = (defpackage.bzio) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzio r0 = new bzio
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.g
            java.lang.Object r5 = r5.b()
            cgxw r5 = (defpackage.cgxw) r5
            elfl r5 = r5.m()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto L54
        L46:
            fccx r5 = (defpackage.fccx) r5
            fbye r5 = r5.e
            if (r5 != 0) goto L4e
            fbye r5 = defpackage.fbye.a
        L4e:
            eygr r5 = r5.b
            r5.getClass()
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.q(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r11.k(2, r10, true, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bziw
            if (r0 == 0) goto L13
            r0 = r11
            bziw r0 = (defpackage.bziw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bziw r0 = new bziw
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r11)
            goto L86
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.a
            java.lang.String r10 = (java.lang.String) r10
            defpackage.ffci.b(r11)
            goto L75
        L3e:
            java.lang.String r10 = r0.e
            java.lang.Object r2 = r0.a
            bzid r2 = (defpackage.bzid) r2
            defpackage.ffci.b(r11)
            goto L5f
        L48:
            defpackage.ffci.b(r11)
            bzku r11 = defpackage.bzkv.a
            bzix r2 = new bzix
            r2.<init>(r9, r6)
            r0.a = r9
            r0.e = r10
            r0.d = r5
            java.lang.Object r11 = r11.a(r10, r3, r2, r0)
            if (r11 == r1) goto L89
            r2 = r9
        L5f:
            eisx r11 = (defpackage.eisx) r11
            bzku r7 = defpackage.bzkv.a
            bziy r8 = new bziy
            r8.<init>(r2, r6)
            r0.a = r10
            r0.e = r6
            r0.d = r4
            r2 = 4
            java.lang.Object r11 = r7.a(r11, r2, r8, r0)
            if (r11 == r1) goto L89
        L75:
            bzid$a r11 = (bzid.a) r11
            bzid r11 = r11.aJ()
            r0.a = r6
            r0.d = r3
            java.lang.Object r10 = r11.k(r4, r10, r5, r0)
            if (r10 != r1) goto L86
            goto L89
        L86:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.r(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bziz
            if (r0 == 0) goto L13
            r0 = r7
            bziz r0 = (defpackage.bziz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bziz r0 = new bziz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            bzkq r1 = r0.e
            bzid r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5d
        L2b:
            r7 = move-exception
            goto L86
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.ffci.b(r7)
            bzkq r7 = new bzkq
            r2 = 7
            r7.<init>(r2)
            ffbr r2 = r6.p     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L83
            bzef r2 = (defpackage.bzef) r2     // Catch: java.lang.Throwable -> L83
            r4 = 2
            elfl r2 = r2.p(r4)     // Catch: java.lang.Throwable -> L83
            r2.getClass()     // Catch: java.lang.Throwable -> L83
            r0.d = r6     // Catch: java.lang.Throwable -> L83
            r0.e = r7     // Catch: java.lang.Throwable -> L83
            r0.c = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)     // Catch: java.lang.Throwable -> L83
            if (r0 == r1) goto L82
            r1 = r7
            r7 = r0
            r0 = r6
        L5d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L2b
            enru r0 = r0.l     // Catch: java.lang.Throwable -> L2b
            ensk r0 = r0.h()     // Catch: java.lang.Throwable -> L2b
            ensn r2 = defpackage.ente.a     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "BugleGDitto"
            r0.Y(r2, r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r3 = "pauseQrPush"
            java.lang.String r4 = "GaiaDevicePairingManagerDelegateImpl.kt"
            r5 = 644(0x284, float:9.02E-43)
            ensk r0 = r0.h(r2, r3, r5, r4)     // Catch: java.lang.Throwable -> L2b
            enrr r0 = (defpackage.enrr) r0     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "PausePush before opting into Gaia pairing, result = %s"
            r0.t(r2, r7)     // Catch: java.lang.Throwable -> L2b
            ffcu r7 = defpackage.ffcu.a
            return r7
        L82:
            return r1
        L83:
            r0 = move-exception
            r1 = r7
            r7 = r0
        L86:
            java.lang.Throwable r7 = r1.initCause(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.s(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r10, defpackage.ffgu r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bzja
            if (r0 == 0) goto L13
            r0 = r11
            bzja r0 = (defpackage.bzja) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzja r0 = new bzja
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            bzkq r10 = r0.d
            defpackage.ffci.b(r11)     // Catch: java.lang.Throwable -> L29
            goto L79
        L29:
            r11 = move-exception
            goto L83
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.ffci.b(r11)
            bzkq r11 = new bzkq
            r2 = 9
            r11.<init>(r2)
            enru r2 = r9.l     // Catch: java.lang.Throwable -> L7f
            ensk r2 = r2.h()     // Catch: java.lang.Throwable -> L7f
            ensn r4 = defpackage.ente.a     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "BugleGDitto"
            r2.Y(r4, r5)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r5 = "pushGaiaOptIn"
            java.lang.String r6 = "GaiaDevicePairingManagerDelegateImpl.kt"
            r7 = 656(0x290, float:9.19E-43)
            ensk r2 = r2.h(r4, r5, r7, r6)     // Catch: java.lang.Throwable -> L7f
            enrr r2 = (defpackage.enrr) r2     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "Push gaia opt in to all active desktops"
            r2.q(r4)     // Catch: java.lang.Throwable -> L7f
            ffbr r2 = r9.p     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L7f
            bzef r2 = (defpackage.bzef) r2     // Catch: java.lang.Throwable -> L7f
            elfl r10 = r2.e(r10, r3)     // Catch: java.lang.Throwable -> L7f
            r10.getClass()     // Catch: java.lang.Throwable -> L7f
            r0.d = r11     // Catch: java.lang.Throwable -> L7f
            r0.c = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r10 = defpackage.fgfz.c(r10, r0)     // Catch: java.lang.Throwable -> L7f
            if (r10 == r1) goto L7e
            r8 = r11
            r11 = r10
            r10 = r8
        L79:
            java.lang.Void r11 = (java.lang.Void) r11     // Catch: java.lang.Throwable -> L29
            ffcu r10 = defpackage.ffcu.a
            return r10
        L7e:
            return r1
        L7f:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L83:
            java.lang.Throwable r10 = r10.initCause(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.t(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.u(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.bzjd
            if (r0 == 0) goto L13
            r0 = r9
            bzjd r0 = (defpackage.bzjd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzjd r0 = new bzjd
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "resumeQrPush"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r5 = "GaiaDevicePairingManagerDelegateImpl.kt"
            java.lang.String r6 = "BugleGDitto"
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 != r7) goto L33
            bzid r0 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L5a
        L31:
            r9 = move-exception
            goto L77
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            defpackage.ffci.b(r9)
            ffbr r9 = r8.p     // Catch: java.lang.Throwable -> L75
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> L75
            bzef r9 = (defpackage.bzef) r9     // Catch: java.lang.Throwable -> L75
            r2 = 2
            elfl r9 = r9.q(r2)     // Catch: java.lang.Throwable -> L75
            r9.getClass()     // Catch: java.lang.Throwable -> L75
            r0.d = r8     // Catch: java.lang.Throwable -> L75
            r0.c = r7     // Catch: java.lang.Throwable -> L75
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)     // Catch: java.lang.Throwable -> L75
            if (r9 != r1) goto L59
            return r1
        L59:
            r0 = r8
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L31
            enru r1 = r0.l     // Catch: java.lang.Throwable -> L31
            ensk r1 = r1.h()     // Catch: java.lang.Throwable -> L31
            ensn r2 = defpackage.ente.a     // Catch: java.lang.Throwable -> L31
            r1.Y(r2, r6)     // Catch: java.lang.Throwable -> L31
            r2 = 673(0x2a1, float:9.43E-43)
            ensk r1 = r1.h(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> L31
            enrr r1 = (defpackage.enrr) r1     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "ResumePush on Gaia pairing opt in error, result = %s"
            r1.t(r2, r9)     // Catch: java.lang.Throwable -> L31
            goto L95
        L75:
            r9 = move-exception
            r0 = r8
        L77:
            enru r0 = r0.l
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            ensk r9 = r0.g(r9)
            r0 = 675(0x2a3, float:9.46E-43)
            ensk r9 = r9.h(r4, r3, r0, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Failed to resume QR push on Gaia pairing opt in"
            r9.q(r0)
        L95:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.v(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r9, java.lang.String r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bzje
            if (r0 == 0) goto L13
            r0 = r11
            bzje r0 = (defpackage.bzje) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bzje r0 = new bzje
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "skipDisablingGaiaPairing"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl"
            java.lang.String r5 = "GaiaDevicePairingManagerDelegateImpl.kt"
            java.lang.String r6 = "BugleGDitto"
            r7 = 1
            if (r2 == 0) goto L39
            if (r2 != r7) goto L31
            bzid r9 = r0.d
            defpackage.ffci.b(r11)
            goto L76
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.ffci.b(r11)
            java.lang.String r11 = "pseudonymous"
            boolean r9 = defpackage.ffkj.e(r9, r11)
            if (r9 == 0) goto L61
            enru r9 = r8.l
            ensk r9 = r9.j()
            ensn r10 = defpackage.ente.a
            r9.Y(r10, r6)
            r10 = 829(0x33d, float:1.162E-42)
            ensk r9 = r9.h(r4, r3, r10, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "No need to opt out Gaia pairing for pseudonymous account"
            r9.q(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        L61:
            bzku r9 = defpackage.bzkv.a
            bzjf r11 = new bzjf
            r2 = 0
            r11.<init>(r8, r2)
            r0.d = r8
            r0.c = r7
            r2 = 6
            java.lang.Object r11 = r9.a(r10, r2, r11, r0)
            if (r11 != r1) goto L75
            return r1
        L75:
            r9 = r8
        L76:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r10 != 0) goto L9b
            enru r9 = r9.l
            ensk r9 = r9.h()
            ensn r10 = defpackage.ente.a
            r9.Y(r10, r6)
            r10 = 840(0x348, float:1.177E-42)
            ensk r9 = r9.h(r4, r3, r10, r5)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "No need to opt out Gaia pairing as it is already off"
            r9.q(r10)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        L9b:
            r9 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzid.w(java.lang.String, java.lang.String, ffgu):java.lang.Object");
    }

    public final Object y(String str) {
        bzia bziaVar;
        ekzz f = eleg.f("GaiaDevicePairingManagerImpl#findExistingPairingType");
        try {
            if (((bzgd) this.d.b()).a() == 0) {
                ensk e = this.l.e();
                e.Y(ente.a, "BugleGDitto");
                ((enrr) e.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 774, "GaiaDevicePairingManagerDelegateImpl.kt")).q("No existing pairing.");
                bziaVar = bzia.a;
            } else if (str != null && ((bzgd) this.d.b()).q(Optional.of(str))) {
                ensk e2 = this.l.e();
                e2.Y(ente.a, "BugleGDitto");
                ((enrr) e2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 779, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Existing pairings are Gaia pairings");
                bziaVar = bzia.c;
            } else if (((bzgd) this.d.b()).r()) {
                ensk e3 = this.l.e();
                e3.Y(ente.a, "BugleGDitto");
                ((enrr) e3.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 783, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Existing pairings are QR pairings");
                bziaVar = bzia.b;
            } else {
                ensk e4 = this.l.e();
                e4.Y(ente.a, "BugleGDitto");
                ((enrr) e4.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "findExistingPairingType", 787, "GaiaDevicePairingManagerDelegateImpl.kt")).q("No existing pairing for the current account.");
                bziaVar = bzia.a;
            }
            ffig.a(f, null);
            return bziaVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }
}
