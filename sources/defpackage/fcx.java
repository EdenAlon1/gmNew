package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcx {
    public final jyi a;
    public final int b;
    public final long c;

    public fcx(jyi jyiVar, int i, long j) {
        this.a = jyiVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcx)) {
            return false;
        }
        fcx fcxVar = (fcx) obj;
        return this.a == fcxVar.a && this.b == fcxVar.b && this.c == fcxVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.c;
        return ((hashCode + this.b) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
