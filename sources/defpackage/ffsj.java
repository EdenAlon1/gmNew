package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsj extends ffgo {
    public static final ffsi a = new ffsi();
    public final String b;

    public ffsj(String str) {
        super(a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffsj) && ffkj.e(this.b, ((ffsj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.b + ")";
    }
}
