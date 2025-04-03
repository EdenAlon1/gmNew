package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elvg extends elvy {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public elvg(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }

    @Override // defpackage.elvy
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.elvy
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.elvy
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.elvy
    public final Optional d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elvy) {
            elvy elvyVar = (elvy) obj;
            if (this.a.equals(elvyVar.d()) && this.b.equals(elvyVar.a()) && this.c.equals(elvyVar.c()) && this.d.equals(elvyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "Property{recipient=" + this.a.toString() + ", message=" + String.valueOf(optional3) + ", messagePosition=" + optional2.toString() + ", messageMode=" + String.valueOf(optional) + "}";
    }
}
