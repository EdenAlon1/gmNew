package defpackage;

import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enph {
    private final Field a;

    public enph(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    final void a(Object obj, int i) {
        try {
            this.a.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    final void b(Object obj, Object obj2) {
        try {
            this.a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
