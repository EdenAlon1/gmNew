package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cout {
    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public final boolean equals(Object obj) {
        if (obj instanceof cout) {
            return TextUtils.equals(d(), ((cout) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        String d = d();
        if (d != null) {
            return d.hashCode();
        }
        return 0;
    }
}
