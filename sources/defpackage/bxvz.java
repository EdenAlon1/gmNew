package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxvz {
    public final bxwa a;
    public final bxwa b;
    public final bxwa c;
    public final bxwa d;
    public final bxwa e;
    final bxwa[] f;

    public bxvz() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "settings._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxws.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxvq
        };
        bxwa bxwaVar = new bxwa(m.a());
        this.a = bxwaVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "settings.key";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxws.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxvs
        };
        bxwa bxwaVar2 = new bxwa(m2.a());
        this.b = bxwaVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "settings.sub_key";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxvt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxws.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxvu
        };
        bxwa bxwaVar3 = new bxwa(m3.a());
        this.c = bxwaVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        dtqsVar4.a = "settings.data";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxws.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxvw
        };
        bxwa bxwaVar4 = new bxwa(m4.a());
        this.d = bxwaVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "settings.last_modified_timestamp";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bxvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxws.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxvy
        };
        bxwa bxwaVar5 = new bxwa(m5.a());
        this.e = bxwaVar5;
        this.f = new bxwa[]{bxwaVar, bxwaVar2, bxwaVar3, bxwaVar4, bxwaVar5};
    }
}
