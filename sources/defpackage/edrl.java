package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrl extends edsn {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final edpd e;
    public final List f;
    public final dhqd g;

    public edrl(List list, List list2, List list3, List list4, edpd edpdVar, List list5, dhqd dhqdVar) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = edpdVar;
        this.f = list5;
        this.g = dhqdVar;
    }

    @Override // defpackage.edsn, defpackage.edkr
    public final dhqd a() {
        return this.g;
    }

    @Override // defpackage.edsn
    public final edpd b() {
        return this.e;
    }

    @Override // defpackage.edsn
    public final List c() {
        return this.d;
    }

    @Override // defpackage.edsn
    public final List d() {
        return this.b;
    }

    @Override // defpackage.edsn
    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        dhqd dhqdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edsn) {
            edsn edsnVar = (edsn) obj;
            edsnVar.j();
            List list = this.a;
            if (list != null ? list.equals(edsnVar.f()) : edsnVar.f() == null) {
                List list2 = this.b;
                if (list2 != null ? list2.equals(edsnVar.d()) : edsnVar.d() == null) {
                    List list3 = this.c;
                    if (list3 != null ? list3.equals(edsnVar.e()) : edsnVar.e() == null) {
                        List list4 = this.d;
                        if (list4 != null ? list4.equals(edsnVar.c()) : edsnVar.c() == null) {
                            edsnVar.h();
                            if (this.e.equals(edsnVar.b()) && this.f.equals(edsnVar.g()) && ((dhqdVar = this.g) != null ? dhqdVar.equals(edsnVar.a()) : edsnVar.a() == null)) {
                                edsnVar.i();
                                edsnVar.k();
                                edsnVar.l();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.edsn
    public final List f() {
        return this.a;
    }

    @Override // defpackage.edsn
    public final List g() {
        return this.f;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = list == null ? 0 : list.hashCode();
        List list2 = this.b;
        int hashCode2 = list2 == null ? 0 : list2.hashCode();
        int i = hashCode ^ (-721379959);
        List list3 = this.c;
        int hashCode3 = list3 == null ? 0 : list3.hashCode();
        int i2 = (i * 1000003) ^ hashCode2;
        List list4 = this.d;
        int hashCode4 = ((((((((i2 * 1000003) ^ hashCode3) * 1000003) ^ (list4 == null ? 0 : list4.hashCode())) * (-721379959)) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        dhqd dhqdVar = this.g;
        return ((hashCode4 ^ (dhqdVar != null ? dhqdVar.hashCode() : 0)) * 583896283) ^ 1237;
    }

    public final String toString() {
        dhqd dhqdVar = this.g;
        List list = this.f;
        edpd edpdVar = this.e;
        List list2 = this.d;
        List list3 = this.c;
        List list4 = this.b;
        return "SearchNearbyRequest{regionCode=null, includedTypes=" + String.valueOf(this.a) + ", excludedTypes=" + String.valueOf(list4) + ", includedPrimaryTypes=" + String.valueOf(list3) + ", excludedPrimaryTypes=" + String.valueOf(list2) + ", maxResultCount=null, locationRestriction=" + edpdVar.toString() + ", placeFields=" + list.toString() + ", cancellationToken=" + String.valueOf(dhqdVar) + ", rankPreference=null, routingParameters=null, routingSummariesIncluded=false}";
    }

    @Override // defpackage.edsn
    public final void h() {
    }

    @Override // defpackage.edsn
    public final void i() {
    }

    @Override // defpackage.edsn
    public final void j() {
    }

    @Override // defpackage.edsn
    public final void k() {
    }

    @Override // defpackage.edsn
    public final void l() {
    }
}
