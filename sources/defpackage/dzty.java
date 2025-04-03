package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzty extends dzuf {
    private final dzvh a;

    public dzty(dzvh dzvhVar) {
        this.a = dzvhVar;
    }

    @Override // defpackage.dzwf
    public final dzwh a() {
        return dzwh.HORIZONTAL_LAYOUT_BUTTONS;
    }

    @Override // defpackage.dzuf, defpackage.dzwf
    public final dzvh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwf) {
            dzwf dzwfVar = (dzwf) obj;
            if (dzwh.HORIZONTAL_LAYOUT_BUTTONS == dzwfVar.a() && this.a.equals(dzwfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{horizontalLayoutButtons=" + this.a.toString() + "}";
    }
}
