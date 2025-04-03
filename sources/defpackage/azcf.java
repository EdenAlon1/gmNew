package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azcf implements azcn {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager");
    public final azac b;
    public final ffbr c;
    public final ffbr d;
    private final azac e;
    private final ffhd f;
    private final ffsk g;
    private final azpx h;
    private final azpo i;
    private final ffbr j;

    public azcf(azac azacVar, azac azacVar2, ffbr ffbrVar, ffbr ffbrVar2, ffhd ffhdVar, ffsk ffskVar, azpx azpxVar, azpo azpoVar, ffbr ffbrVar3) {
        azacVar.getClass();
        azacVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        azpxVar.getClass();
        azpoVar.getClass();
        ffbrVar3.getClass();
        this.e = azacVar;
        this.b = azacVar2;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.f = ffhdVar;
        this.g = ffskVar;
        this.h = azpxVar;
        this.i = azpoVar;
        this.j = ffbrVar3;
    }

    private final Object j(String str, azcg azcgVar, ffgu ffguVar) {
        return this.b.b(str, new azcb(this, str, azcgVar, null), ffguVar);
    }

    @Override // defpackage.azcn
    public final elfl a(awui awuiVar) {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new azbv(this, awuiVar, null));
        return c;
    }

    @Override // defpackage.azcn
    public final Object b(awui awuiVar, ffgu ffguVar) {
        int i = awuiVar.c;
        awuh b = awuh.b(i);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        if (b == awuh.GROUP) {
            throw new IllegalArgumentException("Group type not supported.");
        }
        String str = awuiVar.d;
        str.getClass();
        azbu azbuVar = new azbu();
        awuh b2 = awuh.b(i);
        if (b2 == null) {
            b2 = awuh.UNKNOWN_TYPE;
        }
        azcg apply = azbuVar.apply(b2);
        apply.getClass();
        return j(str, apply, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.azcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.azsu r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.azbw
            if (r0 == 0) goto L13
            r0 = r7
            azbw r0 = (defpackage.azbw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azbw r0 = new azbw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            azcf r6 = r0.d
            defpackage.ffci.b(r7)
            goto L48
        L38:
            defpackage.ffci.b(r7)
            azpx r7 = r5.h
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r7.f(r6, r0)
            if (r7 == r1) goto L7f
            r6 = r5
        L48:
            azop r7 = (defpackage.azop) r7
            azon r2 = r7.a()
            azon r4 = defpackage.azon.a
            if (r2 != r4) goto L77
            azpo r2 = r6.i
            azpp r7 = r2.a(r7)
            j$.util.Optional r7 = r7.b()
            r7.getClass()
            java.lang.Object r7 = defpackage.fflm.b(r7)
            java.lang.String r7 = (java.lang.String) r7
            r2 = 0
            if (r7 != 0) goto L69
            return r2
        L69:
            azcg r4 = defpackage.azcg.a
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.j(r7, r4, r0)
            if (r6 != r1) goto L76
            goto L7f
        L76:
            return r6
        L77:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcf.c(azsu, ffgu):java.lang.Object");
    }

    @Override // defpackage.azcn
    public final Object d(azcr azcrVar, ffgu ffguVar) {
        return this.e.b(azcrVar, new azbx(azcrVar, this, null), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Iterable r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.azby
            if (r0 == 0) goto L13
            r0 = r7
            azby r0 = (defpackage.azby) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azby r0 = new azby
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            azac r7 = r5.e
            java.util.Set r6 = defpackage.ffdx.ar(r6)
            azbz r2 = new azbz
            r4 = 0
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r7 = r7.c(r6, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r6 = r7.values()
            java.util.List r6 = defpackage.ffdx.ak(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcf.e(java.lang.Iterable, ffgu):java.lang.Object");
    }

    @Override // defpackage.azcn
    public final Object f(fcek fcekVar, ffgu ffguVar) {
        azcg azcgVar;
        String str = fcekVar.c;
        str.getClass();
        fgtg b = fgtg.b(fcekVar.b);
        if (b == null) {
            b = fgtg.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            azcgVar = azcg.a;
        } else if (ordinal == 2) {
            azcgVar = azcg.c;
        } else if (ordinal == 10) {
            azcgVar = azcg.b;
        } else {
            if (ordinal != 41) {
                fgtg b2 = fgtg.b(fcekVar.b);
                if (b2 == null) {
                    b2 = fgtg.UNRECOGNIZED;
                }
                throw new IllegalArgumentException(a.i(b2, "Tachyon ID type ", " cannot be converted to a Destination AddressType."));
            }
            azcgVar = azcg.d;
        }
        return j(str, azcgVar, ffguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (r12 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r10, defpackage.azcg r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.azca
            if (r0 == 0) goto L13
            r0 = r12
            azca r0 = (defpackage.azca) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azca r0 = new azca
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            azcf r10 = r0.d
            defpackage.ffci.b(r12)
            goto L9f
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            azcg r11 = r0.f
            java.lang.String r10 = r0.e
            azcf r2 = r0.d
            defpackage.ffci.b(r12)
            r12 = r11
            r11 = r10
            r10 = r2
            goto L68
        L43:
            defpackage.ffci.b(r12)
            r0.d = r9
            r0.e = r10
            r0.f = r11
            r0.c = r4
            ffhd r12 = r9.f
            ffhd r12 = defpackage.ekxi.a(r12)
            azce r2 = new azce
            r2.<init>(r5, r11, r10, r9)
            java.lang.Object r12 = defpackage.ffra.a(r12, r2, r0)
            ffhh r2 = defpackage.ffhh.a
            if (r12 == r2) goto L63
            ffcu r12 = defpackage.ffcu.a
        L63:
            if (r12 == r1) goto Lab
            r12 = r11
            r11 = r10
            r10 = r9
        L68:
            enru r2 = defpackage.azcf.a
            ensk r2 = r2.e()
            ensn r4 = defpackage.ente.a
            java.lang.String r6 = "BugleCME"
            r2.Y(r4, r6)
            java.lang.String r4 = "matchExactOrCreate"
            r6 = 151(0x97, float:2.12E-43)
            java.lang.String r7 = "com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager"
            java.lang.String r8 = "CachingDestinationManager.kt"
            ensk r2 = r2.h(r7, r4, r6, r8)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r4 = "Cache miss matching destination. Loading from database."
            r2.q(r4)
            ffbr r2 = r10.c
            java.lang.Object r2 = r2.b()
            azci r2 = (defpackage.azci) r2
            r0.d = r10
            r0.e = r5
            r0.f = r5
            r0.c = r3
            java.lang.Object r12 = r2.b(r11, r12, r0)
            if (r12 != r1) goto L9f
            goto Lab
        L9f:
            azch r12 = (defpackage.azch) r12
            azcr r11 = r12.a
            azac r10 = r10.e
            r10.d(r11, r12)
            azcr r10 = r12.a
            return r10
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcf.g(java.lang.String, azcg, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.azcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.azcr r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.azcc
            if (r0 == 0) goto L13
            r0 = r8
            azcc r0 = (defpackage.azcc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azcc r0 = new azcc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            azcr r7 = r0.e
            azcf r2 = r0.d
            defpackage.ffci.b(r8)
            goto L4b
        L3a:
            defpackage.ffci.b(r8)
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 != r1) goto L4a
            goto L89
        L4a:
            r2 = r6
        L4b:
            azch r8 = (defpackage.azch) r8
            azcg r5 = r8.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto La5
            if (r5 == r4) goto L8b
            if (r5 == r3) goto L7c
            r7 = 3
            if (r5 != r7) goto L76
            awui r7 = defpackage.awui.a
            eyfq r7 = r7.createBuilder()
            awuf r7 = (defpackage.awuf) r7
            r7.getClass()
            java.lang.String r8 = r8.c
            defpackage.awuj.b(r8, r7)
            awuh r8 = defpackage.awuh.EMERGENCY
            defpackage.awuj.c(r8, r7)
            awui r7 = defpackage.awuj.a(r7)
            return r7
        L76:
            ffcd r7 = new ffcd
            r7.<init>()
            throw r7
        L7c:
            r8 = 0
            r0.d = r8
            r0.e = r8
            r0.c = r3
            java.lang.Object r7 = r2.i(r7, r0)
            if (r7 != r1) goto L8a
        L89:
            return r1
        L8a:
            return r7
        L8b:
            awui r7 = defpackage.awui.a
            eyfq r7 = r7.createBuilder()
            awuf r7 = (defpackage.awuf) r7
            r7.getClass()
            java.lang.String r8 = r8.c
            defpackage.awuj.b(r8, r7)
            awuh r8 = defpackage.awuh.BOT
            defpackage.awuj.c(r8, r7)
            awui r7 = defpackage.awuj.a(r7)
            return r7
        La5:
            awui r7 = defpackage.awui.a
            eyfq r7 = r7.createBuilder()
            awuf r7 = (defpackage.awuf) r7
            r7.getClass()
            java.lang.String r8 = r8.c
            defpackage.awuj.b(r8, r7)
            awuh r8 = defpackage.awuh.PHONE
            defpackage.awuj.c(r8, r7)
            awui r7 = defpackage.awuj.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcf.h(azcr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.azcr r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.azcd
            if (r0 == 0) goto L13
            r0 = r7
            azcd r0 = (defpackage.azcd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azcd r0 = new azcd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            azcf r6 = r0.d
            defpackage.ffci.b(r7)
            goto L4e
        L38:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.j
            java.lang.Object r7 = r7.b()
            azfv r7 = (defpackage.azfv) r7
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r7.i(r6, r0)
            if (r7 == r1) goto L73
            r6 = r5
        L4e:
            azhq r7 = (defpackage.azhq) r7
            ffbr r6 = r6.j
            java.lang.Object r6 = r6.b()
            azfv r6 = (defpackage.azfv) r6
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r7 = r6.f(r7, r0)
            if (r7 == r1) goto L73
        L63:
            azfh r7 = (defpackage.azfh) r7
            awwf r6 = r7.a()
            awui r6 = r6.d
            if (r6 != 0) goto L6f
            awui r6 = defpackage.awui.a
        L6f:
            r6.getClass()
            return r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcf.i(azcr, ffgu):java.lang.Object");
    }
}
