package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbav implements cbbn {
    final /* synthetic */ cbaw a;
    private final cbbn b;

    public cbav(cbaw cbawVar, cbbn cbbnVar) {
        this.a = cbawVar;
        this.b = cbbnVar;
        cbawVar.p();
    }

    @Override // defpackage.cbbn
    public final int a() {
        return 0;
    }

    @Override // defpackage.cbbn
    public final int b() {
        return 1;
    }

    @Override // defpackage.cbbn
    public final cbbl c() {
        return this.b.c();
    }

    @Override // defpackage.cbbn
    public final cbbo d() {
        return this.b.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r10 != r3.d()) goto L19;
     */
    @Override // defpackage.cbbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.cbcc e(java.util.List r10) {
        /*
            r9 = this;
            defpackage.csix.h()
            cbaw r10 = r9.a
            r10.o()
            r10 = 0
            cbaw r0 = r9.a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            android.graphics.Bitmap r0 = r0.d()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r0.getClass()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            boolean r1 = r0.hasAlpha()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            defpackage.csix.f(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            int r1 = r0.getWidth()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            int r2 = r0.getHeight()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r1 <= 0) goto L51
            if (r2 <= 0) goto L51
            cbbn r3 = r9.b     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            cbbh r3 = (defpackage.cbbh) r3     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            cbbi r3 = r3.b     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            int r4 = r3.b     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            float r5 = (float) r1     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            float r4 = r4 / r5
            int r3 = r3.c     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            float r6 = (float) r2     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            float r3 = r3 / r6
            float r3 = java.lang.Math.max(r4, r3)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            float r5 = r5 * r3
            float r6 = r6 * r3
            r4 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L51
            int r3 = (int) r5     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r3 <= 0) goto L51
            int r4 = (int) r6     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r4 <= 0) goto L51
            if (r3 == r1) goto L51
            if (r4 == r2) goto L51
            r1 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r10 = r0
        L51:
            cbaw r1 = r9.a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            ctap r1 = r1.c     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r2 = 50
            byte[] r5 = r1.o(r0, r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            cbbd r3 = new cbbd     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            java.lang.String r4 = r9.f()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r5.getClass()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            cbaw r0 = r9.a     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            int r6 = r0.d     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            cqoh r7 = r0.i     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            ctap r8 = r0.c     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L7f
            if (r10 == 0) goto L92
            cbaw r0 = r9.a
            android.graphics.Bitmap r0 = r0.d()
            if (r10 == r0) goto L92
        L79:
            r10.recycle()
            goto L92
        L7d:
            r0 = move-exception
            goto L9d
        L7f:
            r0 = move-exception
            cskc r1 = defpackage.cbaw.a     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "Error compressing bitmap."
            r1.o(r2, r0)     // Catch: java.lang.Throwable -> L7d
            cbaw r3 = r9.a     // Catch: java.lang.Throwable -> L7d
            if (r10 == 0) goto L92
            android.graphics.Bitmap r0 = r3.d()
            if (r10 == r0) goto L92
            goto L79
        L92:
            cbaw r10 = r9.a
            r10.r()
            cbaw r10 = r9.a
            r10.q()
            return r3
        L9d:
            if (r10 == 0) goto Laa
            cbaw r1 = r9.a
            android.graphics.Bitmap r1 = r1.d()
            if (r10 == r1) goto Laa
            r10.recycle()
        Laa:
            cbaw r10 = r9.a
            r10.r()
            cbaw r10 = r9.a
            r10.q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbav.e(java.util.List):cbcc");
    }

    @Override // defpackage.cbbn
    public final String f() {
        return this.a.e;
    }
}
