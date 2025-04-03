package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btwu {
    public final btwv a;
    public final btwv b;
    public final btwv c;
    public final btwv d;
    final btwv[] e;

    public btwu() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_destinations._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btwl
            @Override // java.util.function.Supplier
            public final Object get() {
                return btxi.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btwm
        };
        btwv btwvVar = new btwv(m.a());
        this.a = btwvVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.b.a;
            }
        };
        dtqsVar2.a = "message_destinations.message_send_receive_attempt_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return btxi.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btwp
        };
        btwv btwvVar2 = new btwv(m2.a());
        this.b = btwvVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "message_destinations.message_destination_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btwq
            @Override // java.util.function.Supplier
            public final Object get() {
                return btxi.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btwr
        };
        btwv btwvVar3 = new btwv(m3.a());
        this.c = btwvVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.k(true);
        dtqsVar4.a = "message_destinations.message_destination_raw";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: btws
            @Override // java.util.function.Supplier
            public final Object get() {
                return btxi.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btwt
        };
        btwv btwvVar4 = new btwv(m4.a());
        this.d = btwvVar4;
        this.e = new btwv[]{btwvVar, btwvVar2, btwvVar3, btwvVar4};
    }
}
