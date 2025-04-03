package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmq extends dzoy {
    private final dzqs a;
    private final engw b;
    private final emxc c;
    private final emxc d;

    public dzmq(dzqs dzqsVar, engw engwVar, emxc emxcVar, emxc emxcVar2) {
        this.a = dzqsVar;
        this.b = engwVar;
        this.c = emxcVar;
        this.d = emxcVar2;
    }

    @Override // defpackage.dzoy
    public final dzqs a() {
        return this.a;
    }

    @Override // defpackage.dzoy
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dzoy
    public final emxc c() {
        return this.d;
    }

    @Override // defpackage.dzoy
    public final engw d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzoy) {
            dzoy dzoyVar = (dzoy) obj;
            if (this.a.equals(dzoyVar.a()) && enkr.h(this.b, dzoyVar.d()) && this.c.equals(dzoyVar.b()) && this.d.equals(dzoyVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.d;
        emxc emxcVar2 = this.c;
        engw engwVar = this.b;
        return "CloudMessage{message=" + this.a.toString() + ", annotations=" + engwVar.toString() + ", needsDeliveryReceipt=" + emxcVar2.toString() + ", suggestionList=" + emxcVar.toString() + "}";
    }
}
