package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elwe extends elwn {
    private final List a;
    private final boolean b;

    public elwe(List list, boolean z) {
        if (list == null) {
            throw new NullPointerException("Null possibleValues");
        }
        this.a = list;
        this.b = z;
    }

    @Override // defpackage.elwo
    public final List a() {
        return this.a;
    }

    @Override // defpackage.elwo
    public final boolean b() {
        return false;
    }

    @Override // defpackage.elwo
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.elwo
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elwn) {
            elwn elwnVar = (elwn) obj;
            if (this.a.equals(elwnVar.a()) && this.b == elwnVar.c()) {
                elwnVar.d();
                elwnVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "IntegerProperty{possibleValues=" + this.a.toString() + ", required=" + this.b + ", valueMatchRequired=false, prohibited=false}";
    }
}
