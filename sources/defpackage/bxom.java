package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxom {
    public final bxon a;
    public final bxon b;
    public final bxon c;
    final bxon[] d;

    public bxom() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.d(true);
        dtqsVar.a = "restore_workflow_scratch_suffix.which_database";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxog
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxpb.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxoh
        };
        bxon bxonVar = new bxon(m.a());
        this.a = bxonVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "restore_workflow_scratch_suffix.participant_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxoi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxpb.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxoj
        };
        bxon bxonVar2 = new bxon(m2.a());
        this.b = bxonVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.d(true);
        dtqsVar3.a = "restore_workflow_scratch_suffix.destination_suffix";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxok
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxpb.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxol
        };
        bxon bxonVar3 = new bxon(m3.a());
        this.c = bxonVar3;
        this.d = new bxon[]{bxonVar, bxonVar2, bxonVar3};
    }
}
