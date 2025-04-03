package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqj extends bqx {
    public final brk a;
    public final int b;

    public bqj(brk brkVar, int i) {
        if (brkVar == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.a = brkVar;
        this.b = i;
    }

    @Override // defpackage.bqx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bqx
    public final brk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqx) {
            bqx bqxVar = (bqx) obj;
            if (this.a.equals(bqxVar.b()) && this.b == bqxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "RuleStrategy{fallbackQuality=" + this.a + ", fallbackRule=" + this.b + "}";
    }
}
