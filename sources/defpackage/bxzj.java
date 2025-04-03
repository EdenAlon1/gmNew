package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxzj {
    public final bxzk a;
    public final bxzk b;
    public final bxzk c;
    final bxzk[] d;

    public bxzj() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bxzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bybl.b.b;
            }
        };
        dtqsVar.a = "sticker_sets_localization.sticker_set_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxzt.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxze
        };
        bxzk bxzkVar = new bxzk(m.a());
        this.a = bxzkVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "sticker_sets_localization.locale";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxzt.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxzg
        };
        bxzk bxzkVar2 = new bxzk(m2.a());
        this.b = bxzkVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "sticker_sets_localization.display_name";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxzt.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxzi
        };
        bxzk bxzkVar3 = new bxzk(m3.a());
        this.c = bxzkVar3;
        this.d = new bxzk[]{bxzkVar, bxzkVar2, bxzkVar3};
    }
}
