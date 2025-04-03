package j$.util.stream;

import java.security.AccessController;

/* loaded from: classes9.dex */
abstract class a4 {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new Z3())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
