package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class endr {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.b(obj, "null value in entry: ", "=null"));
        }
    }

    static void b(boolean z) {
        emxf.m(z, "no calls to next() since the last call to remove()");
    }

    public static void c(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(a.g(i, str, " cannot be negative but was: "));
        }
    }
}
