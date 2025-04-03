package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elyz extends elzb {
    private final Optional a;
    private final Optional b;

    public elyz(Optional optional, Optional optional2) {
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
        if (obj instanceof elzb) {
            elzb elzbVar = (elzb) obj;
            if (this.a.equals(elzbVar.b()) && this.b.equals(elzbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
