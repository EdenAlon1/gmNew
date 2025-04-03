package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzud extends dzuf {
    private final dzrw a;

    public dzud(dzrw dzrwVar) {
        this.a = dzrwVar;
    }

    @Override // defpackage.dzwf
    public final dzwh a() {
        return dzwh.RICH_TEXT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwf) {
            dzwf dzwfVar = (dzwf) obj;
            if (dzwh.RICH_TEXT == dzwfVar.a() && this.a.equals(dzwfVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzuf, defpackage.dzwf
    public final dzrw g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{richText=" + this.a.toString() + "}";
    }
}
