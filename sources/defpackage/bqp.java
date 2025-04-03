package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqp extends brm {
    private final brk a;
    private final int b;

    public bqp(brk brkVar, int i) {
        if (brkVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.a = brkVar;
        this.b = i;
    }

    @Override // defpackage.brm
    public final int a() {
        return this.b;
    }

    @Override // defpackage.brm
    public final brk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brm) {
            brm brmVar = (brm) obj;
            if (this.a.equals(brmVar.b()) && this.b == brmVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "QualityRatio{quality=" + this.a + ", aspectRatio=" + this.b + "}";
    }
}
