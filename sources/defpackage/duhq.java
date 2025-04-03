package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhq {
    public static final duie a = new duie();
    public final duie b;
    public final duii c;
    private final duhp d;

    public duhq(String str, duie duieVar) {
        this(str, duieVar, -1);
    }

    @Deprecated
    public final int a() {
        return ((Integer) ((emxn) this.d.a).a).intValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duhq) {
            duhq duhqVar = (duhq) obj;
            if (this.c.equals(duhqVar.c) && this.b.equals(duhqVar.b) && this.d.equals(duhqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return rkh.f(this.c, rkh.f(this.b, this.d.hashCode()));
    }

    public final String toString() {
        duhp duhpVar = this.d;
        duie duieVar = this.b;
        return "FifeModel{fifeUrl='" + this.c.toString() + "', fifeUrlOptions='" + String.valueOf(duieVar) + "', accountInfo='" + duhpVar.toString() + "'}";
    }

    public duhq(String str, duie duieVar, int i) {
        duii duiiVar = new duii(str);
        duhp duhpVar = new duhp(i);
        this.c = duiiVar;
        this.b = duieVar;
        this.d = duhpVar;
    }
}
