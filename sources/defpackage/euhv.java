package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhv implements etgi {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final etre c;
    public static final etre d;
    public static final etre e;
    private final ECPublicKey f;
    private final String g;
    private final euid h;
    private final byte[] i;
    private final byte[] j;
    private final Provider k;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        etrd.b(euiu.SHA256, eubl.a, hashMap, hashMap2);
        etrd.b(euiu.SHA384, eubl.b, hashMap, hashMap2);
        etrd.b(euiu.SHA512, eubl.c, hashMap, hashMap2);
        c = etrd.a(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        etrd.b(euid.IEEE_P1363, eubm.a, hashMap3, hashMap4);
        etrd.b(euid.DER, eubm.b, hashMap3, hashMap4);
        d = etrd.a(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        etrd.b(euic.NIST_P256, eubk.a, hashMap5, hashMap6);
        etrd.b(euic.NIST_P384, eubk.b, hashMap5, hashMap6);
        etrd.b(euic.NIST_P521, eubk.c, hashMap5, hashMap6);
        e = etrd.a(hashMap5, hashMap6);
    }

    public euhv(ECPublicKey eCPublicKey, euiu euiuVar, euid euidVar, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        euif.j(eCPublicKey);
        this.g = eujp.b(euiuVar);
        this.f = eCPublicKey;
        this.h = euidVar;
        this.i = bArr;
        this.j = bArr2;
        this.k = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(byte[] r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euhv.b(byte[], byte[]):void");
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.i;
        if (bArr3.length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ettp.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.i;
            b(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
    }
}
