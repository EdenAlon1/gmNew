package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
class csxc extends csxr {
    private final List a;

    public csxc(List list) {
        if (list == null) {
            throw new NullPointerException("Null results");
        }
        this.a = list;
    }

    @Override // defpackage.csxr
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csxr) {
            return this.a.equals(((csxr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TenorSearchResponse{results=" + this.a.toString() + "}";
    }
}
