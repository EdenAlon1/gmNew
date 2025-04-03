package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqdh {
    public final bqdi a;
    public final bqdi b;
    public final bqdi c;
    public final bqdi d;
    public final bqdi e;
    final bqdi[] f;

    public bqdh() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "backup_id_map._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqcx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqea.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqcy
        };
        bqdi bqdiVar = new bqdi(m.a());
        this.a = bqdiVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "backup_id_map.table_name";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqea.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqda
        };
        bqdi bqdiVar2 = new bqdi(m2.a());
        this.b = bqdiVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        dtqsVar3.a = "backup_id_map.backup_id";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqea.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqdc
        };
        bqdi bqdiVar3 = new bqdi(m3.a());
        this.c = bqdiVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.d(true);
        dtqsVar4.a = "backup_id_map.bugle_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqea.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqde
        };
        bqdi bqdiVar4 = new bqdi(m4.a());
        this.d = bqdiVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.d(true);
        dtqsVar5.a = "backup_id_map.status";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bqdf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqea.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqdg
        };
        bqdi bqdiVar5 = new bqdi(m5.a());
        this.e = bqdiVar5;
        this.f = new bqdi[]{bqdiVar, bqdiVar2, bqdiVar3, bqdiVar4, bqdiVar5};
    }
}
