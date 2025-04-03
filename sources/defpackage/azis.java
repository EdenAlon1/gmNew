package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azis {
    public final azit a;
    public final azit b;
    public final azit c;
    public final azit d;
    public final azit e;
    public final azit f;
    public final azit g;
    public final azit h;
    public final azit i;
    final azit[] j;

    public azis() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: azhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        };
        dtqsVar.a = "groups.token";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: azia
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: azib
        };
        azit azitVar = new azit(m.a());
        this.a = azitVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "groups.group_type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: azic
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: azid
        };
        azit azitVar2 = new azit(m2.a());
        this.b = azitVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "groups.rcs_conference_uri";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: azie
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: azif
        };
        azit azitVar3 = new azit(m3.a());
        this.c = azitVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "groups.name";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: azig
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: azih
        };
        azit azitVar4 = new azit(m4.a());
        this.d = azitVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "groups.rcs_icon_url";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: azii
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: azij
        };
        azit azitVar5 = new azit(m5.a());
        this.e = azitVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "groups.rcs_group_state";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: azik
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: azil
        };
        azit azitVar6 = new azit(m6.a());
        this.f = azitVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 5;
        dtqsVar7.a = "groups.tachygram_group_routing_token";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: azim
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: azin
        };
        azit azitVar7 = new azit(m7.a());
        this.g = azitVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "groups.rcs_group_capabilities";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: azio
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: azip
        };
        azit azitVar8 = new azit(m8.a());
        this.h = azitVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        dtqsVar9.a = "groups.rcs_group_last_sync_timestamp";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: aziq
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: azir
        };
        azit azitVar9 = new azit(m9.a());
        this.i = azitVar9;
        this.j = new azit[]{azitVar, azitVar2, azitVar3, azitVar4, azitVar5, azitVar6, azitVar7, azitVar8, azitVar9};
    }
}
