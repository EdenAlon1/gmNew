package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dflv {
    final eyhs a;

    public dflv() {
        this.a = null;
    }

    public static dflv a(eyhs eyhsVar) {
        return (eyhsVar == null || eyhsVar == eyex.a) ? dfmc.a : new dflv(eyhsVar);
    }

    public final boolean equals(Object obj) {
        eyhs eyhsVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof dflv) && (eyhsVar = this.a) != null && eyhsVar.equals(((dflv) obj).a);
    }

    public final int hashCode() {
        dfwv.i(!dfmc.b.equals(this));
        if (dfmc.a.equals(this)) {
            return 0;
        }
        eyhs eyhsVar = this.a;
        dfwv.n(eyhsVar);
        return eyhsVar.hashCode();
    }

    public final String toString() {
        if (dfmc.b.equals(this)) {
            return "$use_sticky_dims$";
        }
        if (dfmc.a.equals(this)) {
            return "$no_dims$";
        }
        eyhs eyhsVar = this.a;
        dfwv.n(eyhsVar);
        return eyhsVar.toString();
    }

    private dflv(eyhs eyhsVar) {
        this.a = eyhsVar;
    }
}
