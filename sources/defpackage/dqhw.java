package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqhw extends dqhy {
    private final int a;
    private final int b;

    public dqhw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dqhy
    public final void a(vk vkVar) {
        vkVar.t(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqhw)) {
            return false;
        }
        dqhw dqhwVar = (dqhw) obj;
        return this.a == dqhwVar.a && this.b == dqhwVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Moved(from=" + this.a + ", to=" + this.b + ")";
    }
}
