package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffor {
    public final String a;
    private final ffmj b;

    public ffor(String str, ffmj ffmjVar) {
        ffmjVar.getClass();
        this.a = str;
        this.b = ffmjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffor)) {
            return false;
        }
        ffor fforVar = (ffor) obj;
        return ffkj.e(this.a, fforVar.a) && ffkj.e(this.b, fforVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ")";
    }
}
