package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqqv {
    public final bqqw a;
    public final bqqw b;
    public final bqqw c;
    public final bqqw d;
    public final bqqw e;
    public final bqqw f;
    public final bqqw g;
    public final bqqw h;
    final bqqw[] i;

    public bqqv() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_notifications.cms_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqqs
        };
        bqqw bqqwVar = new bqqw(m.a());
        this.a = bqqwVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        dtqsVar2.a = "cms_notifications.cms_last_mod_seq";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqqu
        };
        bqqw bqqwVar2 = new bqqw(m2.a());
        this.b = bqqwVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "cms_notifications.cms_correlation_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqqh
        };
        bqqw bqqwVar3 = new bqqw(m3.a());
        this.c = bqqwVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "cms_notifications.from_address";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqqj
        };
        bqqw bqqwVar4 = new bqqw(m4.a());
        this.d = bqqwVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "cms_notifications.to_address";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bqqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqql
        };
        bqqw bqqwVar5 = new bqqw(m5.a());
        this.e = bqqwVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        m6.d(true);
        dtqsVar6.a = "cms_notifications.correlation_text";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bqqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bqqn
        };
        bqqw bqqwVar6 = new bqqw(m6.a());
        this.f = bqqwVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "cms_notifications.modified_at_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bqqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bqqp
        };
        bqqw bqqwVar7 = new bqqw(m7.a());
        this.g = bqqwVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "cms_notifications.message_received_timestamp";
        m8.i(46040);
        dtqsVar8.d = new Supplier() { // from class: bqqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqrp.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bqqr
        };
        bqqw bqqwVar8 = new bqqw(m8.a());
        this.h = bqqwVar8;
        this.i = new bqqw[]{bqqwVar, bqqwVar2, bqqwVar3, bqqwVar4, bqqwVar5, bqqwVar6, bqqwVar7, bqqwVar8};
    }
}
