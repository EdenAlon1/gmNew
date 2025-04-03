package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class ljt {
    static final ljt a = new ljt();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, ljs ljsVar, lki lkiVar, Class cls) {
        lki lkiVar2 = (lki) map.get(ljsVar);
        if (lkiVar2 == null || lkiVar == lkiVar2) {
            if (lkiVar2 == null) {
                map.put(ljsVar, lkiVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + ljsVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lkiVar2 + ", new value " + lkiVar);
    }

    public final ljr a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(hashMap, (ljs) entry.getKey(), (lki) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!lkr.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                lki a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (!lki.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (a2 != lki.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(hashMap, new ljs(i, method), a2, cls);
                z = true;
            }
        }
        ljr ljrVar = new ljr(hashMap);
        this.c.put(cls, ljrVar);
        this.b.put(cls, Boolean.valueOf(z));
        return ljrVar;
    }

    final ljr b(Class cls) {
        ljr ljrVar = (ljr) this.c.get(cls);
        return ljrVar != null ? ljrVar : a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
