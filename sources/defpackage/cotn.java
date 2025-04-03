package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotn extends coxj {
    public final enip a;
    public final enip b;
    public final enip c;
    public final enip d;

    public cotn(enip enipVar, enip enipVar2, enip enipVar3, enip enipVar4) {
        if (enipVar == null) {
            throw new NullPointerException("Null from");
        }
        this.a = enipVar;
        if (enipVar2 == null) {
            throw new NullPointerException("Null to");
        }
        this.b = enipVar2;
        if (enipVar3 == null) {
            throw new NullPointerException("Null cc");
        }
        this.c = enipVar3;
        if (enipVar4 == null) {
            throw new NullPointerException("Null fromIdentities");
        }
        this.d = enipVar4;
    }

    @Override // defpackage.coxj
    public final enip a() {
        return this.c;
    }

    @Override // defpackage.coxj
    public final enip b() {
        return this.a;
    }

    @Override // defpackage.coxj
    public final enip c() {
        return this.d;
    }

    @Override // defpackage.coxj
    public final enip d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof coxj) {
            coxj coxjVar = (coxj) obj;
            if (this.a.equals(coxjVar.b()) && this.b.equals(coxjVar.d()) && this.c.equals(coxjVar.a()) && this.d.equals(coxjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        enip enipVar = this.d;
        enip enipVar2 = this.c;
        enip enipVar3 = this.b;
        return "MessageEnvelope{from=" + this.a.toString() + ", to=" + enipVar3.toString() + ", cc=" + enipVar2.toString() + ", fromIdentities=" + enipVar.toString() + "}";
    }
}
