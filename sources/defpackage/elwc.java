package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elwc extends elwj {
    private final List a;
    private final boolean b;

    public elwc(List list, boolean z) {
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
        return this.b;
    }

    @Override // defpackage.elwo
    public final boolean c() {
        return false;
    }

    @Override // defpackage.elwo
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elwj) {
            elwj elwjVar = (elwj) obj;
            if (this.a.equals(elwjVar.a())) {
                elwjVar.c();
                elwjVar.d();
                if (this.b == elwjVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "EntityProperty{possibleValues=" + this.a.toString() + ", required=false, valueMatchRequired=false, prohibited=" + this.b + "}";
    }
}
