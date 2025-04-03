package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamr implements ealb {
    private static final entd b = entd.c("GnpSdk");
    public final long a;
    private final ffbr c;
    private final eagn d;
    private final ealf e;
    private final String f;
    private final eanl g;

    public eamr(ffbr ffbrVar, eagn eagnVar, eanl eanlVar, ealf ealfVar) {
        ffbrVar.getClass();
        ealfVar.getClass();
        this.c = ffbrVar;
        this.d = eagnVar;
        this.g = eanlVar;
        this.e = ealfVar;
        this.f = "GNP_PERIODIC_REGISTRATION";
        this.a = ((eagl) eagnVar).g * 86400 * 1000;
    }

    @Override // defpackage.ealb
    public final int a() {
        return 17;
    }

    @Override // defpackage.ealb
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ealb
    public final Long c() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r5 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ealb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.os.Bundle r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof defpackage.eamq
            if (r5 == 0) goto L13
            r5 = r6
            eamq r5 = (defpackage.eamq) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            eamq r5 = new eamq
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L38
            if (r1 == r2) goto L34
            if (r1 != r3) goto L2c
            eald r5 = r5.d
            defpackage.ffci.b(r6)
            goto L6e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.ffci.b(r6)
            goto L82
        L38:
            defpackage.ffci.b(r6)
            entd r6 = defpackage.eamr.b
            ensk r6 = r6.o()
            java.lang.String r1 = "Executing GnpPeriodicRegistrationJob"
            r6.q(r1)
            eanl r6 = r4.g
            int r6 = r6.f()
            if (r6 != r3) goto L75
            eagn r6 = r4.d
            eagl r6 = (defpackage.eagl) r6
            int r6 = r6.g
            if (r6 != 0) goto L57
            goto L75
        L57:
            ffbr r6 = r4.c
            eald r1 = defpackage.eald.a
            java.lang.Object r6 = r6.b()
            eatr r6 = (defpackage.eatr) r6
            exyd r2 = defpackage.exyd.PERIODIC_REGISTRATION
            r5.d = r1
            r5.c = r3
            java.lang.Object r6 = defpackage.eatq.a(r6, r2, r5)
            if (r6 == r0) goto L81
            r5 = r1
        L6e:
            eafl r6 = (defpackage.eafl) r6
            ealc r5 = r5.a(r6)
            return r5
        L75:
            ealf r6 = r4.e
            r5.c = r2
            r1 = 17
            java.lang.Object r5 = defpackage.eale.a(r6, r1, r5)
            if (r5 != r0) goto L82
        L81:
            return r0
        L82:
            ealc r5 = defpackage.ealc.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eamr.d(android.os.Bundle, ffgu):java.lang.Object");
    }

    @Override // defpackage.ealb
    public final String e() {
        return this.f;
    }

    @Override // defpackage.ealb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ealb
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ealb
    public final int h() {
        return 2;
    }

    @Override // defpackage.ealb
    public final int i() {
        return 1;
    }
}
