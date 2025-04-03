package defpackage;

import java.security.interfaces.ECPrivateKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhw implements etfq {
    private final ECPrivateKey a;
    private final euhy b;
    private final String c;
    private final byte[] d;
    private final euie e;
    private final etpg f;
    private final byte[] g;

    private euhw(ECPrivateKey eCPrivateKey, byte[] bArr, String str, euie euieVar, etpg etpgVar, byte[] bArr2) {
        this.a = eCPrivateKey;
        this.b = new euhy(eCPrivateKey);
        this.d = bArr;
        this.c = str;
        this.e = euieVar;
        this.f = etpgVar;
        this.g = bArr2;
    }

    public static etfq b(etnu etnuVar) {
        ECPrivateKey d = euif.d((euic) euhx.a.a(etnuVar.c().b), etqq.a(etnuVar.b.a));
        byte[] bArr = new byte[0];
        if (etnuVar.c().g != null) {
            bArr = etnuVar.c().g.c();
        }
        return new euhw(d, bArr, euhx.c(etnuVar.c().c), (euie) euhx.b.a(etnuVar.c().d), etph.a(etnuVar.c()), etnuVar.f().c());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    @Override // defpackage.etfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(byte[] r10, byte[] r11) {
        /*
            r9 = this;
            byte[] r0 = r9.g
            boolean r0 = defpackage.ettp.e(r0, r10)
            if (r0 == 0) goto L6d
            byte[] r0 = r9.g
            java.security.interfaces.ECPrivateKey r1 = r9.a
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            euie r2 = r9.e
            int r1 = defpackage.euif.a(r1)
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L31
            r3 = 2
            if (r2 != r3) goto L28
            int r1 = r1 + r1
            goto L32
        L28:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "unknown EC point format"
            r10.<init>(r11)
            throw r10
        L30:
            int r1 = r1 + r1
        L31:
            int r1 = r1 + r3
        L32:
            int r0 = r0.length
            int r2 = r10.length
            int r1 = r1 + r0
            if (r2 < r1) goto L65
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r0, r1)
            euhy r0 = r9.b
            java.lang.String r5 = r9.c
            byte[] r6 = r9.d
            etpg r2 = r9.f
            euie r4 = r9.e
            int r8 = r2.a()
            java.security.interfaces.ECPrivateKey r2 = r0.a
            java.security.spec.ECParameterSpec r2 = r2.getParams()
            java.security.interfaces.ECPublicKey r2 = defpackage.euif.g(r2, r4, r3)
            java.security.interfaces.ECPrivateKey r0 = r0.a
            byte[] r4 = defpackage.euif.k(r0, r2)
            r7 = r11
            byte[] r11 = defpackage.euiw.a(r3, r4, r5, r6, r7, r8)
            etpg r0 = r9.f
            byte[] r10 = r0.b(r11, r10, r1)
            return r10
        L65:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        L6d:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Invalid ciphertext (output prefix mismatch)"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euhw.a(byte[], byte[]):byte[]");
    }
}
