package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euqo {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(Object obj) {
        obj.getClass();
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null interface");
        }
    }
}
