package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbau {
    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void b(Object obj) {
        obj.getClass();
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
