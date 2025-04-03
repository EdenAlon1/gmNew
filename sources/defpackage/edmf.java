package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edmf extends edqn {
    public final edpb a;
    public final edor b;
    public final edpc c;
    public final boolean d;

    public edmf(edpb edpbVar, edor edorVar, edpc edpcVar, boolean z) {
        this.a = edpbVar;
        if (edorVar == null) {
            throw new NullPointerException("Null day");
        }
        this.b = edorVar;
        if (edpcVar == null) {
            throw new NullPointerException("Null time");
        }
        this.c = edpcVar;
        this.d = z;
    }

    @Override // defpackage.edqn
    public final edor a() {
        return this.b;
    }

    @Override // defpackage.edqn
    public final edpb b() {
        return this.a;
    }

    @Override // defpackage.edqn
    public final edpc c() {
        return this.c;
    }

    @Override // defpackage.edqn
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqn) {
            edqn edqnVar = (edqn) obj;
            edpb edpbVar = this.a;
            if (edpbVar != null ? edpbVar.equals(edqnVar.b()) : edqnVar.b() == null) {
                if (this.b.equals(edqnVar.a()) && this.c.equals(edqnVar.c()) && this.d == edqnVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        edpb edpbVar = this.a;
        return (((((((edpbVar == null ? 0 : edpbVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        edpc edpcVar = this.c;
        edor edorVar = this.b;
        return "TimeOfWeek{date=" + String.valueOf(this.a) + ", day=" + edorVar.toString() + ", time=" + edpcVar.toString() + ", truncated=" + this.d + "}";
    }
}
