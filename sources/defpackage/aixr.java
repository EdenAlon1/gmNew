package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixr {
    public final boolean a;
    public final List b;

    public aixr(boolean z, List list) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aixr)) {
            return false;
        }
        aixr aixrVar = (aixr) obj;
        return this.a == aixrVar.a && ffkj.e(this.b, aixrVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PenpalAvailabilityResult(isAvailable=" + this.a + ", unavailableReasons=" + this.b + ")";
    }
}
