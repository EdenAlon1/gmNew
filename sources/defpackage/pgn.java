package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgn implements InvocationHandler {
    private final ffmo a;
    private final ffji b;

    public pgn(ffmo ffmoVar, ffji ffjiVar) {
        this.a = ffmoVar;
        this.b = ffjiVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (ffkj.e(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            ffmo ffmoVar = this.a;
            Object obj2 = objArr[0];
            if (!ffmoVar.d(obj2)) {
                throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(ffmoVar.b())));
            }
            obj2.getClass();
            this.b.invoke(obj2);
            return ffcu.a;
        }
        if (ffkj.e(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (ffkj.e(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.b.hashCode());
        }
        if (ffkj.e(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
