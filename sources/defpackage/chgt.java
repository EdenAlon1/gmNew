package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgt extends chis {
    public final chig a;
    public final chig b;

    public chgt(chig chigVar, chig chigVar2) {
        this.a = chigVar;
        this.b = chigVar2;
    }

    @Override // defpackage.chis
    public final chig a() {
        return this.a;
    }

    @Override // defpackage.chis
    public final chig b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chis) {
            chis chisVar = (chis) obj;
            if (this.a.equals(chisVar.a()) && this.b.equals(chisVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        chig chigVar = this.b;
        return "RpcCounterName{responseCounterNames=" + this.a.toString() + ", resultCounterNames=" + chigVar.toString() + "}";
    }
}
