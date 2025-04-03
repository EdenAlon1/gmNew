package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnuq {
    public final boolean a;

    public dnuq() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnuq) && this.a == ((dnuq) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(useNewUx=" + this.a + ")";
    }

    public dnuq(boolean z) {
        this.a = z;
    }

    public /* synthetic */ dnuq(byte[] bArr) {
        this(false);
    }
}
