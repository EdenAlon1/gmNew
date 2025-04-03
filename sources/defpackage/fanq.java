package defpackage;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanq {
    public static final byte[] a = {-126, -86, 85, -96, -45, -105, -8, -125, 70, -54, 28, -18, -115, 57, 9, -71, 95, 19, -6, 125, -21, 29, 74, -77, -125, 118, -72, 37, 109, -88, 85, 16};

    static SecretKey a(SecretKey secretKey, String str) {
        return new SecretKeySpec(faop.a(secretKey, a, str.getBytes()), "AES");
    }
}
