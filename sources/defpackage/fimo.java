package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fimo implements InvocationHandler {
    private final Object a;

    public fimo(Object obj) {
        this.a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, this.a.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            Objects.toString(method);
            throw new RuntimeException("Reflection failed for method ".concat(String.valueOf(method)), e2);
        }
    }
}
