package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byce {
    public final bycf a;
    public final bycf b;
    public final bycf c;
    public final bycf d;
    public final bycf e;
    final bycf[] f;

    public byce() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bybs
            @Override // java.util.function.Supplier
            public final Object get() {
                return bybl.b.b;
            }
        };
        dtqsVar.a = "stickers_localization.sticker_set_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bybx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bycq.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: byby
        };
        bycf bycfVar = new bycf(m.a());
        this.a = bycfVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "stickers_localization.sticker_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bybz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bycq.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: byca
        };
        bycf bycfVar2 = new bycf(m2.a());
        this.b = bycfVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.l(true);
        m3.g(true);
        m3.d(true);
        dtqsVar3.a = "stickers_localization.locale";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bycb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bycq.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bycc
        };
        bycf bycfVar3 = new bycf(m3.a());
        this.c = bycfVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "stickers_localization.display_name";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bycd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bycq.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bybt
        };
        bycf bycfVar4 = new bycf(m4.a());
        this.d = bycfVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.e(true);
        dtqsVar5.b = new Supplier() { // from class: bybu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bybl.b.a;
            }
        };
        dtqsVar5.a = "stickers_localization.sticker_local_id";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bybv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bycq.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bybw
        };
        bycf bycfVar5 = new bycf(m5.a());
        this.e = bycfVar5;
        this.f = new bycf[]{bycfVar, bycfVar2, bycfVar3, bycfVar4, bycfVar5};
    }
}
