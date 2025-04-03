package defpackage;

import java.lang.reflect.AccessibleObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class evna {
    public static final evna b;

    static {
        evna evnaVar = null;
        if (evmk.a()) {
            try {
                evnaVar = new evmy(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (evnaVar == null) {
            evnaVar = new evmz();
        }
        b = evnaVar;
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
