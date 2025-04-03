package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvq {
    public final boolean a;

    public dnvq() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnvq) && this.a == ((dnvq) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(animateLastReadMarker=" + this.a + ")";
    }

    public dnvq(boolean z) {
        this.a = z;
    }

    public /* synthetic */ dnvq(byte[] bArr) {
        this(true);
    }
}
