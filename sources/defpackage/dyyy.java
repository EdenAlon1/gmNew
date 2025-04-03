package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyyy extends dyzd {
    private final dyyv a;

    public dyyy(dyyv dyyvVar) {
        this.a = dyyvVar;
    }

    @Override // defpackage.dyzd, defpackage.dzay
    public final dyyv a() {
        return this.a;
    }

    @Override // defpackage.dzay
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzay) {
            dzay dzayVar = (dzay) obj;
            if (dzayVar.b() == 3 && this.a.equals(dzayVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{addGroupUsers=" + this.a.toString() + "}";
    }
}
