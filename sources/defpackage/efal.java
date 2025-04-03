package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efal {
    private static Method a;

    public static void a(fr frVar) {
        if (a == null) {
            try {
                Method declaredMethod = fr.class.getDeclaredMethod("noteStateNotSaved", new Class[0]);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                b(e);
            }
        }
        try {
            Method method = a;
            method.getClass();
            method.invoke(frVar, new Object[0]);
        } catch (IllegalAccessException e2) {
            b(e2);
        } catch (InvocationTargetException e3) {
            b(e3);
        }
    }

    private static void b(Throwable th) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", th);
    }
}
