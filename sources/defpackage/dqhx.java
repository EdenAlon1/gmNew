package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqhx extends dqhy {
    public final int a;
    public final int b;

    public dqhx(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dqhy
    public final void a(vk vkVar) {
        vkVar.x(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqhx)) {
            return false;
        }
        dqhx dqhxVar = (dqhx) obj;
        return this.a == dqhxVar.a && this.b == dqhxVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Removed(position=" + this.a + ", count=" + this.b + ")";
    }
}
