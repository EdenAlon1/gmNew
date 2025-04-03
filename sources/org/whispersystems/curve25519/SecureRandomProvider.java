package org.whispersystems.curve25519;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface SecureRandomProvider {
    void nextBytes(byte[] bArr);

    int nextInt(int i);
}
