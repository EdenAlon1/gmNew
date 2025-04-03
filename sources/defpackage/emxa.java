package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxa {
    public static emwz a(Class cls) {
        return new emwz(cls.getSimpleName());
    }

    public static emwz b(Object obj) {
        return new emwz(obj.getClass().getSimpleName());
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
