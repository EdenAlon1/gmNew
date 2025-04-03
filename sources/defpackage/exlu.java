package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exlu extends exlt {
    private volatile transient int c;
    private volatile transient boolean d;

    public exlu(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.exlt
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exlu) || hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof exmd)) {
                return false;
            }
            exmd exmdVar = (exmd) obj;
            if (this.a != exmdVar.a() || this.b != exmdVar.b()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.exlt
    public final int hashCode() {
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    this.c = ((this.a ^ 1000003) * 1000003) ^ this.b;
                    this.d = true;
                }
            }
        }
        return this.c;
    }
}
