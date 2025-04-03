package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyup {
    public final engw a;
    public final ffji b;

    public cyup(engw engwVar, ffji ffjiVar) {
        this.a = engwVar;
        this.b = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyup)) {
            return false;
        }
        cyup cyupVar = (cyup) obj;
        return ffkj.e(this.a, cyupVar.a) && ffkj.e(this.b, cyupVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActionsUiData(actions=" + this.a + ", onClick=" + this.b + ")";
    }
}
