package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytq {
    private final boolean a;

    public cytq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cytq)) {
            return false;
        }
        boolean z = ((cytq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=false)";
    }

    public /* synthetic */ cytq(byte[] bArr) {
        this.a = false;
    }
}
