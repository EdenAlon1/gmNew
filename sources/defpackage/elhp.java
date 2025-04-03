package defpackage;

import defpackage.eljo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elhp extends eljo.a {
    private final eljy a;

    public elhp(eljy eljyVar) {
        if (eljyVar == null) {
            throw new NullPointerException("Null trace");
        }
        this.a = eljyVar;
    }

    @Override // eljo.a
    public final eljy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eljo.a) {
            return this.a.equals(((eljo.a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TraceSelectedEvent{trace=" + this.a.toString() + "}";
    }
}
