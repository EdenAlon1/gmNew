package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfq {
    public final bxfr a;
    public final bxfr b;
    public final bxfr c;
    public final bxfr d;
    public final bxfr e;
    public final bxfr f;
    public final bxfr g;
    public final bxfr h;
    public final bxfr i;
    final bxfr[] j;

    public bxfq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "remote_registrations_table.tachyon_registration_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxfp
        };
        bxfr bxfrVar = new bxfr(m.a());
        this.a = bxfrVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "remote_registrations_table.etouffee";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxez
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxfa
        };
        bxfr bxfrVar2 = new bxfr(m2.a());
        this.b = bxfrVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "remote_registrations_table.better_etouffee";
        m3.i(46000);
        dtqsVar3.d = new Supplier() { // from class: bxfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxfc
        };
        bxfr bxfrVar3 = new bxfr(m3.a());
        this.c = bxfrVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "remote_registrations_table.messages_feature_hash";
        m4.i(58800);
        dtqsVar4.d = new Supplier() { // from class: bxfd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxfe
        };
        bxfr bxfrVar4 = new bxfr(m4.a());
        this.d = bxfrVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "remote_registrations_table.last_modified_timestamp";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bxff
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxfg
        };
        bxfr bxfrVar5 = new bxfr(m5.a());
        this.e = bxfrVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        dtqsVar6.a = "remote_registrations_table.identity_key";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bxfh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bxfi
        };
        bxfr bxfrVar6 = new bxfr(m6.a());
        this.f = bxfrVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "remote_registrations_table.updated_at_hash";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bxfj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bxfk
        };
        bxfr bxfrVar7 = new bxfr(m7.a());
        this.g = bxfrVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "remote_registrations_table.guaranteed_fresh_as_of_timestamp";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bxfl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bxfm
        };
        bxfr bxfrVar8 = new bxfr(m8.a());
        this.h = bxfrVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        dtqsVar9.a = "remote_registrations_table.is_updated_at_hash_valid";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bxfn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bxfo
        };
        bxfr bxfrVar9 = new bxfr(m9.a());
        this.i = bxfrVar9;
        this.j = new bxfr[]{bxfrVar, bxfrVar2, bxfrVar3, bxfrVar4, bxfrVar5, bxfrVar6, bxfrVar7, bxfrVar8, bxfrVar9};
    }
}
