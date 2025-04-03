package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlo extends edpo {
    public final edpu a;
    public final edpu b;
    public final edpu c;
    public final edpu d;

    public edlo(edpu edpuVar, edpu edpuVar2, edpu edpuVar3, edpu edpuVar4) {
        if (edpuVar == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.a = edpuVar;
        if (edpuVar2 == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.b = edpuVar2;
        if (edpuVar3 == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.c = edpuVar3;
        if (edpuVar4 == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.d = edpuVar4;
    }

    @Override // defpackage.edpo
    public final edpu a() {
        return this.c;
    }

    @Override // defpackage.edpo
    public final edpu b() {
        return this.a;
    }

    @Override // defpackage.edpo
    public final edpu c() {
        return this.b;
    }

    @Override // defpackage.edpo
    public final edpu d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edpo) {
            edpo edpoVar = (edpo) obj;
            if (this.a.equals(edpoVar.b()) && this.b.equals(edpoVar.c()) && this.c.equals(edpoVar.a()) && this.d.equals(edpoVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        edpu edpuVar = this.d;
        edpu edpuVar2 = this.c;
        edpu edpuVar3 = this.b;
        return "PaymentOptions{acceptsCreditCards=" + this.a.toString() + ", acceptsDebitCards=" + edpuVar3.toString() + ", acceptsCashOnly=" + edpuVar2.toString() + ", acceptsNfc=" + edpuVar.toString() + "}";
    }
}
