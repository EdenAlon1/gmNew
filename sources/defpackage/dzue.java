package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzue extends dzuf {
    private final dzvz a;

    public dzue(dzvz dzvzVar) {
        this.a = dzvzVar;
    }

    @Override // defpackage.dzwf
    public final dzwh a() {
        return dzwh.STATUS_BADGE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwf) {
            dzwf dzwfVar = (dzwf) obj;
            if (dzwh.STATUS_BADGE == dzwfVar.a() && this.a.equals(dzwfVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzuf, defpackage.dzwf
    public final dzvz h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Element{statusBadge=" + this.a.toString() + "}";
    }
}
