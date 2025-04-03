package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elxn extends elyi {
    private final Optional a;
    private final Optional b;

    public elxn(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.elyv
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.elyv
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elyi) {
            elyi elyiVar = (elyi) obj;
            if (this.a.equals(elyiVar.b()) && this.b.equals(elyiVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "OrderItem{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional) + "}";
    }
}
