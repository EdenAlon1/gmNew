package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpo {
    public final bwpp a;
    public final bwpp b;
    public final bwpp c;
    public final bwpp d;
    public final bwpp e;
    public final bwpp f;
    final bwpp[] g;

    public bwpo() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "rbm_business_info_properties._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwpb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwqg.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwpi
        };
        bwpp bwppVar = new bwpp(m.a());
        this.a = bwppVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bwpj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwso.b.a;
            }
        };
        dtqsVar2.a = "rbm_business_info_properties.rbm_bot_id";
        m2.i(51020);
        dtqsVar2.d = new Supplier() { // from class: bwpk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwqg.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwpl
        };
        bwpp bwppVar2 = new bwpp(m2.a());
        this.b = bwppVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.k(true);
        m3.d(true);
        dtqsVar3.a = "rbm_business_info_properties.type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bwpm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwqg.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwpn
        };
        bwpp bwppVar3 = new bwpp(m3.a());
        this.c = bwppVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "rbm_business_info_properties.header";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwpc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwqg.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwpd
        };
        bwpp bwppVar4 = new bwpp(m4.a());
        this.d = bwppVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "rbm_business_info_properties.subheader";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bwpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwqg.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bwpf
        };
        bwpp bwppVar5 = new bwpp(m5.a());
        this.e = bwppVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "rbm_business_info_properties.property_value";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bwpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwqg.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwph
        };
        bwpp bwppVar6 = new bwpp(m6.a());
        this.f = bwppVar6;
        this.g = new bwpp[]{bwppVar, bwppVar2, bwppVar3, bwppVar4, bwppVar5, bwppVar6};
    }
}
