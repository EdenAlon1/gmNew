package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class Curve25519KeyPair {
    private final byte[] privateKey;
    private final byte[] publicKey;

    public Curve25519KeyPair(byte[] bArr, byte[] bArr2) {
        this.publicKey = bArr;
        this.privateKey = bArr2;
    }

    public byte[] getPrivateKey() {
        return this.privateKey;
    }

    public byte[] getPublicKey() {
        return this.publicKey;
    }
}
