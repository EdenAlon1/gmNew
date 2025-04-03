package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cohy {
    public final cohz a;
    public final cohz b;
    public final cohz c;
    public final cohz d;
    public final cohz e;
    public final cohz f;
    final cohz[] g;

    public cohy() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "scheduled_send._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cohk
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dtqsVar.c = new dtsc() { // from class: coht
        };
        cohz cohzVar = new cohz(m.a());
        this.a = cohzVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: cohu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "scheduled_send.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cohv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cohw
        };
        cohz cohzVar2 = new cohz(m2.a());
        this.b = cohzVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: cohx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar3.a = "scheduled_send.conversation_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cohl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cohm
        };
        cohz cohzVar3 = new cohz(m3.a());
        this.c = cohzVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "scheduled_send.scheduled_time";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cohn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: coho
        };
        cohz cohzVar4 = new cohz(m4.a());
        this.d = cohzVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.d(true);
        dtqsVar5.a = "scheduled_send.status";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: cohp
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cohq
        };
        cohz cohzVar5 = new cohz(m5.a());
        this.e = cohzVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        m6.k(true);
        dtqsVar6.a = "scheduled_send.creation_time";
        m6.i(58020);
        dtqsVar6.d = new Supplier() { // from class: cohr
            @Override // java.util.function.Supplier
            public final Object get() {
                return ScheduledSendTable.c();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: cohs
        };
        cohz cohzVar6 = new cohz(m6.a());
        this.f = cohzVar6;
        this.g = new cohz[]{cohzVar, cohzVar2, cohzVar3, cohzVar4, cohzVar5, cohzVar6};
    }
}
