package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domr {
    public final int a;
    public final int b;
    public final ffix c;
    public final ffix d;

    public domr(int i, int i2, ffix ffixVar, ffix ffixVar2) {
        this.a = i;
        this.b = i2;
        this.c = ffixVar;
        this.d = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof domr)) {
            return false;
        }
        domr domrVar = (domr) obj;
        return this.a == domrVar.a && this.b == domrVar.b && ffkj.e(this.c, domrVar.c) && ffkj.e(this.d, domrVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TextResultsBarUiData(resultCount=" + this.a + ", currentResult=" + this.b + ", onPreviousClick=" + this.c + ", onNextClick=" + this.d + ")";
    }
}
