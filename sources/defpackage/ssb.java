package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssb implements Comparable {
    public final boolean a;
    public final boolean b;
    private final int c;
    private final boolean d;

    public ssb(int i, boolean z, boolean z2, boolean z3) {
        this.c = i;
        this.d = z;
        this.a = z2;
        this.b = z3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ssb ssbVar = (ssb) obj;
        ssbVar.getClass();
        return ffkj.a(this.c, ssbVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssb)) {
            return false;
        }
        ssb ssbVar = (ssb) obj;
        return this.c == ssbVar.c && this.d == ssbVar.d && this.a == ssbVar.a && this.b == ssbVar.b;
    }

    public final int hashCode() {
        int i = this.c;
        boolean z = this.b;
        return (((((i * 31) + ssa.a(this.d)) * 31) + ssa.a(this.a)) * 31) + ssa.a(z);
    }

    public final String toString() {
        return "BannerPriority(weight=" + this.c + ", canBeShownAgain=" + this.d + ", canShowAfterAnotherBanner=" + this.a + ", anyOtherBannersCanShowAfterThis=" + this.b + ")";
    }

    public /* synthetic */ ssb(int i, int i2) {
        this(i, (i2 & 2) != 0, (i2 & 4) != 0, (i2 & 8) != 0);
    }
}
