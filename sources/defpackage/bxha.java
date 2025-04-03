package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxha {
    public final bxhb a;
    public final bxhb b;
    public final bxhb c;
    final bxhb[] d;

    public bxha() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "remote_user_id_info_table.remote_user_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxgu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxhr.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxgv
        };
        bxhb bxhbVar = new bxhb(m.a());
        this.a = bxhbVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        dtqsVar2.a = "remote_user_id_info_table.last_modified_timestamp";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxgw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxhr.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxgx
        };
        bxhb bxhbVar2 = new bxhb(m2.a());
        this.b = bxhbVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "remote_user_id_info_table.guaranteed_fresh_as_of_timestamp";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxgy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxhr.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxgz
        };
        bxhb bxhbVar3 = new bxhb(m3.a());
        this.c = bxhbVar3;
        this.d = new bxhb[]{bxhbVar, bxhbVar2, bxhbVar3};
    }
}
