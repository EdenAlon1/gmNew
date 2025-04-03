package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysg implements ysh {
    private final Instant a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysg)) {
            return false;
        }
        Instant instant = ((ysg) obj).a;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a.i(null, "Succeeded(instantShown=", ")");
    }
}
