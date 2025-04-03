package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzb extends dyzd {
    private final dzap a;

    public dyzb(dzap dzapVar) {
        this.a = dzapVar;
    }

    @Override // defpackage.dzay
    public final int b() {
        return 5;
    }

    @Override // defpackage.dyzd, defpackage.dzay
    public final dzap e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzay) {
            dzay dzayVar = (dzay) obj;
            if (dzayVar.b() == 5 && this.a.equals(dzayVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{createGroup=" + this.a.toString() + "}";
    }
}
