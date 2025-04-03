package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcy {
    public final String a;
    public final esgx b;

    public emcy(String str, esgx esgxVar) {
        esgxVar.getClass();
        this.a = str;
        this.b = esgxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emcy)) {
            return false;
        }
        emcy emcyVar = (emcy) obj;
        return ffkj.e(this.a, emcyVar.a) && this.b == emcyVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MagicRewriteResponse(message=" + this.a + ", style=" + this.b + ")";
    }
}
