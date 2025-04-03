package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bunk {
    public final bunl a;
    public final bunl b;
    public final bunl c;
    public final bunl d;
    public final bunl e;
    public final bunl f;
    final bunl[] g;

    public bunk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_status._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bumy
            @Override // java.util.function.Supplier
            public final Object get() {
                return buoc.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bund
        };
        bunl bunlVar = new bunl(m.a());
        this.a = bunlVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "message_status.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bune
            @Override // java.util.function.Supplier
            public final Object get() {
                return buoc.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bunf
        };
        bunl bunlVar2 = new bunl(m2.a());
        this.b = bunlVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "message_status.timestamp";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bung
            @Override // java.util.function.Supplier
            public final Object get() {
                return buoc.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bunh
        };
        bunl bunlVar3 = new bunl(m3.a());
        this.c = bunlVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "message_status.status";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: buni
            @Override // java.util.function.Supplier
            public final Object get() {
                return buoc.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bunj
        };
        bunl bunlVar4 = new bunl(m4.a());
        this.d = bunlVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "message_status.custom_status";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bumz
            @Override // java.util.function.Supplier
            public final Object get() {
                return buoc.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: buna
        };
        bunl bunlVar5 = new bunl(m5.a());
        this.e = bunlVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "message_status.data";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bunb
            @Override // java.util.function.Supplier
            public final Object get() {
                return buoc.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bunc
        };
        bunl bunlVar6 = new bunl(m6.a());
        this.f = bunlVar6;
        this.g = new bunl[]{bunlVar, bunlVar2, bunlVar3, bunlVar4, bunlVar5, bunlVar6};
    }
}
