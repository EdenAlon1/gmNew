package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzuc extends dzuf {
    private final dzre a;

    public dzuc(dzre dzreVar) {
        this.a = dzreVar;
    }

    @Override // defpackage.dzwf
    public final dzwh a() {
        return dzwh.RICH_CARD_BUTTONS;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwf) {
            dzwf dzwfVar = (dzwf) obj;
            if (dzwh.RICH_CARD_BUTTONS == dzwfVar.a() && this.a.equals(dzwfVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzuf, defpackage.dzwf
    public final dzre f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{richCardButtons=" + this.a.toString() + "}";
    }
}
