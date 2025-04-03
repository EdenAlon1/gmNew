package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyg implements hbr {
    private final hun a;
    private final hun b;
    private final int c;

    public gyg(hun hunVar, hun hunVar2, int i) {
        this.a = hunVar;
        this.b = hunVar2;
        this.c = i;
    }

    @Override // defpackage.hbr
    public final int a(kac kacVar, long j, int i, kah kahVar) {
        int a = this.b.a(0, kacVar.b(), kahVar);
        return kacVar.b + a + (-this.a.a(0, i, kahVar)) + (kahVar == kah.a ? this.c : -this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyg)) {
            return false;
        }
        gyg gygVar = (gyg) obj;
        return ffkj.e(this.a, gygVar.a) && ffkj.e(this.b, gygVar.b) && this.c == gygVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
