package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzts extends dztt {
    private final dzvx b;

    public dzts(dzvx dzvxVar) {
        this.b = dzvxVar;
    }

    @Override // defpackage.dzvt
    public final dzvs b() {
        return dzvs.STANDALONE_CARD;
    }

    @Override // defpackage.dztt, defpackage.dzvt
    public final dzvx d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzvt) {
            dzvt dzvtVar = (dzvt) obj;
            if (dzvs.STANDALONE_CARD == dzvtVar.b() && this.b.equals(dzvtVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RichCard{standaloneCard=" + this.b.toString() + "}";
    }
}
