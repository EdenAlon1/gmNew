package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byxv {
    public final byxw a;
    public final byxw b;
    public final byxw c;
    public final byxw d;
    final byxw[] e;

    public byxv() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: byxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d.a;
            }
        };
        dtqsVar.a = "vmt.part_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: byxn
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: byxo
        };
        byxw byxwVar = new byxw(m.a());
        this.a = byxwVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        dtqsVar2.a = "vmt.vmt_status";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: byxp
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: byxq
        };
        byxw byxwVar2 = new byxw(m2.a());
        this.b = byxwVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "vmt.text";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: byxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: byxs
        };
        byxw byxwVar3 = new byxw(m3.a());
        this.c = byxwVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "vmt.locale";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: byxt
            @Override // java.util.function.Supplier
            public final Object get() {
                return VmtTable.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: byxu
        };
        byxw byxwVar4 = new byxw(m4.a());
        this.d = byxwVar4;
        this.e = new byxw[]{byxwVar, byxwVar2, byxwVar3, byxwVar4};
    }
}
