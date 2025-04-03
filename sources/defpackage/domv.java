package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domv {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public domv() {
        /*
            r2 = this;
            r0 = 0
            r1 = 127(0x7f, float:1.78E-43)
            r2.<init>(r0, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.domv.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof domv)) {
            return false;
        }
        domv domvVar = (domv) obj;
        if (this.f != domvVar.f || this.a != domvVar.a) {
            return false;
        }
        boolean z = domvVar.g;
        return this.b == domvVar.b && this.c == domvVar.c && this.d == domvVar.d && this.e == domvVar.e;
    }

    public final int hashCode() {
        int a = domu.a(this.f);
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        return (((((((((((a * 31) + domu.a(this.a)) * 31) + domu.a(false)) * 31) + domu.a(this.b)) * 31) + domu.a(z3)) * 31) + domu.a(z2)) * 31) + domu.a(z);
    }

    public final String toString() {
        return "Flags(enableInBubbleReadReceipts=" + this.f + ", enableSwipeToShowTimestamps=" + this.a + ", enableColorSwap=false, enableGetTextWithContentMinWidthFix=" + this.b + ", enableRememberMeasurementsForTextBubble=" + this.c + ", disableNewTimestampsForTalkback=" + this.d + ", moveCompositionLayoutProvider=" + this.e + ")";
    }

    public domv(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f = z;
        this.a = z2;
        this.g = false;
        this.b = z3;
        this.c = z4;
        this.d = z5;
        this.e = z6;
    }

    public /* synthetic */ domv(boolean z, boolean z2, boolean z3, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), false, false, ((i & 16) == 0) & z2, false, ((i & 64) == 0) & z3);
    }
}
