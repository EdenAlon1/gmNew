package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgi extends dlaf {
    private final String a;
    private final String b;
    private final double c;

    public dlgi(String str, String str2, double d) {
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlgi)) {
            return false;
        }
        dlgi dlgiVar = (dlgi) obj;
        return ffkj.e(this.a, dlgiVar.a) && ffkj.e(this.b, dlgiVar.b) && Double.compare(this.c, dlgiVar.c) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }
}
