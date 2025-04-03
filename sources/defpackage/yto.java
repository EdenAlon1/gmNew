package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yto implements ytp {
    private final Exception a;

    public yto() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yto)) {
            return false;
        }
        Exception exc = ((yto) obj).a;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a.i(null, "Rejected(exception=", ")");
    }

    public /* synthetic */ yto(byte[] bArr) {
        this.a = null;
    }
}
