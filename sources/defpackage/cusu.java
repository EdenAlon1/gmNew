package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cusu {
    private final String a;
    private final eylw b;
    private final cula c;
    private final int d;

    public cusu(int i, String str, eylw eylwVar) {
        this.d = i;
        this.a = str;
        this.b = eylwVar;
        cfva cfvaVar = cutc.a;
        this.c = cust.b(i);
    }

    public static /* synthetic */ cukp a(cusu cusuVar, Integer num, boolean z, int i) {
        if (z && ((i & 2) == 0)) {
            return new cukp(cusuVar.c(), cusuVar.c, cusuVar.d(), null, cusuVar.b(), 8);
        }
        if (1 == (i & 1)) {
            num = null;
        }
        erer c = cusuVar.c();
        cula culaVar = cusuVar.c;
        String d = cusuVar.d();
        cfva cfvaVar = cutc.a;
        return new cukp(c, culaVar, d, cust.a(cusuVar.c(), cusuVar.d, num), cusuVar.b());
    }

    private final cukn b() {
        eylw eylwVar = this.b;
        if (eylwVar != null) {
            return new cukn(eylwVar);
        }
        return null;
    }

    private final erer c() {
        return this.c.compareTo(cula.a) > 0 ? erer.SPAM : erer.NO_VERDICT;
    }

    private final String d() {
        String str = this.a;
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cusu)) {
            return false;
        }
        cusu cusuVar = (cusu) obj;
        return this.d == cusuVar.d && ffkj.e(this.a, cusuVar.a) && ffkj.e(this.b, cusuVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.d;
        eylw eylwVar = this.b;
        return (((i * 31) + hashCode) * 31) + (eylwVar != null ? eylwVar.hashCode() : 0);
    }

    public final String toString() {
        return "LinkCheckResult(action=" + ((Object) fgto.c(this.d)) + ", initiatedBy=" + this.a + ", serverInfoParams=" + this.b + ")";
    }
}
