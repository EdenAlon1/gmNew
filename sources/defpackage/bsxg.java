package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsxg {
    public final bsxh a;
    public final bsxh b;
    public final bsxh c;
    public final bsxh d;
    public final bsxh e;
    public final bsxh f;
    public final bsxh g;
    final bsxh[] h;

    public bsxg() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bswr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "drafts.conversation_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bsxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyb.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bsxd
        };
        bsxh bsxhVar = new bsxh(m.a());
        this.a = bsxhVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "drafts.text";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bsxe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyb.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bsxf
        };
        bsxh bsxhVar2 = new bsxh(m2.a());
        this.b = bsxhVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 5;
        dtqsVar3.a = "drafts.attachments";
        m3.i(59420);
        dtqsVar3.d = new Supplier() { // from class: bsws
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyb.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bswt
        };
        bsxh bsxhVar3 = new bsxh(m3.a());
        this.c = bsxhVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "drafts.subject";
        m4.i(59170);
        dtqsVar4.d = new Supplier() { // from class: bswu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyb.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bswv
        };
        bsxh bsxhVar4 = new bsxh(m4.a());
        this.d = bsxhVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        m5.k(true);
        dtqsVar5.a = "drafts.is_urgent";
        m5.i(59170);
        dtqsVar5.d = new Supplier() { // from class: bsww
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyb.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bswx
        };
        bsxh bsxhVar5 = new bsxh(m5.a());
        this.e = bsxhVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "drafts.replied_to_message_id";
        m6.i(59540);
        dtqsVar6.d = new Supplier() { // from class: bswy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyb.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bswz
        };
        bsxh bsxhVar6 = new bsxh(m6.a());
        this.f = bsxhVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        m7.k(true);
        dtqsVar7.a = "drafts.is_encrypted";
        m7.i(59720);
        dtqsVar7.d = new Supplier() { // from class: bsxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsyb.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bsxb
        };
        bsxh bsxhVar7 = new bsxh(m7.a());
        this.g = bsxhVar7;
        this.h = new bsxh[]{bsxhVar, bsxhVar2, bsxhVar3, bsxhVar4, bsxhVar5, bsxhVar6, bsxhVar7};
    }
}
