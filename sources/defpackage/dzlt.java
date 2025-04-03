package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlt extends dzlv {
    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.UNDERLINE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzrr)) {
            return false;
        }
        dzrr dzrrVar = (dzrr) obj;
        if (dzrt.UNDERLINE != dzrrVar.b()) {
            return false;
        }
        dzrrVar.m();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{underline=true}";
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final void m() {
    }
}
