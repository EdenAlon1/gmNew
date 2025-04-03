package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqy extends edry {
    public final List a;
    private final List b;
    private final dhqd c;

    public edqy(List list, List list2, dhqd dhqdVar) {
        this.b = list;
        this.a = list2;
        this.c = dhqdVar;
    }

    @Override // defpackage.edry, defpackage.edkr
    public final dhqd a() {
        return this.c;
    }

    @Override // defpackage.edry
    public final List b() {
        return this.b;
    }

    @Override // defpackage.edry
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edry) {
            edry edryVar = (edry) obj;
            edryVar.h();
            edryVar.e();
            edryVar.f();
            edryVar.g();
            if (this.b.equals(edryVar.b())) {
                edryVar.j();
                edryVar.k();
                if (this.a.equals(edryVar.c())) {
                    edryVar.d();
                    edryVar.i();
                    dhqd dhqdVar = this.c;
                    if (dhqdVar != null ? dhqdVar.equals(edryVar.a()) : edryVar.a() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.b.hashCode() ^ (-429739981)) * 583896283) ^ this.a.hashCode();
        dhqd dhqdVar = this.c;
        return (hashCode * 583896283) ^ (dhqdVar == null ? 0 : dhqdVar.hashCode());
    }

    public final String toString() {
        dhqd dhqdVar = this.c;
        List list = this.a;
        return "FindAutocompletePredictionsRequest{query=null, locationBias=null, locationRestriction=null, origin=null, countries=" + this.b.toString() + ", sessionToken=null, typeFilter=null, typesFilter=" + list.toString() + ", inputOffset=null, regionCode=null, cancellationToken=" + String.valueOf(dhqdVar) + "}";
    }

    @Override // defpackage.edry
    public final void d() {
    }

    @Override // defpackage.edry
    public final void e() {
    }

    @Override // defpackage.edry
    public final void f() {
    }

    @Override // defpackage.edry
    public final void g() {
    }

    @Override // defpackage.edry
    public final void h() {
    }

    @Override // defpackage.edry
    public final void i() {
    }

    @Override // defpackage.edry
    public final void j() {
    }

    @Override // defpackage.edry
    @Deprecated
    public final void k() {
    }
}
