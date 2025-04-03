package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmiw {
    public final boolean a;
    public final djrm b;
    public final int c;
    public final String d;
    public final String e;
    public final eqwf f;
    public final int g;
    public final int h;
    public final eyja i;
    public final Optional j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final int s;
    private final boolean t;

    public cmiw(boolean z, djrm djrmVar, int i, String str, String str2, eqwf eqwfVar, int i2, int i3, eyja eyjaVar, Optional optional, boolean z2, boolean z3, int i4, String str3, boolean z4, boolean z5, String str4, boolean z6, boolean z7, boolean z8) {
        djrmVar.getClass();
        eyjaVar.getClass();
        if (i4 == 0) {
            throw null;
        }
        str3.getClass();
        str4.getClass();
        this.a = z;
        this.b = djrmVar;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = eqwfVar;
        this.g = i2;
        this.h = i3;
        this.i = eyjaVar;
        this.j = optional;
        this.k = z2;
        this.t = z3;
        this.s = i4;
        this.l = str3;
        this.m = z4;
        this.n = z5;
        this.o = str4;
        this.p = z6;
        this.q = z7;
        this.r = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmiw)) {
            return false;
        }
        cmiw cmiwVar = (cmiw) obj;
        return this.a == cmiwVar.a && ffkj.e(this.b, cmiwVar.b) && this.c == cmiwVar.c && ffkj.e(this.d, cmiwVar.d) && ffkj.e(this.e, cmiwVar.e) && this.f == cmiwVar.f && this.g == cmiwVar.g && this.h == cmiwVar.h && ffkj.e(this.i, cmiwVar.i) && ffkj.e(this.j, cmiwVar.j) && this.k == cmiwVar.k && this.t == cmiwVar.t && this.s == cmiwVar.s && ffkj.e(this.l, cmiwVar.l) && this.m == cmiwVar.m && this.n == cmiwVar.n && ffkj.e(this.o, cmiwVar.o) && this.p == cmiwVar.p && this.q == cmiwVar.q && this.r == cmiwVar.r;
    }

    public final int hashCode() {
        int a = (((((((((((((((((cmiv.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
        String str = this.l;
        int a2 = (((((((a * 31) + cmiv.a(this.k)) * 31) + cmiv.a(this.t)) * 31) + this.s) * 31) + str.hashCode();
        String str2 = this.o;
        int a3 = (((((a2 * 31) + cmiv.a(this.m)) * 31) + cmiv.a(this.n)) * 31) + str2.hashCode();
        boolean z = this.r;
        return (((((a3 * 31) + cmiv.a(this.p)) * 31) + cmiv.a(this.q)) * 31) + cmiv.a(z);
    }

    public final String toString() {
        return "RcsSettingsSimInfo(rcsEnabled=" + this.a + ", rcsProvisioningId=" + this.b + ", simSlot=" + this.c + ", carrierName=" + this.d + ", rcsMsisdn=" + this.e + ", rcsAvailability=" + this.f + ", subId=" + this.g + ", retryCount=" + this.h + ", lastRetryTimestamp=" + this.i + ", phoneNumberRecord=" + this.j + ", allowManualPhoneNumberInput=" + this.k + ", isDefaultCall=" + this.t + ", rcsTosType=" + ((Object) Integer.toString(ewhu.a(this.s))) + ", tosLinkUrl=" + this.l + ", legalFyiFlowEnabled=" + this.m + ", showEnabledByCarrierInSettings=" + this.n + ", tosPrivacyPolicyUrl=" + this.o + ", roamingEnabled=" + this.p + ", cellularConnectivity=" + this.q + ", shouldShowFiMultiSyncHelpArticle=" + this.r + ")";
    }
}
