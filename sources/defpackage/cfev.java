package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfev {
    public final cfew a;
    public final cfew b;
    public final cfew c;
    public final cfew d;
    public final cfew e;
    public final cfew f;
    public final cfew g;
    public final cfew h;
    public final cfew i;
    final cfew[] j;

    public cfev() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "work_queue_work_manager_ids.queue";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cfed
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cfeu
        };
        cfew cfewVar = new cfew(m.a());
        this.a = cfewVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "work_queue_work_manager_ids.workmanager_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cfee
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cfef
        };
        cfew cfewVar2 = new cfew(m2.a());
        this.b = cfewVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "work_queue_work_manager_ids.scheduled_at_time";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cfeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cfeh
        };
        cfew cfewVar3 = new cfew(m3.a());
        this.c = cfewVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "work_queue_work_manager_ids.minimum_start_time";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cfei
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cfej
        };
        cfew cfewVar4 = new cfew(m4.a());
        this.d = cfewVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "work_queue_work_manager_ids.requires_network_type";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: cfek
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cfel
        };
        cfew cfewVar5 = new cfew(m5.a());
        this.e = cfewVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "work_queue_work_manager_ids.requires_charging";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: cfem
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: cfen
        };
        cfew cfewVar6 = new cfew(m6.a());
        this.f = cfewVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "work_queue_work_manager_ids.requires_device_idle";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: cfeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: cfep
        };
        cfew cfewVar7 = new cfew(m7.a());
        this.g = cfewVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "work_queue_work_manager_ids.requires_battery_not_low";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: cfeq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: cfer
        };
        cfew cfewVar8 = new cfew(m8.a());
        this.h = cfewVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        dtqsVar9.a = "work_queue_work_manager_ids.requires_storage_not_low";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: cfes
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfft.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: cfet
        };
        cfew cfewVar9 = new cfew(m9.a());
        this.i = cfewVar9;
        this.j = new cfew[]{cfewVar, cfewVar2, cfewVar3, cfewVar4, cfewVar5, cfewVar6, cfewVar7, cfewVar8, cfewVar9};
    }
}
