package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxui {
    public final bxuj a;
    public final bxuj b;
    public final bxuj c;
    public final bxuj d;
    public final bxuj e;
    public final bxuj f;
    public final bxuj g;
    final bxuj[] h;

    public bxui() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "self_profiles._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxtt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxve.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxue
        };
        bxuj bxujVar = new bxuj(m.a());
        this.a = bxujVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bxuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar2.a = "self_profiles.my_identity_token";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxug
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxve.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxuh
        };
        bxuj bxujVar2 = new bxuj(m2.a());
        this.b = bxujVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "self_profiles.limited_profile_display_name";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxtu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxve.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxtv
        };
        bxuj bxujVar3 = new bxuj(m3.a());
        this.c = bxujVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "self_profiles.photo_uri";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxtw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxve.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxtx
        };
        bxuj bxujVar4 = new bxuj(m4.a());
        this.d = bxujVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "self_profiles.is_self_profile_shareable";
        m5.i(60400);
        dtqsVar5.d = new Supplier() { // from class: bxty
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxve.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxtz
        };
        bxuj bxujVar5 = new bxuj(m5.a());
        this.e = bxujVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        dtqsVar6.a = "self_profiles.belongs_to_self_gaia";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bxua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxve.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bxub
        };
        bxuj bxujVar6 = new bxuj(m6.a());
        this.f = bxujVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        dtqsVar7.a = "self_profiles.update_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bxuc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxve.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bxud
        };
        bxuj bxujVar7 = new bxuj(m7.a());
        this.g = bxujVar7;
        this.h = new bxuj[]{bxujVar, bxujVar2, bxujVar3, bxujVar4, bxujVar5, bxujVar6, bxujVar7};
    }
}
