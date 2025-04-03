package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzub extends dzuf {
    private final dzvn a;

    public dzub(dzvn dzvnVar) {
        this.a = dzvnVar;
    }

    @Override // defpackage.dzwf
    public final dzwh a() {
        return dzwh.MEDIA_ELEMENT;
    }

    @Override // defpackage.dzuf, defpackage.dzwf
    public final dzvn e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwf) {
            dzwf dzwfVar = (dzwf) obj;
            if (dzwh.MEDIA_ELEMENT == dzwfVar.a() && this.a.equals(dzwfVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{mediaElement=" + this.a.toString() + "}";
    }
}
