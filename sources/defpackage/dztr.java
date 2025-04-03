package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztr extends dztt {
    private final dzvv b;

    public dztr(dzvv dzvvVar) {
        this.b = dzvvVar;
    }

    @Override // defpackage.dzvt
    public final dzvs b() {
        return dzvs.STACK_CARD;
    }

    @Override // defpackage.dztt, defpackage.dzvt
    public final dzvv c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzvt) {
            dzvt dzvtVar = (dzvt) obj;
            if (dzvs.STACK_CARD == dzvtVar.b() && this.b.equals(dzvtVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RichCard{stackCard=" + this.b.toString() + "}";
    }
}
