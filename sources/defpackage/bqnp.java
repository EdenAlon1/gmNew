package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqnp {
    public final bqnq a;
    public final bqnq b;
    public final bqnq c;
    public final bqnq d;
    public final bqnq e;
    public final bqnq f;
    public final bqnq g;
    final bqnq[] h;

    public bqnp() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_incremental_events._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqon.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqnk
        };
        bqnq bqnqVar = new bqnq(m.a());
        this.a = bqnqVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "cms_incremental_events.table_type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqnl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqon.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqnm
        };
        bqnq bqnqVar2 = new bqnq(m2.a());
        this.b = bqnqVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "cms_incremental_events.operation";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqnn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqon.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqno
        };
        bqnq bqnqVar3 = new bqnq(m3.a());
        this.c = bqnqVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.k(true);
        dtqsVar4.a = "cms_incremental_events.bugle_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqnc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqon.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqnd
        };
        bqnq bqnqVar4 = new bqnq(m4.a());
        this.d = bqnqVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "cms_incremental_events.attempt_count";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bqne
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqon.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqnf
        };
        bqnq bqnqVar5 = new bqnq(m5.a());
        this.e = bqnqVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "cms_incremental_events.create_timestamp";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bqng
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqon.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bqnh
        };
        bqnq bqnqVar6 = new bqnq(m6.a());
        this.f = bqnqVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "cms_incremental_events.last_attempt_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bqni
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqon.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bqnj
        };
        bqnq bqnqVar7 = new bqnq(m7.a());
        this.g = bqnqVar7;
        this.h = new bqnq[]{bqnqVar, bqnqVar2, bqnqVar3, bqnqVar4, bqnqVar5, bqnqVar6, bqnqVar7};
    }
}
