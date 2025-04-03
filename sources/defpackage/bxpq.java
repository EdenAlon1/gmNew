package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxpq {
    public final bxpr a;
    public final bxpr b;
    public final bxpr c;
    public final bxpr d;
    final bxpr[] e;

    public bxpq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.d(true);
        dtqsVar.a = "restore_workflow_scratch_timestamps.which_database";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxpi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxqg.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxpj
        };
        bxpr bxprVar = new bxpr(m.a());
        this.a = bxprVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "restore_workflow_scratch_timestamps.message_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxqg.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxpl
        };
        bxpr bxprVar2 = new bxpr(m2.a());
        this.b = bxprVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        dtqsVar3.a = "restore_workflow_scratch_timestamps.timestamp_in_seconds";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxqg.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxpn
        };
        bxpr bxprVar3 = new bxpr(m3.a());
        this.c = bxprVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "restore_workflow_scratch_timestamps.timestamp_mod_1000";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxpo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxqg.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxpp
        };
        bxpr bxprVar4 = new bxpr(m4.a());
        this.d = bxprVar4;
        this.e = new bxpr[]{bxprVar, bxprVar2, bxprVar3, bxprVar4};
    }
}
