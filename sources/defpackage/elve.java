package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elve extends elvs {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public elve(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }

    @Override // defpackage.elvs
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.elvs
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.elvs
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.elvs
    public final Optional d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elvs) {
            elvs elvsVar = (elvs) obj;
            if (this.a.equals(elvsVar.d()) && this.b.equals(elvsVar.a()) && this.c.equals(elvsVar.c()) && this.d.equals(elvsVar.b())) {
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
        return "Argument{recipient=" + String.valueOf(this.a) + ", message=" + String.valueOf(optional3) + ", position=" + String.valueOf(optional2) + ", messageMode=" + String.valueOf(optional) + "}";
    }
}
