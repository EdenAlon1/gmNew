package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zek {
    public final eylg a;

    public zek(eylg eylgVar) {
        this.a = eylgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zek) && ffkj.e(this.a, ((zek) obj).a);
    }

    public final int hashCode() {
        eylg eylgVar = this.a;
        if (eylgVar == null) {
            return 0;
        }
        return eylgVar.hashCode();
    }

    public final String toString() {
        return "EffectUiData(effect=" + this.a + ")";
    }
}
