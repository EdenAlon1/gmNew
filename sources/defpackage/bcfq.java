package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcfq {
    public final bcfr a;
    public final bcfr b;
    public final bcfr c;
    public final bcfr d;
    final bcfr[] e;

    public bcfq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "my_identities_backup.token";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bcfi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcgh.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bcfj
        };
        bcfr bcfrVar = new bcfr(m.a());
        this.a = bcfrVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "my_identities_backup.address_type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bcfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcgh.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bcfl
        };
        bcfr bcfrVar2 = new bcfr(m2.a());
        this.b = bcfrVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "my_identities_backup.phone_number";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bcfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcgh.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bcfn
        };
        bcfr bcfrVar3 = new bcfr(m3.a());
        this.c = bcfrVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "my_identities_backup.display_name";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bcfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcgh.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bcfp
        };
        bcfr bcfrVar4 = new bcfr(m4.a());
        this.d = bcfrVar4;
        this.e = new bcfr[]{bcfrVar, bcfrVar2, bcfrVar3, bcfrVar4};
    }
}
