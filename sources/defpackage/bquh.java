package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bquh {
    public final bqui a;
    public final bqui b;
    public final bqui c;
    public final bqui d;
    public final bqui e;
    public final bqui f;
    public final bqui g;
    public final bqui h;
    final bqui[] i;

    public bquh() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_status._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqtr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bque
        };
        bqui bquiVar = new bqui(m.a());
        this.a = bquiVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "cms_status.table_type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bquf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqug
        };
        bqui bquiVar2 = new bqui(m2.a());
        this.b = bquiVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "cms_status.item_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqts
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqtt
        };
        bqui bquiVar3 = new bqui(m3.a());
        this.c = bquiVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "cms_status.cms_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqtu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqtv
        };
        bqui bquiVar4 = new bqui(m4.a());
        this.d = bquiVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "cms_status.timestamp";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bqtw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqtx
        };
        bqui bquiVar5 = new bqui(m5.a());
        this.e = bquiVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        dtqsVar6.a = "cms_status.event_type";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bqty
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bqtz
        };
        bqui bquiVar6 = new bqui(m6.a());
        this.f = bquiVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "cms_status.status";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bqua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bqub
        };
        bqui bquiVar7 = new bqui(m7.a());
        this.g = bquiVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "cms_status.attempt_number";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bquc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqvb.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bqud
        };
        bqui bquiVar8 = new bqui(m8.a());
        this.h = bquiVar8;
        this.i = new bqui[]{bquiVar, bquiVar2, bquiVar3, bquiVar4, bquiVar5, bquiVar6, bquiVar7, bquiVar8};
    }
}
