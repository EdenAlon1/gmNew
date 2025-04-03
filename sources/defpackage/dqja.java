package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqja {
    public final Object a;
    public double b;

    public dqja(Object obj, double d) {
        this.a = obj;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqja)) {
            return false;
        }
        dqja dqjaVar = (dqja) obj;
        return ffkj.e(this.a, dqjaVar.a) && Double.compare(this.b, dqjaVar.b) == 0;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "Frecency(entity=" + this.a + ", score=" + this.b + ")";
    }
}
