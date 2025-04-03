package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhr implements etfp {
    public final byte[] b;
    public final byte[] c;
    private final euja f;
    private static final Collection d = Arrays.asList(64);
    private static final byte[] e = new byte[16];
    public static final ThreadLocal a = new euhq();

    private euhr(byte[] bArr, eujt eujtVar) {
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        int length = bArr.length;
        if (!d.contains(Integer.valueOf(length))) {
            throw new InvalidKeyException(a.f(length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        int i = length >> 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.b = Arrays.copyOfRange(bArr, i, length);
        this.f = new euja(copyOfRange);
        this.c = eujtVar.c();
    }

    public static etfp a(etmm etmmVar) {
        return new euhr(etmmVar.b.d(), etmmVar.c);
    }

    public final byte[] b(byte[]... bArr) {
        byte[] c;
        byte[] a2 = this.f.a(e, 16);
        for (char c2 = 0; c2 <= 0; c2 = 1) {
            byte[] bArr2 = bArr[0];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a2 = euhs.c(etvf.b(a2), this.f.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[1];
        int length = bArr3.length;
        if (length >= 16) {
            int length2 = a2.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            c = Arrays.copyOf(bArr3, length);
            for (int i = 0; i < a2.length; i++) {
                int i2 = (length - length2) + i;
                c[i2] = (byte) (c[i2] ^ a2[i]);
            }
        } else {
            c = euhs.c(etvf.a(bArr3), etvf.b(a2));
        }
        return this.f.a(c, 16);
    }
}
