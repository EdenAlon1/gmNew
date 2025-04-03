package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtg {
    public final bwth a;
    public final bwth b;
    public final bwth c;
    public final bwth d;
    final bwth[] e;

    public bwtg() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "rbm_business_verifier_info.verifier_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwsy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwty.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwsz
        };
        bwth bwthVar = new bwth(m.a());
        this.a = bwthVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "rbm_business_verifier_info.verifier_name";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwta
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwty.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwtb
        };
        bwth bwthVar2 = new bwth(m2.a());
        this.b = bwthVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.k(true);
        dtqsVar3.a = "rbm_business_verifier_info.verifier_logo_image_remote_url";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bwtc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwty.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwtd
        };
        bwth bwthVar3 = new bwth(m3.a());
        this.c = bwthVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.k(true);
        dtqsVar4.a = "rbm_business_verifier_info.verifier_logo_image_local_uri";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwte
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwty.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwtf
        };
        bwth bwthVar4 = new bwth(m4.a());
        this.d = bwthVar4;
        this.e = new bwth[]{bwthVar, bwthVar2, bwthVar3, bwthVar4};
    }
}
