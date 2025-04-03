package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edkz extends edmn {
    public final List a;

    public edkz(List list) {
        if (list == null) {
            throw new NullPointerException("Null asList");
        }
        this.a = list;
    }

    @Override // defpackage.edmn
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edmn) {
            return this.a.equals(((edmn) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AuthorAttributions{asList=" + this.a.toString() + "}";
    }
}
