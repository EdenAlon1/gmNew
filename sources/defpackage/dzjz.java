package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjz extends dzkb {
    private final dzsg a;

    public dzjz(dzsg dzsgVar) {
        this.a = dzsgVar;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.URL_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.URL_ACTION == dzjeVar.a() && this.a.equals(dzjeVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final dzsg g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{urlAction=" + this.a.toString() + "}";
    }
}
