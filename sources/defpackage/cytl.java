package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytl {
    public final boolean a;
    private final boolean b;

    public cytl() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cytl)) {
            return false;
        }
        cytl cytlVar = (cytl) obj;
        if (this.a != cytlVar.a) {
            return false;
        }
        boolean z = cytlVar.b;
        return true;
    }

    public final int hashCode() {
        return (cytk.a(this.a) * 31) + cytk.a(false);
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=" + this.a + ", enableShortTitle=false)";
    }

    public cytl(boolean z) {
        this.a = z;
        this.b = false;
    }

    public /* synthetic */ cytl(byte[] bArr) {
        this(false);
    }
}
