package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fe_isnonzero {
    static final byte[] zero = new byte[32];

    public static int fe_isnonzero(int[] iArr) {
        byte[] bArr = new byte[32];
        fe_tobytes.fe_tobytes(bArr, iArr);
        return crypto_verify_32.crypto_verify_32(bArr, zero);
    }
}
