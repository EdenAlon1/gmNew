package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bttw {
    public final bttx a;
    public final bttx b;
    final bttx[] c;

    public bttw() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bttr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "message_captions.message_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btts
            @Override // java.util.function.Supplier
            public final Object get() {
                return btul.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bttt
        };
        bttx bttxVar = new bttx(m.a());
        this.a = bttxVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.k(true);
        dtqsVar2.a = "message_captions.caption";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bttu
            @Override // java.util.function.Supplier
            public final Object get() {
                return btul.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bttv
        };
        bttx bttxVar2 = new bttx(m2.a());
        this.b = bttxVar2;
        this.c = new bttx[]{bttxVar, bttxVar2};
    }
}
