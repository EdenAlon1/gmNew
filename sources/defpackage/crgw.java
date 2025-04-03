package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgw {
    public final djtp a;
    public final int b;

    public crgw(djtp djtpVar, int i) {
        this.a = djtpVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crgw)) {
            return false;
        }
        crgw crgwVar = (crgw) obj;
        return ffkj.e(this.a, crgwVar.a) && djrq.b(this.b, crgwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "RegistrationInfo(configuration=" + this.a + ", subscriptionId=" + djrq.a(this.b) + ")";
    }
}
