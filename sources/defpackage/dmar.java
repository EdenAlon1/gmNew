package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmar {
    public final boolean a;

    public dmar() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmar) && this.a == ((dmar) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(moveRippleToContainer=" + this.a + ")";
    }

    public dmar(boolean z) {
        this.a = z;
    }

    public /* synthetic */ dmar(byte[] bArr) {
        this(true);
    }
}
