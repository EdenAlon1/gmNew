package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsap {
    public final dszq a;
    public final dszq b;

    public dsap(dszq dszqVar, dszq dszqVar2) {
        this.a = dszqVar;
        this.b = dszqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsap)) {
            return false;
        }
        dsap dsapVar = (dsap) obj;
        return ffkj.e(this.a, dsapVar.a) && ffkj.e(this.b, dsapVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + ((dszo) this.b).a;
    }

    public final String toString() {
        return "Tint(background=" + this.a + ", icon=" + this.b + ")";
    }
}
