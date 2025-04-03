package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjs {
    private final boolean a;

    public dmjs(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmjs)) {
            return false;
        }
        boolean z = ((dmjs) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=false)";
    }

    public dmjs() {
        this(null);
    }
}
