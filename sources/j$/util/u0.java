package j$.util;

import java.security.AccessController;

/* loaded from: classes9.dex */
abstract class u0 {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new j$.sun.security.action.a(1))).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
