package defpackage;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnz {
    public static final boolean a(String str, ffix ffixVar) {
        try {
            boolean booleanValue = ((Boolean) ffixVar.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final boolean b(ffix ffixVar) {
        try {
            ffixVar.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public static final boolean c(Method method, Class cls) {
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final boolean d(Constructor constructor) {
        return Modifier.isPublic(constructor.getModifiers());
    }

    public static final boolean e(Field field) {
        return Modifier.isPublic(field.getModifiers());
    }

    public static final boolean f(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public static final boolean g(Method method, ffmo ffmoVar) {
        return c(method, ffiu.a(ffmoVar));
    }
}
