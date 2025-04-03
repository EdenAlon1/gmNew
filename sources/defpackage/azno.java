package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azno {
    public final aznp a;
    public final aznp b;
    public final aznp c;
    public final aznp d;
    public final aznp e;
    public final aznp f;
    public final aznp g;
    final aznp[] h;

    public azno() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "my_identities.token";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: azmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: aznk
        };
        aznp aznpVar = new aznp(m.a());
        this.a = aznpVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: aznl
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar2.a = "my_identities.canonical_token";
        m2.i(60530);
        dtqsVar2.d = new Supplier() { // from class: aznm
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: aznn
        };
        aznp aznpVar2 = new aznp(m2.a());
        this.b = aznpVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "my_identities.provisioning_id";
        m3.i(59990);
        dtqsVar3.d = new Supplier() { // from class: azna
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: aznb
        };
        aznp aznpVar3 = new aznp(m3.a());
        this.c = aznpVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.k(true);
        dtqsVar4.a = "my_identities.is_verified";
        m4.i(60320);
        dtqsVar4.d = new Supplier() { // from class: aznc
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: aznd
        };
        aznp aznpVar4 = new aznp(m4.a());
        this.d = aznpVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "my_identities.address_type";
        m5.i(59980);
        dtqsVar5.d = new Supplier() { // from class: azne
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: aznf
        };
        aznp aznpVar5 = new aznp(m5.a());
        this.e = aznpVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "my_identities.phone_number";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: azng
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: aznh
        };
        aznp aznpVar6 = new aznp(m6.a());
        this.f = aznpVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "my_identities.display_name";
        m7.i(60120);
        dtqsVar7.d = new Supplier() { // from class: azni
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: aznj
        };
        aznp aznpVar7 = new aznp(m7.a());
        this.g = aznpVar7;
        this.h = new aznp[]{aznpVar, aznpVar2, aznpVar3, aznpVar4, aznpVar5, aznpVar6, aznpVar7};
    }
}
