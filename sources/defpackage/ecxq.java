package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecxq {
    public static final ecxq a = new ecxq(enpe.c);
    public final enjc b;

    public ecxq(enjc enjcVar) {
        this.b = enjcVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ecxq) {
            return this.b.equals(((ecxq) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return enpw.a(this.b);
    }
}
