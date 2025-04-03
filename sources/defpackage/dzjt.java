package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjt extends dzkb {
    private final String a;

    public dzjt(String str) {
        this.a = str;
    }

    @Override // defpackage.dzje
    public final dzjf a() {
        return dzjf.CUSTOM_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzje) {
            dzje dzjeVar = (dzje) obj;
            if (dzjf.CUSTOM_ACTION == dzjeVar.a() && this.a.equals(dzjeVar.i())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dzkb, defpackage.dzje
    public final String i() {
        return this.a;
    }

    public final String toString() {
        return "ActionPayload{customAction=" + this.a + "}";
    }
}
