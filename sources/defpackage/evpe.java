package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evpe extends evpc {
    private final Method a = Class.class.getMethod("isRecord", new Class[0]);
    private final Method b = Class.class.getMethod("getRecordComponents", new Class[0]);
    private final Method c;
    private final Method d;

    public evpe() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.c = cls.getMethod("getName", new Class[0]);
        this.d = cls.getMethod("getType", new Class[0]);
    }

    @Override // defpackage.evpc
    public final Constructor a(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.d.invoke(objArr[i], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw evpf.a(e);
        }
    }

    @Override // defpackage.evpc
    public final Method b(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e) {
            throw evpf.a(e);
        }
    }

    @Override // defpackage.evpc
    public final boolean c(Class cls) {
        try {
            return ((Boolean) this.a.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw evpf.a(e);
        }
    }

    @Override // defpackage.evpc
    public final String[] d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.c.invoke(objArr[i], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw evpf.a(e);
        }
    }
}
