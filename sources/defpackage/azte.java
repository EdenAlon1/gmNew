package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azte {
    public final int a;
    private final String b;

    public azte(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azte)) {
            return false;
        }
        azte azteVar = (azte) obj;
        return this.a == azteVar.a && ffkj.e(this.b, azteVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SubIdIccIdPair(subId=" + this.a + ", iccId=" + this.b + ")";
    }
}
