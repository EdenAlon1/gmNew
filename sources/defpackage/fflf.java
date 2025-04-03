package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflf {
    public static void a(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(a.w(str, obj == null ? "null" : obj.getClass().getName(), " cannot be cast to "));
        ffkj.f(classCastException, fflf.class.getName());
        throw classCastException;
    }

    public static boolean b(Object obj, int i) {
        if (obj instanceof ffbv) {
            if ((obj instanceof ffkf ? ((ffkf) obj).dR() : obj instanceof ffix ? 0 : obj instanceof ffji ? 1 : obj instanceof ffjm ? 2 : obj instanceof ffjn ? 3 : obj instanceof ffjo ? 4 : obj instanceof ffjp ? 5 : obj instanceof ffjq ? 6 : obj instanceof ffjr ? 7 : obj instanceof ffjs ? 8 : obj instanceof ffjt ? 9 : obj instanceof ffiy ? 10 : obj instanceof ffiz ? 11 : obj instanceof ffja ? 12 : obj instanceof ffjb ? 13 : obj instanceof ffjc ? 14 : obj instanceof ffjd ? 15 : obj instanceof ffje ? 16 : obj instanceof ffjf ? 17 : obj instanceof ffjg ? 18 : obj instanceof ffjh ? 19 : obj instanceof ffjj ? 20 : obj instanceof ffjk ? 21 : obj instanceof ffjl ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof fflg) || (obj instanceof fflj);
        }
        return false;
    }

    public static boolean d(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof fflg) || (obj instanceof ffll);
        }
        return false;
    }

    public static void e(Object obj, int i) {
        if (obj == null || b(obj, i)) {
            return;
        }
        a(obj, a.h(i, "kotlin.jvm.functions.Function"));
    }

    public static void f(Object obj) {
        if (!(obj instanceof fflg) || (obj instanceof fflh)) {
            return;
        }
        a(obj, "kotlin.collections.MutableCollection");
    }

    public static void g(Object obj) {
        if (!(obj instanceof fflg) || (obj instanceof fflk)) {
            return;
        }
        a(obj, "kotlin.collections.MutableMap");
    }
}
