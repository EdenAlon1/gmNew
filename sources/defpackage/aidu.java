package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidu {
    public final boolean a;

    public aidu() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aidu) && this.a == ((aidu) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ")";
    }

    public aidu(boolean z) {
        this.a = z;
    }

    public /* synthetic */ aidu(byte[] bArr) {
        this(false);
    }
}
