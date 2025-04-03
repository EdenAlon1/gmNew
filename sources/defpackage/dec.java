package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dec {
    private final Context a;
    private final jzn b;
    private final long c;
    private final ebe d;

    public dec(Context context, jzn jznVar, long j, ebe ebeVar) {
        this.a = context;
        this.b = jznVar;
        this.c = j;
        this.d = ebeVar;
    }

    public final dik a() {
        return new deb(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ffkj.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dec decVar = (dec) obj;
        if (!ffkj.e(this.a, decVar.a) || !ffkj.e(this.b, decVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = decVar.c;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffkj.e(this.d, decVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = ibw.a;
        return (((hashCode * 31) + ffco.a(this.c)) * 31) + this.d.hashCode();
    }
}
