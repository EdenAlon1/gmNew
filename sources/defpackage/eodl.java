package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum eodl implements eodj {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;

    private static final Unsafe c;
    private static final int d;

    static {
        Unsafe b = b();
        c = b;
        d = b.arrayBaseOffset(byte[].class);
        if (b.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }

    private static Unsafe b() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: eodk
                @Override // java.security.PrivilegedExceptionAction
                public final Object run() {
                    eodl eodlVar = eodl.UNSAFE_LITTLE_ENDIAN;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
    }

    @Override // defpackage.eodj
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return c.getLong(bArr, i + d);
        }
        if (ordinal != 1) {
            throw null;
        }
        return Long.reverseBytes(c.getLong(bArr, i + d));
    }
}
