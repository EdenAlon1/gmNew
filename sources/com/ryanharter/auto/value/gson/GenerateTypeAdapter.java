package com.ryanharter.auto.value.gson;

import defpackage.evkn;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evpj;
import j$.util.DesugarCollections;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface GenerateTypeAdapter {
    static {
        new evlg() { // from class: com.ryanharter.auto.value.gson.GenerateTypeAdapter.1
            private final Class a = Array.newInstance((Class<?>) Type.class, 0).getClass();
            private final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

            private final Constructor b(Class cls) {
                Constructor<?> b;
                Constructor constructor = (Constructor) this.b.get(cls);
                if (constructor != null) {
                    return constructor;
                }
                String name = cls.getName();
                if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("kotlin.")) {
                    return null;
                }
                try {
                    try {
                        String replace = cls.getName().replace("$", "_");
                        Class<?> loadClass = cls.getClassLoader().loadClass(replace + "_GsonTypeAdapter");
                        try {
                            b = loadClass.getDeclaredConstructor(evkn.class);
                            b.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                            b = loadClass.getDeclaredConstructor(evkn.class, this.a);
                            b.setAccessible(true);
                        }
                    } catch (NoSuchMethodException e) {
                        throw new RuntimeException("Unable to find binding constructor for ".concat(String.valueOf(name)), e);
                    }
                } catch (ClassNotFoundException unused2) {
                    b = b(cls.getSuperclass());
                    if (b != null) {
                        b.setAccessible(true);
                    }
                }
                this.b.put(cls, b);
                return b;
            }

            @Override // defpackage.evlg
            public final evlf a(evkn evknVar, evpj evpjVar) {
                Class cls = evpjVar.a;
                if (!cls.isAnnotationPresent(GenerateTypeAdapter.class)) {
                    return null;
                }
                Class superclass = cls.getSuperclass();
                if (superclass.isAnnotationPresent(GenerateTypeAdapter.class)) {
                    return evknVar.b(superclass);
                }
                Constructor b = b(cls);
                if (b == null) {
                    return null;
                }
                try {
                    return b.getParameterTypes().length == 1 ? (evlf) b.newInstance(evknVar) : (evlf) b.newInstance(evknVar, ((ParameterizedType) evpjVar.b).getActualTypeArguments());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Unable to invoke ".concat(b.toString()), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Unable to invoke ".concat(b.toString()), e2);
                } catch (InvocationTargetException e3) {
                    Throwable cause = e3.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException("Could not create generated TypeAdapter instance for type ".concat(String.valueOf(String.valueOf(cls))), cause);
                }
            }
        };
    }
}
