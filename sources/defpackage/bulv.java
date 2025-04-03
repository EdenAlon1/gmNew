package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bulv {
    public final bulw a;
    public final bulw b;
    final bulw[] c;

    public bulv() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_star._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bulq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bumm.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bulr
        };
        bulw bulwVar = new bulw(m.a());
        this.a = bulwVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: buls
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_star.message_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bult
            @Override // java.util.function.Supplier
            public final Object get() {
                return bumm.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bulu
        };
        bulw bulwVar2 = new bulw(m2.a());
        this.b = bulwVar2;
        this.c = new bulw[]{bulwVar, bulwVar2};
    }
}
