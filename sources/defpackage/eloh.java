package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eloh extends elou {
    private final Optional a;

    public eloh(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.elou
    public final Optional a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elou) {
            return this.a.equals(((elou) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Output{executionStatus=" + String.valueOf(this.a) + "}";
    }
}
