package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvsi {
    public final boolean a;
    public final boolean b;
    private final boolean c;

    public cvsi(boolean z, boolean z2) {
        this.a = z;
        this.c = false;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvsi)) {
            return false;
        }
        cvsi cvsiVar = (cvsi) obj;
        if (this.a != cvsiVar.a) {
            return false;
        }
        boolean z = cvsiVar.c;
        return this.b == cvsiVar.b;
    }

    public final int hashCode() {
        return (((cvsh.a(this.a) * 31) + cvsh.a(false)) * 31) + cvsh.a(this.b);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableStartChatCoolRanchPhase3=false, hideKeyboardOnScroll=" + this.b + ")";
    }

    public cvsi() {
        this(false, false);
    }
}
