package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzka extends dzkb {
    private final String a;

    public dzka(String str) {
        this.a = str;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.WEB_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.WEB_ACTION == dzjeVar.a() && this.a.equals(dzjeVar.k())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final String k() {
        return this.a;
    }

    public final String toString() {
        return "ActionPayload{webAction=" + this.a + "}";
    }
}
