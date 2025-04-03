package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apza {
    public final apyv a;
    public final apxz b;

    public apza(apyv apyvVar, apxz apxzVar) {
        this.a = apyvVar;
        this.b = apxzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apza)) {
            return false;
        }
        apza apzaVar = (apza) obj;
        return ffkj.e(this.a, apzaVar.a) && ffkj.e(this.b, apzaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        apxz apxzVar = this.b;
        return hashCode + (apxzVar == null ? 0 : apxzVar.hashCode());
    }

    public final String toString() {
        return "ReactionWithMetadata(reaction=" + this.a + ", metadata=" + this.b + ")";
    }
}
