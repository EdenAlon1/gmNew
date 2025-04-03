package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brax {
    public final bray a;
    public final bray b;
    public final bray c;
    public final bray d;
    public final bray e;
    public final bray f;
    public final bray g;
    final bray[] h;

    public brax() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_classifications_table._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: brai
            @Override // java.util.function.Supplier
            public final Object get() {
                return brbs.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: brat
        };
        bray brayVar = new bray(m.a());
        this.a = brayVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: brau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "conversation_classifications_table.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: brav
            @Override // java.util.function.Supplier
            public final Object get() {
                return brbs.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: braw
        };
        bray brayVar2 = new bray(m2.a());
        this.b = brayVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        dtqsVar3.a = "conversation_classifications_table.classification_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: braj
            @Override // java.util.function.Supplier
            public final Object get() {
                return brbs.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: brak
        };
        bray brayVar3 = new bray(m3.a());
        this.c = brayVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "conversation_classifications_table.classification_state";
        m4.i(58690);
        dtqsVar4.d = new Supplier() { // from class: bral
            @Override // java.util.function.Supplier
            public final Object get() {
                return brbs.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bram
        };
        bray brayVar4 = new bray(m4.a());
        this.d = brayVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        m5.d(true);
        dtqsVar5.a = "conversation_classifications_table.date";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bran
            @Override // java.util.function.Supplier
            public final Object get() {
                return brbs.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: brao
        };
        bray brayVar5 = new bray(m5.a());
        this.e = brayVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "conversation_classifications_table.impression_count";
        m6.i(58840);
        dtqsVar6.d = new Supplier() { // from class: brap
            @Override // java.util.function.Supplier
            public final Object get() {
                return brbs.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: braq
        };
        bray brayVar6 = new bray(m6.a());
        this.f = brayVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "conversation_classifications_table.generated_timestamp";
        m7.i(58840);
        dtqsVar7.d = new Supplier() { // from class: brar
            @Override // java.util.function.Supplier
            public final Object get() {
                return brbs.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bras
        };
        bray brayVar7 = new bray(m7.a());
        this.g = brayVar7;
        this.h = new bray[]{brayVar, brayVar2, brayVar3, brayVar4, brayVar5, brayVar6, brayVar7};
    }
}
