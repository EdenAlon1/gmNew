package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abml {
    private final boolean a;

    public abml(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abml)) {
            return false;
        }
        boolean z = ((abml) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(handleRbmAppBar=false)";
    }

    public abml() {
        this(null);
    }
}
