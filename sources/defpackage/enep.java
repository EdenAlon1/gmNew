package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enep extends enes {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enep(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // defpackage.enes
    public final void c(StringBuilder sb) {
        sb.append('(');
        sb.append(this.b);
    }

    @Override // defpackage.enes
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(']');
    }

    @Override // defpackage.enes
    public final boolean e(Comparable comparable) {
        return enop.b(this.b, comparable) < 0;
    }

    @Override // defpackage.enes
    public final int hashCode() {
        return ~this.b.hashCode();
    }

    public final String toString() {
        return "/" + this.b.toString() + "\\";
    }
}
