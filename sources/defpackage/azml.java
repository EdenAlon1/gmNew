package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azml implements azpx, azqd, azmp {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/core/myidentity/CachedMyIdentityManager");
    public final azoz b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;
    private final ffsk f;
    private final auie g;
    private final asna h;
    private final emar i = new emar();

    public azml(azoz azozVar, ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffsk ffskVar2, auie auieVar, asna asnaVar) {
        this.b = azozVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffskVar;
        this.f = ffskVar2;
        this.g = auieVar;
        this.h = asnaVar;
    }

    private final Object l(ffgu ffguVar) {
        return emau.a(this.f, this.i, new azmc(this, null)).c(ffguVar);
    }

    private final Object m(ffgu ffguVar) {
        engw a2 = this.b.a();
        if (!a2.isEmpty()) {
            return a2;
        }
        Object l = l(ffguVar);
        return l == ffhh.a ? l : (Iterable) l;
    }

    @Override // defpackage.azpx
    public final elfl a() {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new azma(this, null));
        return c;
    }

    @Override // defpackage.azpx
    public final elfl b(azsu azsuVar) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new azmg(this, azsuVar, null));
        return c;
    }

    @Override // defpackage.azqd
    @ffbs
    public final elfl c() {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new azmk(this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.azpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.azlz
            if (r0 == 0) goto L13
            r0 = r7
            azlz r0 = (defpackage.azlz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            azlz r0 = new azlz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r7)
            goto L55
        L38:
            defpackage.ffci.b(r7)
            azoz r7 = r6.b
            enip r7 = r7.a
            r7.getClass()
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L93
            r0.a = r7
            r0.d = r4
            java.lang.Object r0 = r6.m(r0)
            if (r0 == r1) goto La9
            r5 = r0
            r0 = r7
            r7 = r5
        L55:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L60:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r7.next()
            r3 = r2
            azop r3 = (defpackage.azop) r3
            azsu r3 = r3.b()
            r4 = r0
            enip r4 = (defpackage.enip) r4
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L60
            r1.add(r2)
            goto L60
        L7e:
            int r7 = r1.size()
            enip r0 = (defpackage.enip) r0
            int r0 = r0.size()
            if (r7 != r0) goto L8b
            return r1
        L8b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        L93:
            r0.d = r3
            ffsk r7 = r6.f
            emar r2 = r6.i
            azly r3 = new azly
            r4 = 0
            r3.<init>(r6, r4)
            ffss r7 = defpackage.emau.a(r7, r2, r3)
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto Laa
        La9:
            return r1
        Laa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azml.d(ffgu):java.lang.Object");
    }

    @Override // defpackage.azpx
    public final Object e(ffgu ffguVar) {
        return m(ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.azpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.azsu r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.azmd
            if (r0 == 0) goto L13
            r0 = r7
            azmd r0 = (defpackage.azmd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azmd r0 = new azmd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            azsu r6 = r0.e
            azml r0 = r0.d
            defpackage.ffci.b(r7)
            goto L70
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            azsu r6 = r0.e
            azml r0 = r0.d
            defpackage.ffci.b(r7)
            goto L81
        L3e:
            defpackage.ffci.b(r7)
            azoz r7 = r5.b
            j$.util.Optional r7 = r7.b(r6)
            boolean r2 = r7.isPresent()
            if (r2 == 0) goto L52
            java.lang.Object r6 = r7.get()
            return r6
        L52:
            auie r7 = r5.g
            boolean r7 = r7.a()
            if (r7 != 0) goto L73
            asna r7 = r5.h
            boolean r7 = r7.a()
            if (r7 != 0) goto L73
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r5.m(r0)
            if (r7 != r1) goto L6f
            goto L7f
        L6f:
            r0 = r5
        L70:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            goto L83
        L73:
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = r5.l(r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            r0 = r5
        L81:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
        L83:
            azoz r7 = r0.b
            j$.util.Optional r7 = r7.b(r6)
            boolean r0 = r7.isPresent()
            if (r0 == 0) goto L94
            java.lang.Object r6 = r7.get()
            return r6
        L94:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "No MyIdentity found for token "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azml.f(azsu, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        if (r11 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.azpx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azml.g(int, ffgu):java.lang.Object");
    }

    @Override // defpackage.azqd
    public final Object h(ffgu ffguVar) {
        Object c = emau.a(this.f, this.i, new azmi(this, null)).c(ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.azmb
            if (r0 == 0) goto L13
            r0 = r5
            azmb r0 = (defpackage.azmb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azmb r0 = new azmb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            azml r0 = r0.d
            defpackage.ffci.b(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.c
            java.lang.Object r5 = r5.b()
            azpx r5 = (defpackage.azpx) r5
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            azoz r1 = r0.b
            r1.d(r5)
            azoz r5 = r0.b
            engw r5 = r5.a()
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azml.i(ffgu):java.lang.Object");
    }

    @Override // defpackage.azpx
    public final void j(azmp azmpVar) {
        azmpVar.getClass();
        ((azpx) this.c.b()).j(azmpVar);
    }

    @Override // defpackage.azpx
    public final void k(azmp azmpVar) {
        azmpVar.getClass();
        ((azpx) this.c.b()).k(azmpVar);
    }

    @Override // defpackage.azmp
    public final Object n(Iterable iterable, Iterable iterable2, ffgu ffguVar) {
        Object c = emau.a(this.e, this.i, new azmh(this, iterable, iterable2, null)).c(ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    @Override // defpackage.azmp
    public final /* synthetic */ Object p() {
        return ffcu.a;
    }

    @Override // defpackage.azmp
    public final /* synthetic */ void o() {
    }
}
