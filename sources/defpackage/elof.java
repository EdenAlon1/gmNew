package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elof extends elop {
    private final Optional a;

    public elof(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.elop
    public final Optional a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elop) {
            return this.a.equals(((elop) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Argument{softwareInstruction=" + String.valueOf(this.a) + "}";
    }
}
