package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyph {
    public final dndt a;
    public final String b;

    public cyph(dndt dndtVar, String str) {
        this.a = dndtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyph)) {
            return false;
        }
        cyph cyphVar = (cyph) obj;
        return ffkj.e(this.a, cyphVar.a) && ffkj.e(this.b, cyphVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ActiveSimUiData(activeSim=" + this.a + ", lineTitle=" + this.b + ")";
    }
}
