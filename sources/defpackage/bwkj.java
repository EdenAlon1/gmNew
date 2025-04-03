package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwkj {
    public final bwkk a;
    public final bwkk b;
    public final bwkk c;
    public final bwkk d;
    public final bwkk e;
    public final bwkk f;
    public final bwkk g;
    public final bwkk h;
    final bwkk[] i;

    public bwkj() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "pipeline_work.work_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwkg
        };
        bwkk bwkkVar = new bwkk(m.a());
        this.a = bwkkVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        dtqsVar2.a = "pipeline_work.pipeline_type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwki
        };
        bwkk bwkkVar2 = new bwkk(m2.a());
        this.b = bwkkVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "pipeline_work.sequencing_key";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bwju
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwjv
        };
        bwkk bwkkVar3 = new bwkk(m3.a());
        this.c = bwkkVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "pipeline_work.insertion_timestamp";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwjx
        };
        bwkk bwkkVar4 = new bwkk(m4.a());
        this.d = bwkkVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.k(true);
        dtqsVar5.a = "pipeline_work.execution_attempt_count";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bwjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bwjz
        };
        bwkk bwkkVar5 = new bwkk(m5.a());
        this.e = bwkkVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        m6.k(true);
        dtqsVar6.a = "pipeline_work.execution_state";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bwka
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwkb
        };
        bwkk bwkkVar6 = new bwkk(m6.a());
        this.f = bwkkVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "pipeline_work.client_supplied_id";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bwkc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bwkd
        };
        bwkk bwkkVar7 = new bwkk(m7.a());
        this.g = bwkkVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 5;
        dtqsVar8.a = "pipeline_work.payload";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bwke
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwlg.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bwkf
        };
        bwkk bwkkVar8 = new bwkk(m8.a());
        this.h = bwkkVar8;
        this.i = new bwkk[]{bwkkVar, bwkkVar2, bwkkVar3, bwkkVar4, bwkkVar5, bwkkVar6, bwkkVar7, bwkkVar8};
    }
}
