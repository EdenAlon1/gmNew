package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayc extends aym {
    public final bne a;
    public final int b;

    public ayc(bne bneVar, int i) {
        this.a = bneVar;
        this.b = i;
    }

    @Override // defpackage.aym
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aym
    public final bne b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aym) {
            aym aymVar = (aym) obj;
            if (this.a.equals(aymVar.b()) && this.b == aymVar.a()) {
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
