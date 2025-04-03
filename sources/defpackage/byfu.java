package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byfu {
    public final byfv a;
    public final byfv b;
    final byfv[] c;

    public byfu() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "trigger_flags._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: byfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return byge.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: byfr
        };
        byfv byfvVar = new byfv(m.a());
        this.a = byfvVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "trigger_flags.enabled";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: byfs
            @Override // java.util.function.Supplier
            public final Object get() {
                return byge.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: byft
        };
        byfv byfvVar2 = new byfv(m2.a());
        this.b = byfvVar2;
        this.c = new byfv[]{byfvVar, byfvVar2};
    }
}
