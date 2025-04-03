package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlq extends dzlv {
    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.SUBSCRIPT;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzrr)) {
            return false;
        }
        dzrr dzrrVar = (dzrr) obj;
        if (dzrt.SUBSCRIPT != dzrrVar.b()) {
            return false;
        }
        dzrrVar.j();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{subscript=true}";
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final void j() {
    }
}
