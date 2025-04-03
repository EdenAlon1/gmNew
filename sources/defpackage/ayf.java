package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayf extends azj {
    public final bne a;
    public final int b;

    public ayf(bne bneVar, int i) {
        this.a = bneVar;
        this.b = i;
    }

    @Override // defpackage.azj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.azj
    public final bne b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azj) {
            azj azjVar = (azj) obj;
            if (this.a.equals(azjVar.b()) && this.b == azjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "In{packet=" + this.a + ", jpegQuality=" + this.b + "}";
    }
}
