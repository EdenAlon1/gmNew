package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzc extends dyzd {
    private final dyyv a;

    public dyzc(dyyv dyyvVar) {
        this.a = dyyvVar;
    }

    @Override // defpackage.dzay
    public final int b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzay) {
            dzay dzayVar = (dzay) obj;
            if (dzayVar.b() == 4 && this.a.equals(dzayVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dyzd, defpackage.dzay
    public final dyyv f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{kickGroupUsers=" + this.a.toString() + "}";
    }
}
