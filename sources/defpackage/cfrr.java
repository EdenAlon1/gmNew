package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfrr {
    public final cfrs a;
    public final cfrs b;
    public final cfrs c;
    public final cfrs d;
    final cfrs[] e;

    public cfrr() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "mls_zinnia_states.identity_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cfrj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfsd.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cfrk
        };
        cfrs cfrsVar = new cfrs(m.a());
        this.a = cfrsVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "mls_zinnia_states.group_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cfrl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfsd.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cfrm
        };
        cfrs cfrsVar2 = new cfrs(m2.a());
        this.b = cfrsVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.l(true);
        m3.k(true);
        m3.g(true);
        m3.d(true);
        dtqsVar3.a = "mls_zinnia_states.era";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cfrn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfsd.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cfro
        };
        cfrs cfrsVar3 = new cfrs(m3.a());
        this.c = cfrsVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        m4.k(true);
        dtqsVar4.a = "mls_zinnia_states.zinnia_state";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cfrp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfsd.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cfrq
        };
        cfrs cfrsVar4 = new cfrs(m4.a());
        this.d = cfrsVar4;
        this.e = new cfrs[]{cfrsVar, cfrsVar2, cfrsVar3, cfrsVar4};
    }
}
