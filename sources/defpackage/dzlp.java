package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlp extends dzlv {
    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.STRIKETHROUGH;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzrr)) {
            return false;
        }
        dzrr dzrrVar = (dzrr) obj;
        if (dzrt.STRIKETHROUGH != dzrrVar.b()) {
            return false;
        }
        dzrrVar.i();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{strikethrough=true}";
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final void i() {
    }
}
