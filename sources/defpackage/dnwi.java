package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwi {
    public final dnwj a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public dnwi(int i, dnwj dnwjVar, boolean z, boolean z2) {
        dnwjVar.getClass();
        this.d = i;
        this.a = dnwjVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnwi)) {
            return false;
        }
        dnwi dnwiVar = (dnwi) obj;
        return this.d == dnwiVar.d && this.a == dnwiVar.a && this.b == dnwiVar.b && this.c == dnwiVar.c;
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.a.hashCode()) * 31) + dnwh.a(this.b)) * 31) + dnwh.a(this.c);
    }

    public final String toString() {
        return "StatusUiData(state=" + ((Object) dnvs.a(this.d)) + ", style=" + this.a + ", isGemini=" + this.b + ", isAnimated=" + this.c + ")";
    }
}
