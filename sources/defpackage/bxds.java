package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxds {
    public final bxdt a;
    public final bxdt b;
    public final bxdt c;
    public final bxdt d;
    public final bxdt e;
    public final bxdt f;
    public final bxdt g;
    public final bxdt h;
    public final bxdt i;
    final bxdt[] j;

    public bxds() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "remote_instances._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxda
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxdr
        };
        bxdt bxdtVar = new bxdt(m.a());
        this.a = bxdtVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "remote_instances.remote_instance_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxdb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxdc
        };
        bxdt bxdtVar2 = new bxdt(m2.a());
        this.b = bxdtVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "remote_instances.etouffee";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxde
        };
        bxdt bxdtVar3 = new bxdt(m3.a());
        this.c = bxdtVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "remote_instances.tachyon_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxdf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxdg
        };
        bxdt bxdtVar4 = new bxdt(m4.a());
        this.d = bxdtVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "remote_instances.last_modified_timestamp";
        m5.i(35040);
        dtqsVar5.d = new Supplier() { // from class: bxdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxdi
        };
        bxdt bxdtVar5 = new bxdt(m5.a());
        this.e = bxdtVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        dtqsVar6.a = "remote_instances.identity_key";
        m6.i(38010);
        dtqsVar6.d = new Supplier() { // from class: bxdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bxdk
        };
        bxdt bxdtVar6 = new bxdt(m6.a());
        this.f = bxdtVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "remote_instances.updated_at_hash";
        m7.i(39040);
        dtqsVar7.d = new Supplier() { // from class: bxdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bxdm
        };
        bxdt bxdtVar7 = new bxdt(m7.a());
        this.g = bxdtVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "remote_instances.guaranteed_fresh_as_of_timestamp";
        m8.i(40010);
        dtqsVar8.d = new Supplier() { // from class: bxdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bxdo
        };
        bxdt bxdtVar8 = new bxdt(m8.a());
        this.h = bxdtVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        dtqsVar9.a = "remote_instances.is_updated_at_hash_valid";
        m9.i(40030);
        dtqsVar9.d = new Supplier() { // from class: bxdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxen.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bxdq
        };
        bxdt bxdtVar9 = new bxdt(m9.a());
        this.i = bxdtVar9;
        this.j = new bxdt[]{bxdtVar, bxdtVar2, bxdtVar3, bxdtVar4, bxdtVar5, bxdtVar6, bxdtVar7, bxdtVar8, bxdtVar9};
    }
}
