package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlj extends dzlv {
    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.BOLD;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzrr)) {
            return false;
        }
        dzrr dzrrVar = (dzrr) obj;
        if (dzrt.BOLD != dzrrVar.b()) {
            return false;
        }
        dzrrVar.c();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{bold=true}";
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final void c() {
    }
}
