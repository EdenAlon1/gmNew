package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bysq {
    public final bysr a;
    public final bysr b;
    public final bysr c;
    public final bysr d;
    final bysr[] e;

    public bysq() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "user_references._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bysg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bytk.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bysh
        };
        bysr bysrVar = new bysr(m.a());
        this.a = bysrVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bysi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "user_references.message_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bysj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bytk.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bysk
        };
        bysr bysrVar2 = new bysr(m2.a());
        this.b = bysrVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bysl
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "user_references.user_ref_id";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bysm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bytk.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bysn
        };
        bysr bysrVar3 = new bysr(m3.a());
        this.c = bysrVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "user_references.user_ref_datetime";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: byso
            @Override // java.util.function.Supplier
            public final Object get() {
                return bytk.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bysp
        };
        bysr bysrVar4 = new bysr(m4.a());
        this.d = bysrVar4;
        this.e = new bysr[]{bysrVar, bysrVar2, bysrVar3, bysrVar4};
    }
}
