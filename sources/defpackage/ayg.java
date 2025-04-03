package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayg extends azn {
    public final bne a;
    public final avg b;

    public ayg(bne bneVar, avg avgVar) {
        this.a = bneVar;
        this.b = avgVar;
    }

    @Override // defpackage.azn
    public final avg a() {
        return this.b;
    }

    @Override // defpackage.azn
    public final bne b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azn) {
            azn aznVar = (azn) obj;
            if (this.a.equals(aznVar.b()) && this.b.equals(aznVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.a + ", outputFileOptions=" + this.b + "}";
    }
}
