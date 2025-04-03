package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bscz {
    public final bsda a;
    public final bsda b;
    public final bsda c;
    public final bsda d;
    final bsda[] e;

    public bscz() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bscp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "conversation_to_participants.conversation_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bscq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsdr.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bscr
        };
        bsda bsdaVar = new bsda(m.a());
        this.a = bsdaVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bscs
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar2.a = "conversation_to_participants.participant_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bsct
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsdr.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bscu
        };
        bsda bsdaVar2 = new bsda(m2.a());
        this.b = bsdaVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.k(true);
        dtqsVar3.a = "conversation_to_participants.rcs_group_join_status";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bscv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsdr.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bscw
        };
        bsda bsdaVar3 = new bsda(m3.a());
        this.c = bsdaVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "conversation_to_participants.last_modified_by_key";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bscx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsdr.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bscy
        };
        bsda bsdaVar4 = new bsda(m4.a());
        this.d = bsdaVar4;
        this.e = new bsda[]{bsdaVar, bsdaVar2, bsdaVar3, bsdaVar4};
    }
}
