package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqj extends esqr {
    public final esqq a;
    public final esqp b;
    public final esqo c;

    public esqj(esqq esqqVar, esqp esqpVar, esqo esqoVar) {
        this.a = esqqVar;
        this.b = esqpVar;
        this.c = esqoVar;
    }

    @Override // defpackage.esqr
    public final esqo a() {
        return this.c;
    }

    @Override // defpackage.esqr
    public final esqp b() {
        return this.b;
    }

    @Override // defpackage.esqr
    public final esqq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esqr) {
            esqr esqrVar = (esqr) obj;
            if (this.a.equals(esqrVar.c()) && this.b.equals(esqrVar.b()) && this.c.equals(esqrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        esqo esqoVar = this.c;
        esqp esqpVar = this.b;
        return "GroupFeatures{userRemovalPolicy=" + this.a.toString() + ", renamingPolicy=" + esqpVar.toString() + ", groupIconModificationPolicy=" + esqoVar.toString() + "}";
    }
}
