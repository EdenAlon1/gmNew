package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlb extends dzld {
    private final dzqo a;

    public dzlb(dzqo dzqoVar) {
        this.a = dzqoVar;
    }

    @Override // defpackage.dzqp
    public final dzqr a() {
        return dzqr.OVERLAY;
    }

    @Override // defpackage.dzld, defpackage.dzqp
    public final dzqo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzqp) {
            dzqp dzqpVar = (dzqp) obj;
            if (dzqr.OVERLAY == dzqpVar.a() && this.a.equals(dzqpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingDetails{overlay=" + this.a.toString() + "}";
    }
}
