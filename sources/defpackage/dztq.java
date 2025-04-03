package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztq extends dztt {
    private final dzvd b;

    public dztq(dzvd dzvdVar) {
        this.b = dzvdVar;
    }

    @Override // defpackage.dztt, defpackage.dzvt
    public final dzvd a() {
        return this.b;
    }

    @Override // defpackage.dzvt
    public final dzvs b() {
        return dzvs.CARD_CAROUSEL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzvt) {
            dzvt dzvtVar = (dzvt) obj;
            if (dzvs.CARD_CAROUSEL == dzvtVar.b() && this.b.equals(dzvtVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RichCard{cardCarousel=" + this.b.toString() + "}";
    }
}
