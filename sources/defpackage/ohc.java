package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohc {
    public final Object a;
    public final ojd b;
    public final odp c;
    public final odp d;
    public final ffxx e = oky.a(new ogy(this, null));
    private final ffji f;

    public ohc(ffji ffjiVar, Object obj, ojd ojdVar) {
        this.f = ffjiVar;
        this.a = obj;
        this.b = ojdVar;
        byte[] bArr = null;
        this.c = new odp(bArr);
        this.d = new odp(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.okl r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ogz
            if (r0 == 0) goto L13
            r0 = r6
            ogz r0 = (defpackage.ogz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ogz r0 = new ogz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            ohc r0 = r0.e
            defpackage.ffci.b(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            ffji r6 = r4.f
            r0.e = r4
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 == r1) goto L93
            r0 = r4
        L45:
            okl r6 = (defpackage.okl) r6
            boolean r1 = r6 instanceof defpackage.odl
            if (r1 == 0) goto L55
            r1 = r6
            odl r1 = (defpackage.odl) r1
            ojd r2 = r0.b
            int r2 = r2.a
            r1.a(r2)
        L55:
            if (r6 == r5) goto L8b
            oha r1 = new oha
            r1.<init>(r0)
            r6.f(r1)
            if (r5 == 0) goto L6c
            ohb r1 = new ohb
            r1.<init>(r0)
            r0 = r5
            okl r0 = (defpackage.okl) r0
            r0.g(r1)
        L6c:
            if (r5 == 0) goto L73
            okl r5 = (defpackage.okl) r5
            r5.e()
        L73:
            r5 = 3
            boolean r0 = defpackage.oka.a(r5)
            if (r0 == 0) goto L8a
            java.util.Objects.toString(r6)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Generated new PagingSource "
            java.lang.String r0 = r1.concat(r0)
            defpackage.oka.b(r5, r0)
        L8a:
            return r6
        L8b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohc.a(okl, ffgu):java.lang.Object");
    }

    public final void b() {
        this.c.a(false);
    }

    public final void c() {
        this.c.a(true);
    }
}
