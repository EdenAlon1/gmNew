package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espp {
    public final fceg a;
    public final String b = "RCS";

    public espp(fceg fcegVar, String str) {
        this.a = fcegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof espp)) {
            return false;
        }
        espp esppVar = (espp) obj;
        return ffkj.e(this.a, esppVar.a) && ffkj.e(this.b, esppVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Configuration(clientInfo=" + this.a + ", appName=" + this.b + ")";
    }
}
