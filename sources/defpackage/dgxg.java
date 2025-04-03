package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgxg {
    public static String a(String str) {
        Object b;
        try {
            b = dgya.b("get", new dgxz(String.class, str), new dgxz(String.class, ""));
        } catch (ReflectiveOperationException unused) {
        }
        return b == null ? "" : (String) b;
    }

    public static int b() {
        try {
            Object b = dgya.b("getInt", new dgxz(String.class, "ro.boot.flash.locked"), new dgxy(Integer.TYPE, -1));
            if (b == null) {
                return -1;
            }
            return ((Integer) b).intValue();
        } catch (ReflectiveOperationException unused) {
            return -1;
        }
    }
}
