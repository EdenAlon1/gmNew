package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eghc extends eghf {
    private final String a;
    private final int b;

    public eghc(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null layerName");
        }
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.eghf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eghf
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eghf) {
            eghf eghfVar = (eghf) obj;
            if (this.a.equals(eghfVar.b()) && this.b == eghfVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "HueShift{layerName=" + this.a + ", shiftDegrees=" + this.b + "}";
    }
}
