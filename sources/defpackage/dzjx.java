package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjx extends dzkb {
    private final dzjm a;

    public dzjx(dzjm dzjmVar) {
        this.a = dzjmVar;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.SEND_MESSAGE;
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final dzjm d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.SEND_MESSAGE == dzjeVar.a() && this.a.equals(dzjeVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{sendMessage=" + this.a.toString() + "}";
    }
}
