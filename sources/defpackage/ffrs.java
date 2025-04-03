package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrs {
    public final Object a;
    public final ffrd b;
    public final ffjn c;
    public final Object d;
    public final Throwable e;

    public ffrs(Object obj, ffrd ffrdVar, ffjn ffjnVar, Throwable th) {
        this.a = obj;
        this.b = ffrdVar;
        this.c = ffjnVar;
        this.d = null;
        this.e = th;
    }

    public static /* synthetic */ ffrs b(ffrs ffrsVar, ffrd ffrdVar, Throwable th, int i) {
        Object obj = (i & 1) != 0 ? ffrsVar.a : null;
        if ((i & 2) != 0) {
            ffrdVar = ffrsVar.b;
        }
        ffjn ffjnVar = (i & 4) != 0 ? ffrsVar.c : null;
        if ((i & 8) != 0) {
            Object obj2 = ffrsVar.d;
        }
        if ((i & 16) != 0) {
            th = ffrsVar.e;
        }
        return new ffrs(obj, ffrdVar, ffjnVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffrs)) {
            return false;
        }
        ffrs ffrsVar = (ffrs) obj;
        if (!ffkj.e(this.a, ffrsVar.a) || !ffkj.e(this.b, ffrsVar.b) || !ffkj.e(this.c, ffrsVar.c)) {
            return false;
        }
        Object obj2 = ffrsVar.d;
        return ffkj.e(null, null) && ffkj.e(this.e, ffrsVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        ffrd ffrdVar = this.b;
        int hashCode2 = ffrdVar == null ? 0 : ffrdVar.hashCode();
        int i = hashCode * 31;
        ffjn ffjnVar = this.c;
        int hashCode3 = ffjnVar == null ? 0 : ffjnVar.hashCode();
        int i2 = (i + hashCode2) * 31;
        Throwable th = this.e;
        return ((i2 + hashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }

    public /* synthetic */ ffrs(Object obj, ffrd ffrdVar, ffjn ffjnVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : ffrdVar, (i & 4) != 0 ? null : ffjnVar, (i & 16) != 0 ? null : th);
    }
}
