package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctut extends ctwp {
    public final int a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final int o;

    public ctut(int i, boolean z, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, String str7, String str8, String str9, int i5) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = i3;
        this.k = i4;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = i5;
    }

    @Override // defpackage.ctwp
    public final int a() {
        return this.j;
    }

    @Override // defpackage.ctwp
    public final int b() {
        return this.k;
    }

    @Override // defpackage.ctwp
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ctwp
    public final int d() {
        return this.o;
    }

    @Override // defpackage.ctwp
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctwp) {
            ctwp ctwpVar = (ctwp) obj;
            if (this.a == ctwpVar.e() && this.b == ctwpVar.o() && ((str = this.c) != null ? str.equals(ctwpVar.h()) : ctwpVar.h() == null) && this.d == ctwpVar.c() && this.e.equals(ctwpVar.g()) && this.f.equals(ctwpVar.k()) && this.g.equals(ctwpVar.f()) && this.h.equals(ctwpVar.l())) {
                ctwpVar.r();
                ctwpVar.p();
                if (this.i.equals(ctwpVar.j())) {
                    ctwpVar.q();
                    if (this.j == ctwpVar.a() && this.k == ctwpVar.b() && this.l.equals(ctwpVar.m()) && this.m.equals(ctwpVar.i()) && this.n.equals(ctwpVar.n()) && this.o == ctwpVar.d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ctwp
    public final String f() {
        return this.g;
    }

    @Override // defpackage.ctwp
    public final String g() {
        return this.e;
    }

    @Override // defpackage.ctwp
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.c;
        return (((((((((((((((((((((((((str == null ? 0 : str.hashCode()) ^ ((((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003)) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 583896283) ^ this.i.hashCode()) * (-721379959)) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o;
    }

    @Override // defpackage.ctwp
    public final String i() {
        return this.m;
    }

    @Override // defpackage.ctwp
    public final String j() {
        return this.i;
    }

    @Override // defpackage.ctwp
    public final String k() {
        return this.f;
    }

    @Override // defpackage.ctwp
    public final String l() {
        return this.h;
    }

    @Override // defpackage.ctwp
    public final String m() {
        return this.l;
    }

    @Override // defpackage.ctwp
    public final String n() {
        return this.n;
    }

    @Override // defpackage.ctwp
    public final boolean o() {
        return this.b;
    }

    public final String toString() {
        return "SubData{subId=" + this.a + ", isAvailable=" + this.b + ", iccId=" + this.c + ", simSlotIndex=" + this.d + ", displayName=" + this.e + ", preferredName=" + this.f + ", carrierName=" + this.g + ", simCarrierName=" + this.h + ", simCarrierId=0, iconTint=0, phoneNumber=" + this.i + ", roaming=0, mcc=" + this.j + ", mnc=" + this.k + ", simCountryIso=" + this.l + ", networkCountryIso=" + this.m + ", subscriptionId=" + this.n + ", simState=" + this.o + "}";
    }

    @Override // defpackage.ctwp
    public final void p() {
    }

    @Override // defpackage.ctwp
    public final void q() {
    }

    @Override // defpackage.ctwp
    public final void r() {
    }
}
