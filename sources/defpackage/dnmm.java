package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;

    public dnmm() {
        this(false, false, false, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnmm)) {
            return false;
        }
        dnmm dnmmVar = (dnmm) obj;
        if (this.a != dnmmVar.a) {
            return false;
        }
        boolean z = dnmmVar.e;
        return this.b == dnmmVar.b && this.c == dnmmVar.c && this.d == dnmmVar.d;
    }

    public final int hashCode() {
        int a = dnml.a(this.a);
        boolean z = this.d;
        boolean z2 = this.c;
        return (((((((a * 31) + dnml.a(false)) * 31) + dnml.a(this.b)) * 31) + dnml.a(z2)) * 31) + dnml.a(z);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", simplifyBubbleShape=false, enableMediaBoxSizeCalculatorFix=" + this.b + ", disableNewTimestampsForTalkback=" + this.c + ", useEmojiBubbleInCaption=" + this.d + ")";
    }

    public /* synthetic */ dnmm(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.e = false;
        this.b = ((i & 4) == 0) & z2;
        this.c = ((i & 8) == 0) & z3;
        this.d = (!((i & 16) == 0)) | z4;
    }
}
