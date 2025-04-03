package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjeo implements fjbu {
    private final evlf a;

    public fjeo(evlf evlfVar) {
        this.a = evlfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r4 != null) goto L18;
     */
    @Override // defpackage.fjbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r11) {
        /*
            r10 = this;
            fhhe r11 = (defpackage.fhhe) r11
            java.io.Reader r0 = r11.d
            if (r0 != 0) goto L4a
            fhhc r0 = new fhhc
            fhmv r1 = r11.c()
            fhgn r2 = r11.b()
            if (r2 == 0) goto L43
            java.lang.String[] r3 = r2.e
            java.nio.charset.Charset r4 = defpackage.ffoo.a
            int r3 = r3.length
            int r3 = r3 + (-1)
            r5 = 0
            r6 = 2
            int r3 = defpackage.ffib.a(r5, r3, r6)
            r6 = 0
            if (r3 < 0) goto L3a
        L22:
            java.lang.String[] r7 = r2.e
            r7 = r7[r5]
            java.lang.String r8 = "charset"
            r9 = 1
            boolean r7 = defpackage.ffpc.j(r7, r8, r9)
            if (r7 == 0) goto L35
            java.lang.String[] r2 = r2.e
            int r5 = r5 + r9
            r6 = r2[r5]
            goto L3a
        L35:
            if (r5 == r3) goto L3a
            int r5 = r5 + 2
            goto L22
        L3a:
            if (r6 != 0) goto L3d
            goto L41
        L3d:
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.IllegalArgumentException -> L41
        L41:
            if (r4 != 0) goto L45
        L43:
            java.nio.charset.Charset r4 = defpackage.ffoo.a
        L45:
            r0.<init>(r1, r4)
            r11.d = r0
        L4a:
            evpl r0 = defpackage.evkn.n(r0)
            evlf r1 = r10.a     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r1.a(r0)     // Catch: java.lang.Throwable -> L68
            int r0 = r0.t()     // Catch: java.lang.Throwable -> L68
            r2 = 10
            if (r0 != r2) goto L60
            r11.close()
            return r1
        L60:
            evku r0 = new evku     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = "JSON document was not fully consumed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            r11.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjeo.a(java.lang.Object):java.lang.Object");
    }
}
