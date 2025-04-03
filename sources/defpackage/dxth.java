package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxth {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();

    public static boolean a(long j) {
        if (j > 0) {
            return b.nextLong() % j == 0;
        }
        if (j < 0) {
            g("Bad sample interval: %d", Long.valueOf(j));
        }
        return false;
    }

    public static void b(String str, Object obj) {
        ((enrr) ((enrr) dxtg.a.e()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 62, "LogUtil.java")).t(str, obj);
        ((enrr) dxtg.a.e()).R();
    }

    public static void c(String str, Object obj, Object obj2) {
        ((enrr) ((enrr) dxtg.a.e()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 69, "LogUtil.java")).D(str, obj, obj2);
        ((enrr) dxtg.a.e()).R();
    }

    public static void d(String str, Object... objArr) {
        ((enrr) ((enrr) dxtg.a.e()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 76, "LogUtil.java")).Q(str, objArr);
        ((enrr) dxtg.a.e()).R();
    }

    public static void e(Throwable th, String str, Object... objArr) {
        ((enrr) ((enrr) ((enrr) dxtg.a.e()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "d", 83, "LogUtil.java")).Q(str, objArr);
        ((enrr) dxtg.a.e()).R();
    }

    public static void f(String str) {
        ((enrr) ((enrr) dxtg.a.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 116, "LogUtil.java")).t("%s", str);
        ((enrr) dxtg.a.i()).R();
    }

    public static void g(String str, Object obj) {
        ((enrr) ((enrr) dxtg.a.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 123, "LogUtil.java")).t(str, obj);
        ((enrr) dxtg.a.i()).R();
    }

    public static void h(String str, Object obj, Object obj2) {
        ((enrr) ((enrr) dxtg.a.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 130, "LogUtil.java")).D(str, obj, obj2);
        ((enrr) dxtg.a.i()).R();
    }

    public static void i(String str, Object... objArr) {
        ((enrr) ((enrr) dxtg.a.i()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 137, "LogUtil.java")).Q(str, objArr);
        ((enrr) dxtg.a.i()).R();
    }

    public static void j(Throwable th, String str) {
        ((enrr) ((enrr) ((enrr) dxtg.a.i()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 144, "LogUtil.java")).t("%s", str);
        ((enrr) dxtg.a.i()).R();
    }

    public static void k(Throwable th, String str, Object... objArr) {
        ((enrr) ((enrr) ((enrr) dxtg.a.i()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "e", 151, "LogUtil.java")).Q(str, objArr);
        ((enrr) dxtg.a.i()).R();
    }

    public static void l(String str, Object obj, Object obj2) {
        ((enrr) ((enrr) dxtg.a.f()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "v", 42, "LogUtil.java")).D(str, obj, obj2);
        ((enrr) dxtg.a.f()).R();
    }

    public static void m(String str, Object... objArr) {
        ((enrr) ((enrr) dxtg.a.f()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "v", 49, "LogUtil.java")).Q(str, objArr);
        ((enrr) dxtg.a.f()).R();
    }

    public static void n(String str, Object obj) {
        ((enrr) ((enrr) dxtg.a.j()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 164, "LogUtil.java")).t(str, obj);
        ((enrr) dxtg.a.j()).R();
    }

    public static void o(String str, Object obj, Object obj2) {
        ((enrr) ((enrr) dxtg.a.j()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 171, "LogUtil.java")).D(str, obj, obj2);
        ((enrr) dxtg.a.j()).R();
    }

    public static void p(String str, Object... objArr) {
        ((enrr) ((enrr) dxtg.a.j()).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 178, "LogUtil.java")).Q(str, objArr);
        ((enrr) dxtg.a.j()).R();
    }

    public static void q(Throwable th, String str, Object... objArr) {
        ((enrr) ((enrr) ((enrr) dxtg.a.j()).g(th)).h("com/google/android/libraries/mdi/download/internal/logging/LogUtil", "w", 186, "LogUtil.java")).Q(str, objArr);
        ((enrr) dxtg.a.j()).R();
    }
}
