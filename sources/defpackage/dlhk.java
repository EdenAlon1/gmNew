package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhk extends dlaf {
    public final dkzx a;
    public final long b;
    public final dlab c;
    public final String d;

    public dlhk(dkzx dkzxVar, long j, dlab dlabVar, String str) {
        this.a = dkzxVar;
        this.b = j;
        this.c = dlabVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhk)) {
            return false;
        }
        dlhk dlhkVar = (dlhk) obj;
        return ffkj.e(this.a, dlhkVar.a) && ffpw.n(this.b, dlhkVar.b) && ffkj.e(this.c, dlhkVar.c) && ffkj.e(this.d, dlhkVar.d);
    }

    public final int hashCode() {
        dkzx dkzxVar = this.a;
        int hashCode = dkzxVar == null ? 0 : dkzxVar.hashCode();
        long j = this.b;
        long j2 = ffpw.a;
        int a = (((hashCode * 31) + ffpv.a(j)) * 31) + this.c.hashCode();
        String str = this.d;
        return (a * 31) + (str != null ? str.hashCode() : 0);
    }

    public dlhk(ffqi ffqiVar, dlab dlabVar) {
        this((dkzx) ffqiVar.a, ffqiVar.b, dlabVar, null);
    }
}
