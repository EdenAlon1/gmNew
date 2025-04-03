package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqt {
    public final bxqu a;
    public final bxqu b;
    final bxqu[] c;

    public bxqt() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bxqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "satellite_emergency_details.message_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxqp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxre.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxqq
        };
        bxqu bxquVar = new bxqu(m.a());
        this.a = bxquVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        dtqsVar2.a = "satellite_emergency_details.help_state";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxre.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxqs
        };
        bxqu bxquVar2 = new bxqu(m2.a());
        this.b = bxquVar2;
        this.c = new bxqu[]{bxquVar, bxquVar2};
    }
}
