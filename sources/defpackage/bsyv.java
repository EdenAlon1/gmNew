package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsyv {
    public final bsyw a;
    public final bsyw b;
    public final bsyw c;
    public final bsyw d;
    public final bsyw e;
    final bsyw[] f;

    public bsyv() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "emergency_sessions.emergency_destination";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bsyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszm.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bsym
        };
        bsyw bsywVar = new bsyw(m.a());
        this.a = bsywVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "emergency_sessions.type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bsyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszm.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bsyo
        };
        bsyw bsywVar2 = new bsyw(m2.a());
        this.b = bsywVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "emergency_sessions.start_timestamp";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bsyp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszm.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bsyq
        };
        bsyw bsywVar3 = new bsyw(m3.a());
        this.c = bsywVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "emergency_sessions.end_timestamp";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bsyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszm.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bsys
        };
        bsyw bsywVar4 = new bsyw(m4.a());
        this.d = bsywVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.k(true);
        dtqsVar5.a = "emergency_sessions.refill_duration_ms";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bsyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bszm.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bsyu
        };
        bsyw bsywVar5 = new bsyw(m5.a());
        this.e = bsywVar5;
        this.f = new bsyw[]{bsywVar, bsywVar2, bsywVar3, bsywVar4, bsywVar5};
    }
}
