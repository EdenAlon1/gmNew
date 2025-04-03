package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijf implements aihs {
    public final aoku a;
    public final aler b;

    public aijf(aoku aokuVar, aler alerVar) {
        this.a = aokuVar;
        this.b = alerVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aijf)) {
            return false;
        }
        aijf aijfVar = (aijf) obj;
        return ffkj.e(this.a, aijfVar.a) && ffkj.e(this.b, aijfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        aler alerVar = this.b;
        return hashCode + (alerVar == null ? 0 : alerVar.hashCode());
    }

    public final String toString() {
        return cskt.b(super.toString()).toString();
    }
}
