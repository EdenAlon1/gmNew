package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwgs {
    public final fgdj a;
    public final ffix b;

    public cwgs(fgdj fgdjVar, ffix ffixVar) {
        this.a = fgdjVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwgs)) {
            return false;
        }
        cwgs cwgsVar = (cwgs) obj;
        return ffkj.e(this.a, cwgsVar.a) && ffkj.e(this.b, cwgsVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ToastUiData(text=" + this.a + ", onToastShown=" + this.b + ")";
    }
}
