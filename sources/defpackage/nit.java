package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nit {
    public final boolean a;
    public final String b;
    public final ndt c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals("cenc") != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nit(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            defpackage.lti.a(r2)
            r4.a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            ndt r5 = new ndt
            if (r6 != 0) goto L20
            goto L69
        L20:
            int r7 = r6.hashCode()
            r11 = 3
            r2 = 2
            switch(r7) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r1
            goto L52
        L34:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r11
            goto L52
        L47:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L69
            if (r0 == r1) goto L69
            if (r0 == r2) goto L68
            if (r0 == r11) goto L68
            java.lang.String r7 = "Unsupported protection scheme type '"
            java.lang.String r11 = "'. Assuming AES-CTR crypto mode."
            java.lang.String r6 = defpackage.a.a(r6, r7, r11)
            java.lang.String r7 = "TrackEncryptionBox"
            defpackage.luj.f(r7, r6)
            goto L69
        L68:
            r1 = r2
        L69:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nit.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
