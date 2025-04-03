package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bydm {
    public final bydn a;
    public final bydn b;
    public final bydn c;
    public final bydn d;
    public final bydn e;
    public final bydn f;
    public final bydn g;
    final bydn[] h;

    public bydm() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "stickers._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bycx
            @Override // java.util.function.Supplier
            public final Object get() {
                return byea.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bydi
        };
        bydn bydnVar = new bydn(m.a());
        this.a = bydnVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bydj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bybl.b.b;
            }
        };
        dtqsVar2.a = "stickers.sticker_set_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bydk
            @Override // java.util.function.Supplier
            public final Object get() {
                return byea.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bydl
        };
        bydn bydnVar2 = new bydn(m2.a());
        this.b = bydnVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "stickers.sticker_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bycy
            @Override // java.util.function.Supplier
            public final Object get() {
                return byea.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bycz
        };
        bydn bydnVar3 = new bydn(m3.a());
        this.c = bydnVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "stickers.icon_uri_static";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: byda
            @Override // java.util.function.Supplier
            public final Object get() {
                return byea.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bydb
        };
        bydn bydnVar4 = new bydn(m4.a());
        this.d = bydnVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "stickers.icon_uri_animated";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bydc
            @Override // java.util.function.Supplier
            public final Object get() {
                return byea.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bydd
        };
        bydn bydnVar5 = new bydn(m5.a());
        this.e = bydnVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "stickers.display_name";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: byde
            @Override // java.util.function.Supplier
            public final Object get() {
                return byea.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bydf
        };
        bydn bydnVar6 = new bydn(m6.a());
        this.f = bydnVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        dtqsVar7.a = "stickers.display_order";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bydg
            @Override // java.util.function.Supplier
            public final Object get() {
                return byea.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bydh
        };
        bydn bydnVar7 = new bydn(m7.a());
        this.g = bydnVar7;
        this.h = new bydn[]{bydnVar, bydnVar2, bydnVar3, bydnVar4, bydnVar5, bydnVar6, bydnVar7};
    }
}
