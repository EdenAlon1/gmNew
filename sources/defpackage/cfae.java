package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfae {
    public final cfaf a;
    public final cfaf b;
    public final cfaf c;
    public final cfaf d;
    public final cfaf e;
    public final cfaf f;
    public final cfaf g;
    public final cfaf h;
    public final cfaf i;
    public final cfaf j;
    public final cfaf k;
    final cfaf[] l;

    public cfae() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "work_queue._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cezi
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cezk
        };
        cfaf cfafVar = new cfaf(m.a());
        this.a = cfafVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "work_queue.type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cezn
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cezo
        };
        cfaf cfafVar2 = new cfaf(m2.a());
        this.b = cfafVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 5;
        m3.k(true);
        dtqsVar3.a = "work_queue.rawdata";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cezp
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cezq
        };
        cfaf cfafVar3 = new cfaf(m3.a());
        this.c = cfafVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "work_queue.attempts";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cezr
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cezs
        };
        cfaf cfafVar4 = new cfaf(m4.a());
        this.d = cfafVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "work_queue.timestamp";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: cezu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cezv
        };
        cfaf cfafVar5 = new cfaf(m5.a());
        this.e = cfafVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        m6.d(true);
        dtqsVar6.a = "work_queue.queue";
        m6.i(41030);
        dtqsVar6.d = new Supplier() { // from class: cezt
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: cezw
        };
        cfaf cfafVar6 = new cfaf(m6.a());
        this.f = cfafVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        m7.d(true);
        dtqsVar7.a = "work_queue.deduplication_tag";
        m7.i(42050);
        dtqsVar7.d = new Supplier() { // from class: cezx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: cezy
        };
        cfaf cfafVar7 = new cfaf(m7.a());
        this.g = cfafVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        m8.d(true);
        dtqsVar8.a = "work_queue.scheduled_in_workmanager";
        m8.i(45030);
        dtqsVar8.d = new Supplier() { // from class: cezz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: cfaa
        };
        cfaf cfafVar8 = new cfaf(m8.a());
        this.h = cfafVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "work_queue.workmanager_id";
        m9.i(46060);
        dtqsVar9.d = new Supplier() { // from class: cfab
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: cfac
        };
        cfaf cfafVar9 = new cfaf(m9.a());
        this.i = cfafVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "work_queue.minimum_start_time";
        m10.i(46070);
        dtqsVar10.d = new Supplier() { // from class: cfad
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: cezj
        };
        cfaf cfafVar10 = new cfaf(m10.a());
        this.j = cfafVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        dtqsVar11.a = "work_queue.cancellation_tag";
        m11.i(48020);
        dtqsVar11.d = new Supplier() { // from class: cezl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfbf.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: cezm
        };
        cfaf cfafVar11 = new cfaf(m11.a());
        this.k = cfafVar11;
        this.l = new cfaf[]{cfafVar, cfafVar2, cfafVar3, cfafVar4, cfafVar5, cfafVar6, cfafVar7, cfafVar8, cfafVar9, cfafVar10, cfafVar11};
    }
}
