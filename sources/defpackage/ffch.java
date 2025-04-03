package defpackage;

import java.io.Serializable;

/* compiled from: PG */
@ffiv
/* loaded from: classes6.dex */
public final class ffch implements Serializable {
    public final Object a;

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String b(Object obj) {
        return obj instanceof ffcg ? ((ffcg) obj).toString() : a.i(obj, "Success(", ")");
    }

    public static final Throwable c(Object obj) {
        if (obj instanceof ffcg) {
            return ((ffcg) obj).a;
        }
        return null;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof ffcg);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffch) && ffkj.e(this.a, ((ffch) obj).a);
    }

    public final int hashCode() {
        return a(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
