package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eneo extends enes {
    public static final eneo a = new eneo();
    private static final long serialVersionUID = 0;

    private eneo() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.enes
    /* renamed from: a */
    public final int compareTo(enes enesVar) {
        return enesVar == this ? 0 : 1;
    }

    @Override // defpackage.enes
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.enes
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.enes, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((enes) obj);
    }

    @Override // defpackage.enes
    public final void d(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.enes
    public final boolean e(Comparable comparable) {
        return false;
    }

    @Override // defpackage.enes
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
