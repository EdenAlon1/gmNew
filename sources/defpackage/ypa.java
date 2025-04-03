package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypa {
    public final dsho a;
    public final dmnh b;

    public ypa(dsho dshoVar, dmnh dmnhVar) {
        this.a = dshoVar;
        this.b = dmnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypa)) {
            return false;
        }
        ypa ypaVar = (ypa) obj;
        return ffkj.e(this.a, ypaVar.a) && ffkj.e(this.b, ypaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmnh dmnhVar = this.b;
        return hashCode + (dmnhVar == null ? 0 : dmnhVar.hashCode());
    }

    public final String toString() {
        return "InputsData(hugoUiData=" + this.a + ", inputsUiData=" + this.b + ")";
    }
}
