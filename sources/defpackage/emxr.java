package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxr {
    public static final SecureRandom a;
    public static final ThreadLocal b;

    static {
        new emxp();
        a = a();
        new emxq();
        b = new emxo();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
