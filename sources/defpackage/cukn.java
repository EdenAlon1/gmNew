package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukn {
    public final eylw a;

    public cukn(eylw eylwVar) {
        this.a = eylwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cukn) && ffkj.e(this.a, ((cukn) obj).a);
    }

    public final int hashCode() {
        eylw eylwVar = this.a;
        if (eylwVar == null) {
            return 0;
        }
        return eylwVar.hashCode();
    }

    public final String toString() {
        return "ReinforcementParams(serverInfoParams=" + this.a + ")";
    }

    public cukn() {
        this(null);
    }
}
