package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfpk {
    public final cfpl a;
    public final cfpl b;
    public final cfpl c;
    final cfpl[] d;

    public cfpk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 5;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "mls_key_packages._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cfpe
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfpv.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cfpf
        };
        cfpl cfplVar = new cfpl(m.a());
        this.a = cfplVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 5;
        m2.k(true);
        dtqsVar2.a = "mls_key_packages.key_package";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cfpg
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfpv.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cfph
        };
        cfpl cfplVar2 = new cfpl(m2.a());
        this.b = cfplVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "mls_key_packages.expiration_timestamp";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cfpi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfpv.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cfpj
        };
        cfpl cfplVar3 = new cfpl(m3.a());
        this.c = cfplVar3;
        this.d = new cfpl[]{cfplVar, cfplVar2, cfplVar3};
    }
}
