package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjr extends dzkb {
    private final String a;

    public dzjr(String str) {
        this.a = str;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.CALL_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.CALL_ACTION == dzjeVar.a() && this.a.equals(dzjeVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{callAction=" + this.a + "}";
    }
}
