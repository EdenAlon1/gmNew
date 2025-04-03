package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvg {
    public final bwvh a;
    public final bwvh b;
    public final bwvh c;
    public final bwvh d;
    public final bwvh e;
    public final bwvh f;
    final bwvh[] g;

    public bwvg() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "read_reports._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bwus
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwvy.c();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwvb
        };
        bwvh bwvhVar = new bwvh(m.a());
        this.a = bwvhVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bwvc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "read_reports.message_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwvy.c();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwve
        };
        bwvh bwvhVar2 = new bwvh(m2.a());
        this.b = bwvhVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.k(true);
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bwvf
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "read_reports.participant_id";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bwut
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwvy.c();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwuu
        };
        bwvh bwvhVar3 = new bwvh(m3.a());
        this.c = bwvhVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "read_reports.receive_time";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwuv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwvy.c();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwuw
        };
        bwvh bwvhVar4 = new bwvh(m4.a());
        this.d = bwvhVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "read_reports.read_time";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bwux
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwvy.c();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bwuy
        };
        bwvh bwvhVar5 = new bwvh(m5.a());
        this.e = bwvhVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "read_reports.ftd_time";
        m6.i(58880);
        dtqsVar6.d = new Supplier() { // from class: bwuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwvy.c();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwva
        };
        bwvh bwvhVar6 = new bwvh(m6.a());
        this.f = bwvhVar6;
        this.g = new bwvh[]{bwvhVar, bwvhVar2, bwvhVar3, bwvhVar4, bwvhVar5, bwvhVar6};
    }
}
