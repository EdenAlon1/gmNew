package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrh extends edsj {
    public final dhqd a;
    public final List b;
    public final List c;
    public final String d;

    public edrh(dhqd dhqdVar, List list, List list2, String str) {
        this.a = dhqdVar;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // defpackage.edkr
    public final dhqd a() {
        return this.a;
    }

    @Override // defpackage.edsj
    public final String b() {
        return this.d;
    }

    @Override // defpackage.edsj
    public final List c() {
        return this.b;
    }

    @Override // defpackage.edsj
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edsj) {
            edsj edsjVar = (edsj) obj;
            dhqd dhqdVar = this.a;
            if (dhqdVar != null ? dhqdVar.equals(edsjVar.a()) : edsjVar.a() == null) {
                edsjVar.f();
                edsjVar.g();
                edsjVar.h();
                edsjVar.i();
                edsjVar.j();
                edsjVar.o();
                if (this.b.equals(edsjVar.c()) && this.c.equals(edsjVar.d())) {
                    edsjVar.k();
                    edsjVar.l();
                    edsjVar.q();
                    if (this.d.equals(edsjVar.b())) {
                        edsjVar.e();
                        edsjVar.m();
                        edsjVar.n();
                        edsjVar.p();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dhqd dhqdVar = this.a;
        return (((((((((((((dhqdVar == null ? 0 : dhqdVar.hashCode()) ^ 1000003) * 272515929) ^ 1237) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 583896283) ^ 1237) * 1000003) ^ this.d.hashCode()) * 1525764945) ^ 1237;
    }

    public final String toString() {
        List list = this.c;
        List list2 = this.b;
        return "SearchByTextRequest{cancellationToken=" + String.valueOf(this.a) + ", includedType=null, locationBias=null, locationRestriction=null, maxResultCount=null, minRating=null, openNow=false, placeFields=" + list2.toString() + ", priceLevels=" + list.toString() + ", rankPreference=null, regionCode=null, strictTypeFiltering=false, textQuery=" + this.d + ", evSearchOptions=null, routingParameters=null, searchAlongRouteParameters=null, routingSummariesIncluded=false}";
    }

    @Override // defpackage.edsj
    public final void e() {
    }

    @Override // defpackage.edsj
    public final void f() {
    }

    @Override // defpackage.edsj
    public final void g() {
    }

    @Override // defpackage.edsj
    public final void h() {
    }

    @Override // defpackage.edsj
    public final void i() {
    }

    @Override // defpackage.edsj
    public final void j() {
    }

    @Override // defpackage.edsj
    public final void k() {
    }

    @Override // defpackage.edsj
    public final void l() {
    }

    @Override // defpackage.edsj
    public final void m() {
    }

    @Override // defpackage.edsj
    public final void n() {
    }

    @Override // defpackage.edsj
    public final void o() {
    }

    @Override // defpackage.edsj
    public final void p() {
    }

    @Override // defpackage.edsj
    public final void q() {
    }
}
