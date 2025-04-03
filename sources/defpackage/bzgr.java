package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzgr {
    public final boolean a;
    public final boolean b;
    public final int c;

    public bzgr(int i, boolean z, boolean z2) {
        this.c = i;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzgr)) {
            return false;
        }
        bzgr bzgrVar = (bzgr) obj;
        return this.c == bzgrVar.c && this.a == bzgrVar.a && this.b == bzgrVar.b;
    }

    public final int hashCode() {
        return (((this.c * 31) + bzgq.a(this.a)) * 31) + bzgq.a(this.b);
    }

    public final String toString() {
        return "DevicePairingInfo(devicePairingPage=" + ((Object) bzhz.a(this.c)) + ", autoTurnOnGaiaPairing=" + this.a + ", hasGaiaPairingEnabled=" + this.b + ")";
    }
}
