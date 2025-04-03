package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espw {
    public static final espw a = new espw(espt.q, espv.a);
    public final espt b;
    public final espv c;

    public espw(espt esptVar, espv espvVar) {
        esptVar.getClass();
        espvVar.getClass();
        this.b = esptVar;
        this.c = espvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof espw)) {
            return false;
        }
        espw espwVar = (espw) obj;
        return this.b == espwVar.b && this.c == espwVar.c;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TachygramErrorReason(tachygramError=" + this.b + ", recoveryType=" + this.c + ")";
    }
}
