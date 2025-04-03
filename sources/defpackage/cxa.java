package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxa {
    public final ffji a;
    public final cyq b;

    public cxa(ffji ffjiVar, cyq cyqVar) {
        this.a = ffjiVar;
        this.b = cyqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxa)) {
            return false;
        }
        cxa cxaVar = (cxa) obj;
        return ffkj.e(this.a, cxaVar.a) && ffkj.e(this.b, cxaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
