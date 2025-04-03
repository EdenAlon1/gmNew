package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elxf extends elya {
    private final Optional a;
    private final String b;

    public elxf(Optional optional, String str) {
        this.a = optional;
        this.b = str;
    }

    @Override // defpackage.elya
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.elya
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elya) {
            elya elyaVar = (elya) obj;
            if (this.a.equals(elyaVar.a()) && this.b.equals(elyaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "EntityValue{id=" + this.a.toString() + ", value=" + this.b + "}";
    }
}
