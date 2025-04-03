package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndy {
    public final cnea a;
    public final cndn b;

    public cndy(cnea cneaVar, cndn cndnVar) {
        cneaVar.getClass();
        this.a = cneaVar;
        this.b = cndnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cndy)) {
            return false;
        }
        cndy cndyVar = (cndy) obj;
        return this.a == cndyVar.a && this.b == cndyVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cndn cndnVar = this.b;
        return hashCode + (cndnVar == null ? 0 : cndnVar.hashCode());
    }

    public final String toString() {
        return "TransportSelectionResult(transportSelectionStatus=" + this.a + ", reactionsTransportType=" + this.b + ")";
    }
}
