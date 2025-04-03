package defpackage;

import android.os.BaseBundle;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bdhi {
    public final String b;

    protected bdhi(String str) {
        this.b = str;
    }

    private static String a(bdhi bdhiVar, String str) {
        String str2;
        return (bdhiVar == null || (str2 = bdhiVar.b) == null) ? str : str2;
    }

    public static String c(bdhi bdhiVar) {
        return a(bdhiVar, "null");
    }

    public static String d(bdhi bdhiVar) {
        if (bdhiVar == null) {
            return null;
        }
        return bdhiVar.b;
    }

    public static String e(bdhi bdhiVar) {
        return a(bdhiVar, "");
    }

    public static void h(BaseBundle baseBundle, String str, bdhi bdhiVar) {
        baseBundle.putString(str, bdhiVar.b);
    }

    public static boolean j(bdhi bdhiVar) {
        return !l(bdhiVar);
    }

    public static boolean l(bdhi bdhiVar) {
        return bdhiVar != null && bdhiVar.k();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bdhi bdhiVar = (bdhi) obj;
        String str = this.b;
        boolean z = str == null;
        String str2 = bdhiVar.b;
        if (z != (str2 == null)) {
            return false;
        }
        if (str == null) {
            return true;
        }
        return str.equals(str2);
    }

    public final String f() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public final void g(Consumer consumer) {
        if (k()) {
            consumer.accept(this);
        }
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public final boolean i() {
        return !k();
    }

    public final boolean k() {
        return this.b != null;
    }

    public final Object m(Function function) {
        Object apply;
        if (!k()) {
            return bdhb.a;
        }
        apply = function.apply(this);
        return apply;
    }
}
