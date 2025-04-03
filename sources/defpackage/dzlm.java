package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlm extends dzlv {
    private final dzrl a;

    public dzlm(dzrl dzrlVar) {
        this.a = dzrlVar;
    }

    @Override // defpackage.dzrr
    public final dzrt b() {
        return dzrt.HYPER_LINK;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzrr) {
            dzrr dzrrVar = (dzrr) obj;
            if (dzrt.HYPER_LINK == dzrrVar.b() && this.a.equals(dzrrVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzlv, defpackage.dzrr
    public final dzrl f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextStyle{hyperLink=" + this.a.toString() + "}";
    }
}
