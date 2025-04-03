package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etpb implements etpq {
    private final int a;

    public etpb(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(a.h(i, "Unsupported key length: "));
        }
        this.a = i;
    }

    @Override // defpackage.etpq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.etpq
    public final byte[] b() {
        int i = this.a;
        if (i == 16) {
            return etqb.i;
        }
        if (i == 32) {
            return etqb.j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // defpackage.etpq
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        int length = bArr.length;
        if (length != this.a) {
            throw new InvalidAlgorithmParameterException(a.h(length, "Unexpected key length: "));
        }
        if (etmj.a(2)) {
            return etll.a(bArr2, bArr3, i, etks.d(bArr));
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.etpq
    public final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        int length = bArr.length;
        if (length != this.a) {
            throw new InvalidAlgorithmParameterException(a.h(length, "Unexpected key length: "));
        }
        if (etmj.a(2)) {
            return etll.b(bArr2, bArr3, i, etks.d(bArr));
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
