package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzju extends dzkb {
    private final dzpy a;

    public dzju(dzpy dzpyVar) {
        this.a = dzpyVar;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.DECORATION_TRANSITION_ACTION;
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final dzpy e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.DECORATION_TRANSITION_ACTION == dzjeVar.a() && this.a.equals(dzjeVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{decorationTransitionAction=" + this.a.toString() + "}";
    }
}
