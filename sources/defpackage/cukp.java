package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukp {
    public final erer a;
    public final cula b;
    public final String c;
    public final Integer d;
    public final cukn e;

    public cukp(erer ererVar, cula culaVar, String str, Integer num, cukn cuknVar) {
        ererVar.getClass();
        culaVar.getClass();
        this.a = ererVar;
        this.b = culaVar;
        this.c = str;
        this.d = num;
        this.e = cuknVar;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cukp)) {
            return false;
        }
        cukp cukpVar = (cukp) obj;
        return this.a == cukpVar.a && ffkj.e(this.b, cukpVar.b) && ffkj.e(this.c, cukpVar.c) && ffkj.e(this.d, cukpVar.d) && ffkj.e(this.e, cukpVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        cukn cuknVar = this.e;
        return hashCode3 + (cuknVar != null ? cuknVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpamClassificationResult(outcome=" + this.a + ", score=" + this.b + ", aresInitiatedBy=" + this.c + ", reclassificationDelaySeconds=" + this.d + ", reinforcementParams=" + this.e + ")";
    }

    public /* synthetic */ cukp(erer ererVar, cula culaVar, String str, Integer num, cukn cuknVar, int i) {
        this(ererVar, culaVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : cuknVar);
    }
}
