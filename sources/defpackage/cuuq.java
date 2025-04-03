package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuuq {
    private final String a;
    private final int b;

    public cuuq(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final cukp a(Integer num) {
        int i = this.b - 2;
        erer ererVar = (i == 2 || i == 8) ? erer.SPAM : i != 11 ? erer.NO_VERDICT : erer.NOT_SPAM;
        cula culaVar = i != 2 ? i != 8 ? i != 11 ? cula.a : cula.c : cula.b : cula.c;
        String str = this.a;
        enru enruVar = cuuw.a;
        return new cukp(ererVar, culaVar, str, cuup.a(this.b, num), null, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuuq)) {
            return false;
        }
        cuuq cuuqVar = (cuuq) obj;
        return this.b == cuuqVar.b && ffkj.e(this.a, cuuqVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return (this.b * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StrangerCheckResult(action=" + ((Object) fgto.c(this.b)) + ", initiatedBy=" + this.a + ")";
    }
}
