package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebvg extends ebwa {
    public final dwch a;
    public final eave b;
    public final eayo c;
    private final emxc d;

    public ebvg(dwch dwchVar, eave eaveVar, eayo eayoVar, emxc emxcVar) {
        this.a = dwchVar;
        this.b = eaveVar;
        this.c = eayoVar;
        this.d = emxcVar;
    }

    @Override // defpackage.ebwa
    public final dwch a() {
        return this.a;
    }

    @Override // defpackage.ebwa
    public final eave b() {
        return this.b;
    }

    @Override // defpackage.ebwa
    public final eayo c() {
        return this.c;
    }

    @Override // defpackage.ebwa
    public final emxc d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebwa) {
            ebwa ebwaVar = (ebwa) obj;
            if (this.a.equals(ebwaVar.a()) && this.b.equals(ebwaVar.b()) && this.c.equals(ebwaVar.c())) {
                ebwaVar.e();
                if (this.d.equals(ebwaVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "SimpleVeLogger{vePrimitives=" + this.a.toString() + ", accountConverter=" + this.b.toString() + ", accountsModel=" + this.c.toString() + ", incognitoModel=null, appIdentifier=Optional.absent()}";
    }

    @Override // defpackage.ebwa
    public final void e() {
    }
}
