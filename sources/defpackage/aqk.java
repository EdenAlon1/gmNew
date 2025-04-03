package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqk {
    private final aqi a;

    private aqk(aqi aqiVar) {
        this.a = aqiVar;
    }

    public static aqk a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new aqk(new aqj(obj)) : new aqk(new aqi(obj));
    }

    public final Object b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqk) {
            return this.a.equals(((aqk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
