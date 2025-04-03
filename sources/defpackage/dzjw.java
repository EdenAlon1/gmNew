package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjw extends dzkb {
    private final dzjm a;

    public dzjw(dzjm dzjmVar) {
        this.a = dzjmVar;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.PREFILL_MESSAGE;
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final dzjm c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.PREFILL_MESSAGE == dzjeVar.a() && this.a.equals(dzjeVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{prefillMessage=" + this.a.toString() + "}";
    }
}
