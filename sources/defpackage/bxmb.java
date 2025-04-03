package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxmb {
    public final bxmc a;
    public final bxmc b;
    public final bxmc c;
    public final bxmc d;
    public final bxmc e;
    final bxmc[] f;

    public bxmb() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "restore_workflow_files._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxlq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxmu.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxlt
        };
        bxmc bxmcVar = new bxmc(m.a());
        this.a = bxmcVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bxlu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxle.c.a;
            }
        };
        dtqsVar2.a = "restore_workflow_files.workflow_execution_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxlv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxmu.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxlw
        };
        bxmc bxmcVar2 = new bxmc(m2.a());
        this.b = bxmcVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 5;
        m3.k(true);
        dtqsVar3.a = "restore_workflow_files.backup_file";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxlx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxmu.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxly
        };
        bxmc bxmcVar3 = new bxmc(m3.a());
        this.c = bxmcVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "restore_workflow_files.file_type";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxlz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxmu.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxma
        };
        bxmc bxmcVar4 = new bxmc(m4.a());
        this.d = bxmcVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.k(true);
        dtqsVar5.a = "restore_workflow_files.status";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bxlr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxmu.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxls
        };
        bxmc bxmcVar5 = new bxmc(m5.a());
        this.e = bxmcVar5;
        this.f = new bxmc[]{bxmcVar, bxmcVar2, bxmcVar3, bxmcVar4, bxmcVar5};
    }
}
