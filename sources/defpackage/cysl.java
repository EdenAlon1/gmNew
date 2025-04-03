package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cysl {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    public cysl(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.d = z2;
        this.b = z3;
        this.c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cysl)) {
            return false;
        }
        cysl cyslVar = (cysl) obj;
        return this.a == cyslVar.a && this.d == cyslVar.d && this.b == cyslVar.b && this.c == cyslVar.c;
    }

    public final int hashCode() {
        int a = cysk.a(this.a);
        boolean z = this.c;
        return (((((a * 31) + cysk.a(this.d)) * 31) + cysk.a(this.b)) * 31) + cysk.a(z);
    }

    public final String toString() {
        return "Flags(disableSharedElementTransitionsInTests=" + this.a + ", enableHeadersInCdpTopBarOnScroll=" + this.d + ", enableCoolRanchPhase3=" + this.b + ", enableGroupIconOnUpdate=" + this.c + ")";
    }

    public cysl() {
        this(true, false, false, false);
    }
}
