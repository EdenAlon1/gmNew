package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxkd {
    public final bxke a;
    public final bxke b;
    public final bxke c;
    public final bxke d;
    public final bxke e;
    public final bxke f;
    public final bxke g;
    public final bxke h;
    public final bxke i;
    public final bxke j;
    public final bxke k;
    final bxke[] l;

    public bxkd() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "restore_workflow_executions._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxjj
        };
        bxke bxkeVar = new bxke(m.a());
        this.a = bxkeVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "restore_workflow_executions.session_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxjm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxjn
        };
        bxke bxkeVar2 = new bxke(m2.a());
        this.b = bxkeVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "restore_workflow_executions.feature";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxjo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxjp
        };
        bxke bxkeVar3 = new bxke(m3.a());
        this.c = bxkeVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "restore_workflow_executions.status";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxjq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxjr
        };
        bxke bxkeVar4 = new bxke(m4.a());
        this.d = bxkeVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.k(true);
        dtqsVar5.a = "restore_workflow_executions.start_time";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bxjt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxju
        };
        bxke bxkeVar5 = new bxke(m5.a());
        this.e = bxkeVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "restore_workflow_executions.finish_time";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bxjs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bxjv
        };
        bxke bxkeVar6 = new bxke(m6.a());
        this.f = bxkeVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 5;
        dtqsVar7.a = "restore_workflow_executions.backup_database_metadata";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bxjw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bxjx
        };
        bxke bxkeVar7 = new bxke(m7.a());
        this.g = bxkeVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "restore_workflow_executions.initial_messages_version";
        m8.i(60110);
        dtqsVar8.d = new Supplier() { // from class: bxjy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bxjz
        };
        bxke bxkeVar8 = new bxke(m8.a());
        this.h = bxkeVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        dtqsVar9.a = "restore_workflow_executions.status_timestamp";
        m9.i(60220);
        dtqsVar9.d = new Supplier() { // from class: bxka
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bxkb
        };
        bxke bxkeVar9 = new bxke(m9.a());
        this.i = bxkeVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 2;
        dtqsVar10.a = "restore_workflow_executions.last_attachment_request_timestamp";
        m10.i(60330);
        dtqsVar10.d = new Supplier() { // from class: bxkc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bxji
        };
        bxke bxkeVar10 = new bxke(m10.a());
        this.j = bxkeVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 5;
        dtqsVar11.a = "restore_workflow_executions.config";
        m11.i(60730);
        dtqsVar11.d = new Supplier() { // from class: bxjk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bxjl
        };
        bxke bxkeVar11 = new bxke(m11.a());
        this.k = bxkeVar11;
        this.l = new bxke[]{bxkeVar, bxkeVar2, bxkeVar3, bxkeVar4, bxkeVar5, bxkeVar6, bxkeVar7, bxkeVar8, bxkeVar9, bxkeVar10, bxkeVar11};
    }
}
