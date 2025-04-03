package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aige {
    private final boolean a;

    public aige(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aige)) {
            return false;
        }
        boolean z = ((aige) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableMultiShareCoolRanchPhase3=false)";
    }

    public aige() {
        this(null);
    }
}
