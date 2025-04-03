package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqjt {
    public final bqju a;
    public final bqju b;
    public final bqju c;
    public final bqju d;
    public final bqju e;
    public final bqju f;
    public final bqju g;
    public final bqju h;
    public final bqju i;
    public final bqju j;
    public final bqju k;
    final bqju[] l;

    public bqjt() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_dead_letter_queue._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqix
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqiz
        };
        bqju bqjuVar = new bqju(m.a());
        this.a = bqjuVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "cms_dead_letter_queue.cms_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqjd
        };
        bqju bqjuVar2 = new bqju(m2.a());
        this.b = bqjuVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "cms_dead_letter_queue.cms_data_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqje
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqjf
        };
        bqju bqjuVar3 = new bqju(m3.a());
        this.c = bqjuVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.d(true);
        dtqsVar4.a = "cms_dead_letter_queue.abandoned_action";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqjh
        };
        bqju bqjuVar4 = new bqju(m4.a());
        this.d = bqjuVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "cms_dead_letter_queue.failure_reason";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bqjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqjk
        };
        bqju bqjuVar5 = new bqju(m5.a());
        this.e = bqjuVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "cms_dead_letter_queue.bugle_table_type";
        m6.i(57090);
        dtqsVar6.d = new Supplier() { // from class: bqji
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bqjl
        };
        bqju bqjuVar6 = new bqju(m6.a());
        this.f = bqjuVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        m7.d(true);
        dtqsVar7.a = "cms_dead_letter_queue.bugle_id";
        m7.i(57090);
        dtqsVar7.d = new Supplier() { // from class: bqjm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bqjn
        };
        bqju bqjuVar7 = new bqju(m7.a());
        this.g = bqjuVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 5;
        dtqsVar8.a = "cms_dead_letter_queue.cms_backup_parameters";
        m8.i(57090);
        dtqsVar8.d = new Supplier() { // from class: bqjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bqjp
        };
        bqju bqjuVar8 = new bqju(m8.a());
        this.h = bqjuVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        dtqsVar9.a = "cms_dead_letter_queue.backup_flags";
        m9.i(57090);
        dtqsVar9.d = new Supplier() { // from class: bqjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bqjr
        };
        bqju bqjuVar9 = new bqju(m9.a());
        this.i = bqjuVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 2;
        dtqsVar10.a = "cms_dead_letter_queue.backup_dependency_table_type";
        m10.i(57090);
        dtqsVar10.d = new Supplier() { // from class: bqjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bqiy
        };
        bqju bqjuVar10 = new bqju(m10.a());
        this.j = bqjuVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 2;
        dtqsVar11.a = "cms_dead_letter_queue.backup_dependency_bugle_id";
        m11.i(57090);
        dtqsVar11.d = new Supplier() { // from class: bqja
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqkv.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bqjb
        };
        bqju bqjuVar11 = new bqju(m11.a());
        this.k = bqjuVar11;
        this.l = new bqju[]{bqjuVar, bqjuVar2, bqjuVar3, bqjuVar4, bqjuVar5, bqjuVar6, bqjuVar7, bqjuVar8, bqjuVar9, bqjuVar10, bqjuVar11};
    }
}
