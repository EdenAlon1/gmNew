package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubo extends euea {
    public final eubm a;
    public final eubk b;
    public final eubl c;
    public final eubn d;

    public eubo(eubm eubmVar, eubk eubkVar, eubl eublVar, eubn eubnVar) {
        this.a = eubmVar;
        this.b = eubkVar;
        this.c = eublVar;
        this.d = eubnVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.d != eubn.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eubo)) {
            return false;
        }
        eubo euboVar = (eubo) obj;
        return euboVar.a == this.a && euboVar.b == this.b && euboVar.c == this.c && euboVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(eubo.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.d.e + ", hashType: " + this.c.d + ", encoding: " + this.a.c + ", curve: " + this.b.d + ")";
    }
}
