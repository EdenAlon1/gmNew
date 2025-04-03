package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezd {
    private final Class a;
    private final String b;
    private final Class[] c;

    public fezd(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    private final Method d(Class cls) {
        Class cls2;
        Method e = e(cls, this.b, this.c);
        if (e == null || (cls2 = this.a) == null || cls2.isAssignableFrom(e.getReturnType())) {
            return e;
        }
        return null;
    }

    private static Method e(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return e(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public final Object a(Object obj, Object... objArr) {
        try {
            Method d = d(obj.getClass());
            if (d != null) {
                try {
                    return d.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(d.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            throw new AssertionError("Method " + this.b + " not supported for object " + String.valueOf(obj));
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean b(Object obj) {
        return d(obj.getClass()) != null;
    }

    public final void c(Object obj, Object... objArr) {
        try {
            Method d = d(obj.getClass());
            if (d == null) {
                return;
            }
            try {
                d.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
