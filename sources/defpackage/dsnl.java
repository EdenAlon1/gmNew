package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsnl extends dsnn {
    public final eg a;
    public final dsmn b;

    public dsnl(eg egVar, dsmn dsmnVar) {
        this.a = egVar;
        this.b = dsmnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsnl)) {
            return false;
        }
        dsnl dsnlVar = (dsnl) obj;
        return ffkj.e(this.a, dsnlVar.a) && ffkj.e(this.b, dsnlVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Attached(activity=" + this.a + ", listener=" + this.b + ")";
    }
}
