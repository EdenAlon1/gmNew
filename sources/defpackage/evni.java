package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evni {
    public static final evni c;

    static {
        evni evnhVar;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            evnhVar = new evne(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    evnhVar = new evnf(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    evnhVar = new evnh();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                evnhVar = new evng(declaredMethod3);
            }
        }
        c = evnhVar;
    }

    public static void b(Class cls) {
        String c2 = evmi.c(cls);
        if (c2 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(c2));
        }
    }

    public abstract Object a(Class cls);
}
