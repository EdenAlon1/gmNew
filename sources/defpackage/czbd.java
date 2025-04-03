package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public czbd() {
        /*
            r2 = this;
            r0 = 0
            r1 = 15
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czbd.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czbd)) {
            return false;
        }
        czbd czbdVar = (czbd) obj;
        return this.a == czbdVar.a && this.b == czbdVar.b && this.c == czbdVar.c && this.d == czbdVar.d;
    }

    public final int hashCode() {
        int a = czbc.a(this.a);
        boolean z = this.d;
        return (((((a * 31) + czbc.a(this.b)) * 31) + czbc.a(this.c)) * 31) + czbc.a(z);
    }

    public final String toString() {
        return "Flags(enableHeadersInCdpTopBarOnScroll=" + this.a + ", enableCoolRanchPhase3=" + this.b + ", enableMiniCdpInCdp=" + this.c + ", moveActiveSimToTop=" + this.d + ")";
    }

    public czbd(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public /* synthetic */ czbd(boolean z, boolean z2, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), z2 & ((i & 2) == 0), false, false);
    }
}
