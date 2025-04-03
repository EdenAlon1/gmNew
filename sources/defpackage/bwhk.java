package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwhk {
    public final bwhl a;
    public final bwhl b;
    final bwhl[] c;

    public bwhk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "phone_number_min_match_guesser.guesser_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwhg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwhy.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwhh
        };
        bwhl bwhlVar = new bwhl(m.a());
        this.a = bwhlVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "phone_number_min_match_guesser.test_phone_number";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwhi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwhy.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwhj
        };
        bwhl bwhlVar2 = new bwhl(m2.a());
        this.b = bwhlVar2;
        this.c = new bwhl[]{bwhlVar, bwhlVar2};
    }
}
