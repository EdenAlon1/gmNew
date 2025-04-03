package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxaq {
    public final bxar a;
    public final bxar b;
    public final bxar c;
    final bxar[] d;

    public bxaq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "recent_stickers._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxak
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxba.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxal
        };
        bxar bxarVar = new bxar(m.a());
        this.a = bxarVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "recent_stickers.sticker_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxam
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxba.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxan
        };
        bxar bxarVar2 = new bxar(m2.a());
        this.b = bxarVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "recent_stickers.last_used_timestamp";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxao
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxba.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxap
        };
        bxar bxarVar3 = new bxar(m3.a());
        this.c = bxarVar3;
        this.d = new bxar[]{bxarVar, bxarVar2, bxarVar3};
    }
}
