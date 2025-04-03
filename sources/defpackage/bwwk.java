package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwk {
    public final bwwl a;
    public final bwwl b;
    final bwwl[] c;

    public bwwk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "received_message_phone_numbers.rcs_message_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwwg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwwu.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwwh
        };
        bwwl bwwlVar = new bwwl(m.a());
        this.a = bwwlVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "received_message_phone_numbers.self_msisdn";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwwi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwwu.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwwj
        };
        bwwl bwwlVar2 = new bwwl(m2.a());
        this.b = bwwlVar2;
        this.c = new bwwl[]{bwwlVar, bwwlVar2};
    }
}
