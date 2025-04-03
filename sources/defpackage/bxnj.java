package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnj {
    public final bxnk a;
    public final bxnk b;
    public final bxnk c;
    final bxnk[] d;

    public bxnj() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.d(true);
        dtqsVar.a = "restore_workflow_scratch_duplicates.key";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxny.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxne
        };
        bxnk bxnkVar = new bxnk(m.a());
        this.a = bxnkVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "restore_workflow_scratch_duplicates.backup_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxny.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxng
        };
        bxnk bxnkVar2 = new bxnk(m2.a());
        this.b = bxnkVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.d(true);
        dtqsVar3.a = "restore_workflow_scratch_duplicates.bugle_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxnh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxny.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxni
        };
        bxnk bxnkVar3 = new bxnk(m3.a());
        this.c = bxnkVar3;
        this.d = new bxnk[]{bxnkVar, bxnkVar2, bxnkVar3};
    }
}
