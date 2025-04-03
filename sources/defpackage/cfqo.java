package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfqo {
    public final cfqp a;
    public final cfqp b;
    public final cfqp c;
    public final cfqp d;
    public final cfqp e;
    public final cfqp f;
    final cfqp[] g;

    public cfqo() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "mls_processed_results.self_identity";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cfqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfrc.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cfqh
        };
        cfqp cfqpVar = new cfqp(m.a());
        this.a = cfqpVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "mls_processed_results.rcs_message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cfqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfrc.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cfqj
        };
        cfqp cfqpVar2 = new cfqp(m2.a());
        this.b = cfqpVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.l(true);
        m3.k(true);
        m3.g(true);
        m3.d(true);
        dtqsVar3.a = "mls_processed_results.remote_user_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cfqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfrc.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cfql
        };
        cfqp cfqpVar3 = new cfqp(m3.a());
        this.c = cfqpVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        m4.k(true);
        dtqsVar4.a = "mls_processed_results.raw_content";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cfqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfrc.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cfqn
        };
        cfqp cfqpVar4 = new cfqp(m4.a());
        this.d = cfqpVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.k(true);
        dtqsVar5.a = "mls_processed_results.stage";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: cfqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfrc.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cfqe
        };
        cfqp cfqpVar5 = new cfqp(m5.a());
        this.e = cfqpVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        m6.k(true);
        m6.d(true);
        dtqsVar6.a = "mls_processed_results.sort_timestamp";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: cfqf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfrc.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: cfqg
        };
        cfqp cfqpVar6 = new cfqp(m6.a());
        this.f = cfqpVar6;
        this.g = new cfqp[]{cfqpVar, cfqpVar2, cfqpVar3, cfqpVar4, cfqpVar5, cfqpVar6};
    }
}
