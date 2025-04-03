package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aye extends azf {
    public final avr a;
    public final int b;
    public final avg c;

    public aye(avr avrVar, int i, avg avgVar) {
        this.a = avrVar;
        this.b = i;
        this.c = avgVar;
    }

    @Override // defpackage.azf
    public final int a() {
        return this.b;
    }

    @Override // defpackage.azf
    public final avg b() {
        return this.c;
    }

    @Override // defpackage.azf
    public final avr c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azf) {
            azf azfVar = (azf) obj;
            if (this.a.equals(azfVar.c()) && this.b == azfVar.a() && this.c.equals(azfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "In{imageProxy=" + this.a + ", rotationDegrees=" + this.b + ", outputFileOptions=" + this.c + "}";
    }
}
