package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssu {
    private final ffbr a;
    private final ffsk b;
    private final emar c;
    private final ffbz d;

    public cssu(final ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = ffbrVar2;
        this.b = ffskVar;
        this.c = new emar();
        this.d = ffca.a(new ffix() { // from class: cssg
            @Override // defpackage.ffix
            public final Object invoke() {
                comy comyVar = (comy) ffbr.this.b();
                comu c = comv.c();
                c.d(comb.DEBUG_SETTINGS);
                c.f(cfly.a);
                c.c(new Supplier() { // from class: cssa
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new eygu("Invalid proto data");
                    }
                });
                return comyVar.a(c.a());
            }
        });
    }

    private final comc k() {
        return (comc) this.d.a();
    }

    private final void l(cfly cflyVar) {
        emau.a(this.b, this.c, new cssk(this, cflyVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cssj
            if (r0 == 0) goto L13
            r0 = r5
            cssj r0 = (defpackage.cssj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cssj r0 = new cssj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            comc r5 = r4.k()
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cssl
            if (r0 == 0) goto L13
            r0 = r6
            cssl r0 = (defpackage.cssl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cssl r0 = new cssl
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            cssc r2 = new cssc
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.b(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(final int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cssm
            if (r0 == 0) goto L13
            r0 = r6
            cssm r0 = (defpackage.cssm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cssm r0 = new cssm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            cssh r2 = new cssh
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.c(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cssn
            if (r0 == 0) goto L13
            r0 = r6
            cssn r0 = (defpackage.cssn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cssn r0 = new cssn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            cssd r2 = new cssd
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.d(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.csso
            if (r0 == 0) goto L13
            r0 = r6
            csso r0 = (defpackage.csso) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csso r0 = new csso
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            csrz r2 = new csrz
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.e(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(final boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cssp
            if (r0 == 0) goto L13
            r0 = r6
            cssp r0 = (defpackage.cssp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cssp r0 = new cssp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            csse r2 = new csse
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.f(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(final boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cssq
            if (r0 == 0) goto L13
            r0 = r6
            cssq r0 = (defpackage.cssq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cssq r0 = new cssq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            csry r2 = new csry
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.g(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(final boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cssr
            if (r0 == 0) goto L13
            r0 = r6
            cssr r0 = (defpackage.cssr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cssr r0 = new cssr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            cssb r2 = new cssb
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.h(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(final boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.csss
            if (r0 == 0) goto L13
            r0 = r6
            csss r0 = (defpackage.csss) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csss r0 = new csss
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            cssf r2 = new cssf
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.i(boolean, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(final boolean r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.csst
            if (r0 == 0) goto L13
            r0 = r6
            csst r0 = (defpackage.csst) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csst r0 = new csst
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cssu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            comc r6 = r4.k()
            cssi r2 = new cssi
            r2.<init>()
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.d(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            cfly r6 = (defpackage.cfly) r6
            r6.getClass()
            r5.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssu.j(boolean, ffgu):java.lang.Object");
    }
}
