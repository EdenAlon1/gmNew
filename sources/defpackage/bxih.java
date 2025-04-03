package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxih {
    public final bxii a;
    public final bxii b;
    final bxii[] c;

    public bxih() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "remote_user_id_to_registration_id.remote_user_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxic
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxiv.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxid
        };
        bxii bxiiVar = new bxii(m.a());
        this.a = bxiiVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.g(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bxie
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxgl.b.a;
            }
        };
        dtqsVar2.a = "remote_user_id_to_registration_id.tachyon_registration_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxif
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxiv.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxig
        };
        bxii bxiiVar2 = new bxii(m2.a());
        this.b = bxiiVar2;
        this.c = new bxii[]{bxiiVar, bxiiVar2};
    }
}
