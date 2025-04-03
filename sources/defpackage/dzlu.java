package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlu extends dzlv {
    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzrr)) {
            return false;
        }
        dzrr dzrrVar = (dzrr) obj;
        if (dzrt.UNKNOWN != dzrrVar.b()) {
            return false;
        }
        dzrrVar.n();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{unknown=true}";
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final void n() {
    }
}
