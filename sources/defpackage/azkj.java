package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azkj {
    public final azkk a;
    public final azkk b;
    public final azkk c;
    final azkk[] d;

    public azkj() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: azkb
            @Override // java.util.function.Supplier
            public final Object get() {
                return azuy.c.b;
            }
        };
        dtqsVar.a = "active_sims.sim_serial_number";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: azkc
            @Override // java.util.function.Supplier
            public final Object get() {
                return azkv.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: azkd
        };
        azkk azkkVar = new azkk(m.a());
        this.a = azkkVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: azke
            @Override // java.util.function.Supplier
            public final Object get() {
                return azuy.c.a;
            }
        };
        dtqsVar2.a = "active_sims.active_sub_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: azkf
            @Override // java.util.function.Supplier
            public final Object get() {
                return azkv.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: azkg
        };
        azkk azkkVar2 = new azkk(m2.a());
        this.b = azkkVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "active_sims.sim_slot_index";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: azkh
            @Override // java.util.function.Supplier
            public final Object get() {
                return azkv.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: azki
        };
        azkk azkkVar3 = new azkk(m3.a());
        this.c = azkkVar3;
        this.d = new azkk[]{azkkVar, azkkVar2, azkkVar3};
    }
}
