package defpackage;

import android.text.TextUtils;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkf {
    public static void a(boolean z) {
        b(z, "");
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void d(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(Object obj) {
        e(obj, "Argument must not be null");
    }
}
