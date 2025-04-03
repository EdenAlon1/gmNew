package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqhu extends dqhy {
    private final int a;
    private final int b;
    private final Object c;

    public dqhu(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    @Override // defpackage.dqhy
    public final void a(vk vkVar) {
        vkVar.v(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqhu)) {
            return false;
        }
        dqhu dqhuVar = (dqhu) obj;
        return this.a == dqhuVar.a && this.b == dqhuVar.b && ffkj.e(this.c, dqhuVar.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return (((this.a * 31) + this.b) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Changed(position=" + this.a + ", count=" + this.b + ", payload=" + this.c + ")";
    }
}
