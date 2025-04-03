package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuux {
    public final cukx a;
    public final cula b;
    public final erer c;
    public final String d;
    private final long e;
    private final erdy f;
    private final int g;
    private final eres h;
    private final fbcx i;
    private final cukz j;
    private final cuuy k;
    private final cuvb l;
    private final cuva m;

    public cuux(cuuy cuuyVar, cuvb cuvbVar, cuva cuvaVar, cukx cukxVar, cula culaVar, long j, erdy erdyVar, int i, erer ererVar, String str, eres eresVar, fbcx fbcxVar, cukz cukzVar) {
        cukxVar.getClass();
        this.k = cuuyVar;
        this.l = cuvbVar;
        this.m = cuvaVar;
        this.a = cukxVar;
        this.b = culaVar;
        this.e = j;
        this.f = erdyVar;
        this.g = i;
        this.c = ererVar;
        this.d = str;
        this.h = eresVar;
        this.i = fbcxVar;
        this.j = cukzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuux)) {
            return false;
        }
        cuux cuuxVar = (cuux) obj;
        return ffkj.e(this.k, cuuxVar.k) && ffkj.e(this.l, cuuxVar.l) && ffkj.e(this.m, cuuxVar.m) && this.a == cuuxVar.a && ffkj.e(this.b, cuuxVar.b) && this.e == cuuxVar.e && this.f == cuuxVar.f && this.g == cuuxVar.g && this.c == cuuxVar.c && ffkj.e(this.d, cuuxVar.d) && this.h == cuuxVar.h && this.i == cuuxVar.i && ffkj.e(this.j, cuuxVar.j);
    }

    public final int hashCode() {
        int hashCode = (((((((this.k.hashCode() * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        long j = this.e;
        return (((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "Classification(classificationId=" + this.k + ", messageId=" + this.l + ", conversationId=" + this.m + ", source=" + this.a + ", score=" + this.b + ", classificationTimestamp=" + this.e + ", trigger=" + this.f + ", reclassificationIndex=" + this.g + ", outcome=" + this.c + ", aresInitiatedBy=" + this.d + ", errorCode=" + this.h + ", action=" + this.i + ", actionContributors=" + this.j + ")";
    }
}
