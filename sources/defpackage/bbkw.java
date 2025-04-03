package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbkw {
    public final bbkx a;
    public final bbkx b;
    public final bbkx c;
    final bbkx[] d;

    public bbkw() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_pins_backup._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bbkp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbln.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bbkq
        };
        bbkx bbkxVar = new bbkx(m.a());
        this.a = bbkxVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bbkr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbov.c.a;
            }
        };
        dtqsVar2.a = "conversation_pins_backup.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bbks
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbln.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bbkt
        };
        bbkx bbkxVar2 = new bbkx(m2.a());
        this.b = bbkxVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "conversation_pins_backup.pin_status";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bbku
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbln.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bbkv
        };
        bbkx bbkxVar3 = new bbkx(m3.a());
        this.c = bbkxVar3;
        this.d = new bbkx[]{bbkxVar, bbkxVar2, bbkxVar3};
    }
}
