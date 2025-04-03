package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class exlt extends exmd {
    public final int a;
    public final int b;

    public exlt(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.exmd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.exmd
    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exmd) {
            exmd exmdVar = (exmd) obj;
            if (this.a == exmdVar.a() && this.b == exmdVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "MPImageProperties{imageFormat=" + this.a + ", storageType=" + this.b + "}";
    }
}
