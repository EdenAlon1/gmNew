package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bubn {
    public final bubo a;
    public final bubo b;
    final bubo[] c;

    public bubn() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bubi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "message_photos_sharing.message_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bubj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bucb.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bubk
        };
        bubo buboVar = new bubo(m.a());
        this.a = buboVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 5;
        m2.k(true);
        dtqsVar2.a = "message_photos_sharing.sharing_state";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bubl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bucb.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bubm
        };
        bubo buboVar2 = new bubo(m2.a());
        this.b = buboVar2;
        this.c = new bubo[]{buboVar, buboVar2};
    }
}
