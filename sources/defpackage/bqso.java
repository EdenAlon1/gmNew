package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqso {
    public final bqsp a;
    public final bqsp b;
    public final bqsp c;
    public final bqsp d;
    public final bqsp e;
    public final bqsp f;
    public final bqsp g;
    final bqsp[] h;

    public bqso() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_restore_dependency_cache_table._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqth.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqsj
        };
        bqsp bqspVar = new bqsp(m.a());
        this.a = bqspVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        dtqsVar2.a = "cms_restore_dependency_cache_table.dependent_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqth.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqsl
        };
        bqsp bqspVar2 = new bqsp(m2.a());
        this.b = bqspVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        m3.d(true);
        dtqsVar3.a = "cms_restore_dependency_cache_table.dependent_cms_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqth.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqsn
        };
        bqsp bqspVar3 = new bqsp(m3.a());
        this.c = bqspVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.k(true);
        m4.d(true);
        dtqsVar4.a = "cms_restore_dependency_cache_table.dependency_cms_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqth.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqsc
        };
        bqsp bqspVar4 = new bqsp(m4.a());
        this.d = bqspVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        m5.k(true);
        dtqsVar5.a = "cms_restore_dependency_cache_table.cms_data_provider_type";
        m5.i(59660);
        dtqsVar5.d = new Supplier() { // from class: bqsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqth.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqse
        };
        bqsp bqspVar5 = new bqsp(m5.a());
        this.e = bqspVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        m6.k(true);
        dtqsVar6.a = "cms_restore_dependency_cache_table.payload";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bqsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqth.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bqsg
        };
        bqsp bqspVar6 = new bqsp(m6.a());
        this.f = bqspVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        m7.k(true);
        m7.d(true);
        dtqsVar7.a = "cms_restore_dependency_cache_table.inserted_at_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bqsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqth.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bqsi
        };
        bqsp bqspVar7 = new bqsp(m7.a());
        this.g = bqspVar7;
        this.h = new bqsp[]{bqspVar, bqspVar2, bqspVar3, bqspVar4, bqspVar5, bqspVar6, bqspVar7};
    }
}
