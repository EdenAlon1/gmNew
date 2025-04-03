package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlq extends edpq {
    public final edqn a;
    public final edqn b;

    public edlq(edqn edqnVar, edqn edqnVar2) {
        this.a = edqnVar;
        this.b = edqnVar2;
    }

    @Override // defpackage.edpq
    public final edqn a() {
        return this.b;
    }

    @Override // defpackage.edpq
    public final edqn b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edpq) {
            edpq edpqVar = (edpq) obj;
            edqn edqnVar = this.a;
            if (edqnVar != null ? edqnVar.equals(edpqVar.b()) : edpqVar.b() == null) {
                edqn edqnVar2 = this.b;
                if (edqnVar2 != null ? edqnVar2.equals(edpqVar.a()) : edpqVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        edqn edqnVar = this.a;
        int hashCode = edqnVar == null ? 0 : edqnVar.hashCode();
        edqn edqnVar2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (edqnVar2 != null ? edqnVar2.hashCode() : 0);
    }

    public final String toString() {
        edqn edqnVar = this.b;
        return "Period{open=" + String.valueOf(this.a) + ", close=" + String.valueOf(edqnVar) + "}";
    }
}
