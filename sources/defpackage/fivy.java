package defpackage;

import org.whispersystems.curve25519.Curve25519;
import org.whispersystems.curve25519.Curve25519KeyPair;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivy {
    public static fiwb a() {
        Curve25519KeyPair generateKeyPair = Curve25519.getInstance(Curve25519.BEST).generateKeyPair();
        return new fiwb(new fiwa(generateKeyPair.getPublicKey()), new fivz(generateKeyPair.getPrivateKey()));
    }

    public static fiwa b(byte[] bArr) {
        int i = bArr[0] & 255;
        if (i != 5) {
            throw new fivx(a.h(i, "Bad key type: "));
        }
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 1, bArr2, 0, 32);
        return new fiwa(bArr2);
    }
}
