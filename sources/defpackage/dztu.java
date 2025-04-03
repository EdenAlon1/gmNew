package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztu extends dztw {
    private final dzwc a;

    public dztu(dzwc dzwcVar) {
        this.a = dzwcVar;
    }

    @Override // defpackage.dzwd
    public final dzwa a() {
        return dzwa.STACK_COMPONENT;
    }

    @Override // defpackage.dztw, defpackage.dzwd
    public final dzwc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzwd) {
            dzwd dzwdVar = (dzwd) obj;
            if (dzwa.STACK_COMPONENT == dzwdVar.a() && this.a.equals(dzwdVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiComponent{stackComponent=" + this.a.toString() + "}";
    }
}
