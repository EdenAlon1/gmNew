package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfjq {
    public final ppq a;
    public final ffss b;
    public final int c;

    public cfjq(int i, ppq ppqVar, ffss ffssVar) {
        this.c = i;
        this.a = ppqVar;
        this.b = ffssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfjq)) {
            return false;
        }
        cfjq cfjqVar = (cfjq) obj;
        return this.c == cfjqVar.c && ffkj.e(this.a, cfjqVar.a) && ffkj.e(this.b, cfjqVar.b);
    }

    public final int hashCode() {
        int hashCode = (this.c * 31) + this.a.hashCode();
        ffss ffssVar = this.b;
        return (hashCode * 31) + (ffssVar == null ? 0 : ffssVar.hashCode());
    }

    public final String toString() {
        return "RunResult(finalStatus=" + ((Object) cfiu.a(this.c)) + ", workerResult=" + this.a + ", followUpWork=" + this.b + ")";
    }

    public cfjq(int i, ppq ppqVar) {
        this(i, ppqVar, null);
    }
}
