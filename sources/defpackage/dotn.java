package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotn {
    private final ffcu a;

    public dotn() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dotn) && ffkj.e(this.a, ((dotn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Flags(unused=" + this.a + ")";
    }

    public /* synthetic */ dotn(byte[] bArr) {
        this.a = ffcu.a;
    }
}
