package j$.util.concurrent;

import java.security.PrivilegedAction;

/* loaded from: classes9.dex */
final class z implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
