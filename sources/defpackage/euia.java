package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euia implements etgh {
    private final byte[] a;

    public euia(byte[] bArr) {
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] i = etqy.i(bArr);
        this.a = i;
        etqy.j(i);
    }
}
