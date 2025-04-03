package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cweb {
    public final boolean a;
    public final boolean b;
    private final boolean c;

    public cweb() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cweb)) {
            return false;
        }
        cweb cwebVar = (cweb) obj;
        if (this.a != cwebVar.a) {
            return false;
        }
        boolean z = cwebVar.c;
        return this.b == cwebVar.b;
    }

    public final int hashCode() {
        return (((cwea.a(this.a) * 31) + cwea.a(false)) * 31) + cwea.a(this.b);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableStartChatCoolRanchPhase3=false, enableEmergencyRow=" + this.b + ")";
    }

    public cweb(boolean z, boolean z2) {
        this.a = z;
        this.c = false;
        this.b = z2;
    }

    public /* synthetic */ cweb(byte[] bArr) {
        this(false, false);
    }
}
