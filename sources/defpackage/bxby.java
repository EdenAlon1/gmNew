package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxby {
    public final bxbz a;
    public final bxbz b;
    public final bxbz c;
    public final bxbz d;
    public final bxbz e;
    final bxbz[] f;

    public bxby() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "reminders._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxct.d();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxbr
        };
        bxbz bxbzVar = new bxbz(m.a());
        this.a = bxbzVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bxbs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "reminders.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxbt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxct.d();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxbu
        };
        bxbz bxbzVar2 = new bxbz(m2.a());
        this.b = bxbzVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bxbv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar3.a = "reminders.conversation_id";
        m3.i(35070);
        dtqsVar3.d = new Supplier() { // from class: bxbw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxct.d();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxbx
        };
        bxbz bxbzVar3 = new bxbz(m3.a());
        this.c = bxbzVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.d(true);
        dtqsVar4.a = "reminders.trigger_time";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxct.d();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxbo
        };
        bxbz bxbzVar4 = new bxbz(m4.a());
        this.d = bxbzVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "reminders.status";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bxbp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxct.d();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxbq
        };
        bxbz bxbzVar5 = new bxbz(m5.a());
        this.e = bxbzVar5;
        this.f = new bxbz[]{bxbzVar, bxbzVar2, bxbzVar3, bxbzVar4, bxbzVar5};
    }
}
