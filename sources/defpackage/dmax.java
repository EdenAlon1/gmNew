package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmax implements dmba {
    public final String a;
    public final dmci b;
    private final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public dmax() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmax)) {
            return false;
        }
        dmax dmaxVar = (dmax) obj;
        int i = dmaxVar.c;
        return ffkj.e(this.a, dmaxVar.a) && ffkj.e(this.b, dmaxVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ScheduledSend(count=0, contentDescription=" + this.a + ", style=" + this.b + ")";
    }

    public /* synthetic */ dmax(String str, dmci dmciVar, int i) {
        dmciVar = (i & 4) != 0 ? new dmci(null) : dmciVar;
        str = (i & 2) != 0 ? null : str;
        dmciVar.getClass();
        this.c = 0;
        this.a = str;
        this.b = dmciVar;
    }
}
