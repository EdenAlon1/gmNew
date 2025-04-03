package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbri {
    public final bbrj a;
    public final bbrj b;
    final bbrj[] c;

    public bbri() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bbrd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcba.c.a;
            }
        };
        dtqsVar.a = "message_captions_backup.message_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bbre
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbrx.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bbrf
        };
        bbrj bbrjVar = new bbrj(m.a());
        this.a = bbrjVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "message_captions_backup.caption";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bbrg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbrx.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bbrh
        };
        bbrj bbrjVar2 = new bbrj(m2.a());
        this.b = bbrjVar2;
        this.c = new bbrj[]{bbrjVar, bbrjVar2};
    }
}
