package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwzg {
    public final bwzh a;
    public final bwzh b;
    public final bwzh c;
    public final bwzh d;
    public final bwzh e;
    public final bwzh f;
    public final bwzh g;
    final bwzh[] h;

    public bwzg() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "recent_gifs.original_image_url";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwys
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxad.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwzb
        };
        bwzh bwzhVar = new bwzh(m.a());
        this.a = bwzhVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "recent_gifs.content_uri";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxad.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwzd
        };
        bwzh bwzhVar2 = new bwzh(m2.a());
        this.b = bwzhVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        dtqsVar3.a = "recent_gifs.domain";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bwze
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxad.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwzf
        };
        bwzh bwzhVar3 = new bwzh(m3.a());
        this.c = bwzhVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.k(true);
        dtqsVar4.a = "recent_gifs.image_search_url";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxad.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwyu
        };
        bwzh bwzhVar4 = new bwzh(m4.a());
        this.d = bwzhVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        m5.k(true);
        dtqsVar5.a = "recent_gifs.width";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bwyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxad.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bwyw
        };
        bwzh bwzhVar5 = new bwzh(m5.a());
        this.e = bwzhVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        m6.k(true);
        dtqsVar6.a = "recent_gifs.height";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bwyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxad.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwyy
        };
        bwzh bwzhVar6 = new bwzh(m6.a());
        this.f = bwzhVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        m7.k(true);
        m7.d(true);
        dtqsVar7.a = "recent_gifs.last_used_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bwyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxad.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bwza
        };
        bwzh bwzhVar7 = new bwzh(m7.a());
        this.g = bwzhVar7;
        this.h = new bwzh[]{bwzhVar, bwzhVar2, bwzhVar3, bwzhVar4, bwzhVar5, bwzhVar6, bwzhVar7};
    }
}
