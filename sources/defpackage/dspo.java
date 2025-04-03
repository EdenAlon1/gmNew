package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspo {
    public final Object a;
    public final dsrs b;
    public final dspq c;

    public dspo(Object obj, dsrs dsrsVar, dspq dspqVar) {
        this.a = obj;
        this.b = dsrsVar;
        this.c = dspqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dspo)) {
            return false;
        }
        dspo dspoVar = (dspo) obj;
        return ffkj.e(this.a, dspoVar.a) && ffkj.e(this.b, dspoVar.b) && ffkj.e(this.c, dspoVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Projection(uiData=" + this.a + ", uiSpec=" + this.b + ", lifecycle=" + this.c + ")";
    }
}
