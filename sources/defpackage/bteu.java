package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bteu {
    public final btev a;
    public final btev b;
    public final btev c;
    public final btev d;
    public final btev e;
    public final btev f;
    final btev[] g;

    public bteu() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "flagged_messages._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bteh
            @Override // java.util.function.Supplier
            public final Object get() {
                return btfo.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bteo
        };
        btev btevVar = new btev(m.a());
        this.a = btevVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btep
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "flagged_messages.flagged_message_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bteq
            @Override // java.util.function.Supplier
            public final Object get() {
                return btfo.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bter
        };
        btev btevVar2 = new btev(m2.a());
        this.b = btevVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        dtqsVar3.a = "flagged_messages.flagging_reason";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btes
            @Override // java.util.function.Supplier
            public final Object get() {
                return btfo.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btet
        };
        btev btevVar3 = new btev(m3.a());
        this.c = btevVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "flagged_messages.flagged_message_timestamp";
        m4.i(39030);
        dtqsVar4.d = new Supplier() { // from class: btei
            @Override // java.util.function.Supplier
            public final Object get() {
                return btfo.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btej
        };
        btev btevVar4 = new btev(m4.a());
        this.d = btevVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "flagged_messages.flagged_message_notified";
        m5.i(46030);
        dtqsVar5.d = new Supplier() { // from class: btek
            @Override // java.util.function.Supplier
            public final Object get() {
                return btfo.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: btel
        };
        btev btevVar5 = new btev(m5.a());
        this.e = btevVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        dtqsVar6.a = "flagged_messages.flagged_message_delay";
        m6.i(60710);
        dtqsVar6.d = new Supplier() { // from class: btem
            @Override // java.util.function.Supplier
            public final Object get() {
                return btfo.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bten
        };
        btev btevVar6 = new btev(m6.a());
        this.f = btevVar6;
        this.g = new btev[]{btevVar, btevVar2, btevVar3, btevVar4, btevVar5, btevVar6};
    }
}
