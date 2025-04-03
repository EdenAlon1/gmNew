package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehzp extends eict {
    private final Optional a;
    private final Optional b;

    public ehzp(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.eict
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.eict
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eict) {
            eict eictVar = (eict) obj;
            if (this.a.equals(eictVar.a()) && this.b.equals(eictVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
