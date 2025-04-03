package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.dfwv;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final Object a;

    private ObjectWrapper(Object obj) {
        this.a = obj;
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        dfwv.n(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static <T> IObjectWrapper wrap(T t) {
        return new ObjectWrapper(t);
    }
}
