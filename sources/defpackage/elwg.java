package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elwg extends elwv {
    private final List b;
    private final boolean c;
    private final boolean d;

    public elwg(List list, boolean z, boolean z2) {
        if (list == null) {
            throw new NullPointerException("Null possibleValues");
        }
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.elwo
    public final List a() {
        return this.b;
    }

    @Override // defpackage.elwo
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.elwo
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.elwo
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elwv) {
            elwv elwvVar = (elwv) obj;
            if (this.b.equals(elwvVar.a()) && this.c == elwvVar.c()) {
                elwvVar.d();
                if (this.d == elwvVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "StringProperty{possibleValues=" + this.b.toString() + ", required=" + this.c + ", valueMatchRequired=false, prohibited=" + this.d + "}";
    }
}
