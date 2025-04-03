package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqar {
    public final bqas a;
    public final bqas b;
    public final bqas c;
    public final bqas d;
    final bqas[] e;

    public bqar() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bqai
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar.a = "a2p_conversation_subscriptions.participant_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqaj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqbh.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqak
        };
        bqas bqasVar = new bqas(m.a());
        this.a = bqasVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        dtqsVar2.a = "a2p_conversation_subscriptions.conversation_toolstone_state";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqal
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqbh.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqam
        };
        bqas bqasVar2 = new bqas(m2.a());
        this.b = bqasVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        dtqsVar3.a = "a2p_conversation_subscriptions.conversation_subscription_state";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqan
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqbh.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqao
        };
        bqas bqasVar3 = new bqas(m3.a());
        this.c = bqasVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "a2p_conversation_subscriptions.last_action_timestamp";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqap
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqbh.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqaq
        };
        bqas bqasVar4 = new bqas(m4.a());
        this.d = bqasVar4;
        this.e = new bqas[]{bqasVar, bqasVar2, bqasVar3, bqasVar4};
    }
}
