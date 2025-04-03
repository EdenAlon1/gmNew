package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byvd {
    public final byve a;
    public final byve b;
    public final byve c;
    public final byve d;
    public final byve e;
    public final byve f;
    public final byve g;
    final byve[] h;

    public byvd() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "verified_sms_brands._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: byup
            @Override // java.util.function.Supplier
            public final Object get() {
                return byvy.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: byuy
        };
        byve byveVar = new byve(m.a());
        this.a = byveVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "verified_sms_brands.brand_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: byuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return byvy.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: byva
        };
        byve byveVar2 = new byve(m2.a());
        this.b = byveVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        dtqsVar3.a = "verified_sms_brands.name";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: byvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return byvy.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: byvc
        };
        byve byveVar3 = new byve(m3.a());
        this.c = byveVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.k(true);
        dtqsVar4.a = "verified_sms_brands.description";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: byuq
            @Override // java.util.function.Supplier
            public final Object get() {
                return byvy.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: byur
        };
        byve byveVar4 = new byve(m4.a());
        this.d = byveVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        m5.k(true);
        dtqsVar5.a = "verified_sms_brands.logo_url";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: byus
            @Override // java.util.function.Supplier
            public final Object get() {
                return byvy.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: byut
        };
        byve byveVar5 = new byve(m5.a());
        this.e = byveVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "verified_sms_brands.logo_uri";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: byuu
            @Override // java.util.function.Supplier
            public final Object get() {
                return byvy.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: byuv
        };
        byve byveVar6 = new byve(m6.a());
        this.f = byveVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        m7.k(true);
        dtqsVar7.a = "verified_sms_brands.version_token";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: byuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return byvy.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: byux
        };
        byve byveVar7 = new byve(m7.a());
        this.g = byveVar7;
        this.h = new byve[]{byveVar, byveVar2, byveVar3, byveVar4, byveVar5, byveVar6, byveVar7};
    }
}
