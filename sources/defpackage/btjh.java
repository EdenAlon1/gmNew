package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btjh {
    public final btji a;
    public final btji b;
    public final btji c;
    public final btji d;
    public final btji e;
    public final btji f;
    public final btji g;
    public final btji h;
    public final btji i;
    public final btji j;
    public final btji k;
    final btji[] l;

    public btjh() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "generic_worker_queue._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btil
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btin
        };
        btji btjiVar = new btji(m.a());
        this.a = btjiVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        dtqsVar2.a = "generic_worker_queue.worker_type";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btiq
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btir
        };
        btji btjiVar2 = new btji(m2.a());
        this.b = btjiVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "generic_worker_queue.item_table_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btis
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btit
        };
        btji btjiVar3 = new btji(m3.a());
        this.c = btjiVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "generic_worker_queue.item_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: btiu
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btiv
        };
        btji btjiVar4 = new btji(m4.a());
        this.d = btjiVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "generic_worker_queue.account_id";
        m5.i(39020);
        dtqsVar5.d = new Supplier() { // from class: btix
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: btiy
        };
        btji btjiVar5 = new btji(m5.a());
        this.e = btjiVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        m6.d(true);
        dtqsVar6.a = "generic_worker_queue.in_flight";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: btiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: btiz
        };
        btji btjiVar6 = new btji(m6.a());
        this.f = btjiVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "generic_worker_queue.retry_count";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: btja
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: btjb
        };
        btji btjiVar7 = new btji(m7.a());
        this.g = btjiVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "generic_worker_queue.flags";
        m8.i(32000);
        dtqsVar8.d = new Supplier() { // from class: btjc
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: btjd
        };
        btji btjiVar8 = new btji(m8.a());
        this.h = btjiVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        m9.d(true);
        dtqsVar9.a = "generic_worker_queue.next_execute_timestamp";
        m9.i(34000);
        dtqsVar9.d = new Supplier() { // from class: btje
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: btjf
        };
        btji btjiVar9 = new btji(m9.a());
        this.i = btjiVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "generic_worker_queue.trigger_name";
        m10.i(59700);
        dtqsVar10.d = new Supplier() { // from class: btjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: btim
        };
        btji btjiVar10 = new btji(m10.a());
        this.j = btjiVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 2;
        dtqsVar11.a = "generic_worker_queue.enqueued_timestamp";
        m11.i(59970);
        dtqsVar11.d = new Supplier() { // from class: btio
            @Override // java.util.function.Supplier
            public final Object get() {
                return btki.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: btip
        };
        btji btjiVar11 = new btji(m11.a());
        this.k = btjiVar11;
        this.l = new btji[]{btjiVar, btjiVar2, btjiVar3, btjiVar4, btjiVar5, btjiVar6, btjiVar7, btjiVar8, btjiVar9, btjiVar10, btjiVar11};
    }
}
