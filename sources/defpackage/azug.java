package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azug {
    public final azuh a;
    public final azuh b;
    public final azuh c;
    public final azuh d;
    public final azuh e;
    final azuh[] f;

    public azug() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "subscriptions.sub_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: aztv
            @Override // java.util.function.Supplier
            public final Object get() {
                return azuy.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: azty
        };
        azuh azuhVar = new azuh(m.a());
        this.a = azuhVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "subscriptions.sim_serial_number";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: aztz
            @Override // java.util.function.Supplier
            public final Object get() {
                return azuy.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: azua
        };
        azuh azuhVar2 = new azuh(m2.a());
        this.b = azuhVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "subscriptions.telephony_phone_number";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: azub
            @Override // java.util.function.Supplier
            public final Object get() {
                return azuy.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: azuc
        };
        azuh azuhVar3 = new azuh(m3.a());
        this.c = azuhVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.d(true);
        dtqsVar4.a = "subscriptions.my_identity_token";
        m4.i(59450);
        dtqsVar4.d = new Supplier() { // from class: azud
            @Override // java.util.function.Supplier
            public final Object get() {
                return azuy.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: azue
        };
        azuh azuhVar4 = new azuh(m4.a());
        this.d = azuhVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        m5.d(true);
        m5.e(true);
        dtqsVar5.b = new Supplier() { // from class: azuf
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar5.a = "subscriptions.my_identity_token_with_foreign_key";
        m5.i(60160);
        dtqsVar5.d = new Supplier() { // from class: aztw
            @Override // java.util.function.Supplier
            public final Object get() {
                return azuy.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: aztx
        };
        azuh azuhVar5 = new azuh(m5.a());
        this.e = azuhVar5;
        this.f = new azuh[]{azuhVar, azuhVar2, azuhVar3, azuhVar4, azuhVar5};
    }
}
