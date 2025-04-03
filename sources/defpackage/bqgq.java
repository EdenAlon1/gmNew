package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqgq {
    public final bqgr a;
    public final bqgr b;
    public final bqgr c;
    public final bqgr d;
    final bqgr[] e;

    public bqgq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_backup_dependency_cache_table._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhg.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqgj
        };
        bqgr bqgrVar = new bqgr(m.a());
        this.a = bqgrVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "cms_backup_dependency_cache_table.dependent_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhg.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqgl
        };
        bqgr bqgrVar2 = new bqgr(m2.a());
        this.b = bqgrVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        m3.d(true);
        dtqsVar3.a = "cms_backup_dependency_cache_table.dependency_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqgm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhg.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqgn
        };
        bqgr bqgrVar3 = new bqgr(m3.a());
        this.c = bqgrVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        m4.d(true);
        dtqsVar4.a = "cms_backup_dependency_cache_table.inserted_at_timestamp";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqgo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqhg.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqgp
        };
        bqgr bqgrVar4 = new bqgr(m4.a());
        this.d = bqgrVar4;
        this.e = new bqgr[]{bqgrVar, bqgrVar2, bqgrVar3, bqgrVar4};
    }
}
