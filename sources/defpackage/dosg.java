package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dosg {
    public final int a;

    public dosg() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dosg) && this.a == ((dosg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Flags(conversationScreenMonogramSizeDp=" + this.a + ")";
    }

    public dosg(int i) {
        this.a = i;
    }

    public /* synthetic */ dosg(byte[] bArr) {
        this(36);
    }
}
