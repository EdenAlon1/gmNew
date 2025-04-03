package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzua extends dzuf {
    private final dzvl a;

    public dzua(dzvl dzvlVar) {
        this.a = dzvlVar;
    }

    @Override // defpackage.dzwf
    public final dzwh a() {
        return dzwh.IMAGE_ELEMENT;
    }

    @Override // defpackage.dzuf, defpackage.dzwf
    public final dzvl d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwf) {
            dzwf dzwfVar = (dzwf) obj;
            if (dzwh.IMAGE_ELEMENT == dzwfVar.a() && this.a.equals(dzwfVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{imageElement=" + this.a.toString() + "}";
    }
}
