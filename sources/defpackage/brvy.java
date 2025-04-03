package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brvy {
    public final brvz a;
    public final brvz b;
    public final brvz c;
    public final brvz d;
    public final brvz e;
    public final brvz f;
    final brvz[] g;

    public brvy() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_participants._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: brvk
            @Override // java.util.function.Supplier
            public final Object get() {
                return brww.c();
            }
        };
        dtqsVar.c = new dtsc() { // from class: brvt
        };
        brvz brvzVar = new brvz(m.a());
        this.a = brvzVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: brvu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "conversation_participants.conversation_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: brvv
            @Override // java.util.function.Supplier
            public final Object get() {
                return brww.c();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: brvw
        };
        brvz brvzVar2 = new brvz(m2.a());
        this.b = brvzVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: brvx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "conversation_participants.participant_id";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: brvl
            @Override // java.util.function.Supplier
            public final Object get() {
                return brww.c();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: brvm
        };
        brvz brvzVar3 = new brvz(m3.a());
        this.c = brvzVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.d(true);
        dtqsVar4.a = "conversation_participants.is_normalized";
        m4.f(true);
        m4.i(58090);
        dtqsVar4.d = new Supplier() { // from class: brvn
            @Override // java.util.function.Supplier
            public final Object get() {
                return brww.c();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: brvo
        };
        brvz brvzVar4 = new brvz(m4.a());
        this.d = brvzVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "conversation_participants.rcs_group_join_status";
        m5.i(58570);
        dtqsVar5.d = new Supplier() { // from class: brvp
            @Override // java.util.function.Supplier
            public final Object get() {
                return brww.c();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: brvq
        };
        brvz brvzVar5 = new brvz(m5.a());
        this.e = brvzVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "conversation_participants.last_modified_by_key";
        m6.i(59440);
        dtqsVar6.d = new Supplier() { // from class: brvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return brww.c();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: brvs
        };
        brvz brvzVar6 = new brvz(m6.a());
        this.f = brvzVar6;
        this.g = new brvz[]{brvzVar, brvzVar2, brvzVar3, brvzVar4, brvzVar5, brvzVar6};
    }
}
