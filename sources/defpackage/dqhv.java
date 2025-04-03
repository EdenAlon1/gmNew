package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqhv extends dqhy {
    private final int a;
    private final int b;

    public dqhv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dqhy
    public final void a(vk vkVar) {
        vkVar.w(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqhv)) {
            return false;
        }
        dqhv dqhvVar = (dqhv) obj;
        return this.a == dqhvVar.a && this.b == dqhvVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Inserted(position=" + this.a + ", count=" + this.b + ")";
    }
}
