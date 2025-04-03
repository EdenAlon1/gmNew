package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnun {
    private final boolean a;

    public dnun() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnun)) {
            return false;
        }
        boolean z = ((dnun) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "Flags(useRedesignedProgressBars=true)";
    }

    public /* synthetic */ dnun(byte[] bArr) {
        this.a = true;
    }
}
