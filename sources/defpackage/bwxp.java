package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwxp {
    public final bwxq a;
    public final bwxq b;
    public final bwxq c;
    public final bwxq d;
    public final bwxq e;
    public final bwxq f;
    final bwxq[] g;

    public bwxp() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "recent_expressive_stickers.name";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwyj.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwxi
        };
        bwxq bwxqVar = new bwxq(m.a());
        this.a = bwxqVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "recent_expressive_stickers.content_uri";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwyj.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwxk
        };
        bwxq bwxqVar2 = new bwxq(m2.a());
        this.b = bwxqVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        dtqsVar3.a = "recent_expressive_stickers.content_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bwxl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwyj.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwxm
        };
        bwxq bwxqVar3 = new bwxq(m3.a());
        this.c = bwxqVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.k(true);
        dtqsVar4.a = "recent_expressive_stickers.width";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwxn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwyj.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwxo
        };
        bwxq bwxqVar4 = new bwxq(m4.a());
        this.d = bwxqVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        m5.k(true);
        dtqsVar5.a = "recent_expressive_stickers.height";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bwxe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwyj.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bwxf
        };
        bwxq bwxqVar5 = new bwxq(m5.a());
        this.e = bwxqVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        m6.k(true);
        m6.d(true);
        dtqsVar6.a = "recent_expressive_stickers.last_used_timestamp";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bwxg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwyj.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwxh
        };
        bwxq bwxqVar6 = new bwxq(m6.a());
        this.f = bwxqVar6;
        this.g = new bwxq[]{bwxqVar, bwxqVar2, bwxqVar3, bwxqVar4, bwxqVar5, bwxqVar6};
    }
}
