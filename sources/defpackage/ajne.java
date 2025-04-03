package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajne {
    public final avlk a;
    public final boolean b;

    public ajne(avlk avlkVar, boolean z) {
        this.a = avlkVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajne)) {
            return false;
        }
        ajne ajneVar = (ajne) obj;
        return ffkj.e(this.a, ajneVar.a) && this.b == ajneVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "RcsCapabilitiesWithExpiry(capabilities=" + this.a + ", expired=" + this.b + ")";
    }
}
