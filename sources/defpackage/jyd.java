package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyd {
    public static final int a(int i) {
        return i & PrivateKeyType.INVALID;
    }

    public static final int b(int i) {
        return (i >> 8) & PrivateKeyType.INVALID;
    }

    public static final int c(int i) {
        return (i >> 16) & PrivateKeyType.INVALID;
    }
}
