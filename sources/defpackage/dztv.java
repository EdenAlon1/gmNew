package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztv extends dztw {
    private final dzwi a;

    public dztv(dzwi dzwiVar) {
        this.a = dzwiVar;
    }

    @Override // defpackage.dzwd
    public final dzwa a() {
        return dzwa.UI_ELEMENT;
    }

    @Override // defpackage.dztw, defpackage.dzwd
    public final dzwi c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwd) {
            dzwd dzwdVar = (dzwd) obj;
            if (dzwa.UI_ELEMENT == dzwdVar.a() && this.a.equals(dzwdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiComponent{uiElement=" + this.a.toString() + "}";
    }
}
