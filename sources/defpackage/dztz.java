package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dztz extends dzuf {
    private final dzvj a;

    public dztz(dzvj dzvjVar) {
        this.a = dzvjVar;
    }

    @Override // defpackage.dzwf
    public final dzwh a() {
        return dzwh.HORIZONTAL_LINE;
    }

    @Override // defpackage.dzuf, defpackage.dzwf
    public final dzvj c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwf) {
            dzwf dzwfVar = (dzwf) obj;
            if (dzwh.HORIZONTAL_LINE == dzwfVar.a() && this.a.equals(dzwfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{horizontalLine=" + this.a.toString() + "}";
    }
}
