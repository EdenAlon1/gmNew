package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtt {
    public static final qts a = new qtr();
    public final Object b;
    public final qts c;
    public final String d;
    public volatile byte[] e;

    public qtt(String str, Object obj, qts qtsVar) {
        rkf.c(str);
        this.d = str;
        this.b = obj;
        rkf.f(qtsVar);
        this.c = qtsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qtt) {
            return this.d.equals(((qtt) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
