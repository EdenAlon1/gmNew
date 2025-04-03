package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxxj {
    public final bxxk a;
    public final bxxk b;
    public final bxxk c;
    public final bxxk d;
    public final bxxk e;
    final bxxk[] f;

    public bxxj() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        dtqsVar.a = "sqlite_master.type";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxwz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxxw.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxxa
        };
        bxxk bxxkVar = new bxxk(m.a());
        this.a = bxxkVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "sqlite_master.name";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxxb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxxw.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxxc
        };
        bxxk bxxkVar2 = new bxxk(m2.a());
        this.b = bxxkVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "sqlite_master.tbl_name";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxxd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxxw.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxxe
        };
        bxxk bxxkVar3 = new bxxk(m3.a());
        this.c = bxxkVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "sqlite_master.rootpage";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxxf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxxw.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxxg
        };
        bxxk bxxkVar4 = new bxxk(m4.a());
        this.d = bxxkVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "sqlite_master.sql";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bxxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxxw.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxxi
        };
        bxxk bxxkVar5 = new bxxk(m5.a());
        this.e = bxxkVar5;
        this.f = new bxxk[]{bxxkVar, bxxkVar2, bxxkVar3, bxxkVar4, bxxkVar5};
    }
}
