package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ecmx {
    static ecmx d(Activity activity) {
        return new ecmh(null, new ecda(activity.getClass().getName()), true);
    }

    public abstract ecda a();

    public abstract String b();

    public abstract boolean c();

    final String e() {
        ecda a = a();
        if (a != null) {
            return a.a;
        }
        String b = b();
        emyw.e(b);
        return b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ecmx)) {
            return false;
        }
        ecmx ecmxVar = (ecmx) obj;
        return e().equals(ecmxVar.e()) && c() == ecmxVar.c();
    }

    public final int hashCode() {
        return (e().hashCode() * 31) ^ (true != c() ? 1237 : 1231);
    }
}
