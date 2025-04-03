package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skv implements skw {
    public final Bundle a;

    public skv(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skv) && ffkj.e(this.a, ((skv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(bundle=" + this.a + ")";
    }
}
