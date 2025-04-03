package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btyh {
    public final btyi a;
    public final btyi b;
    public final btyi c;
    public final btyi d;
    public final btyi e;
    final btyi[] f;

    public btyh() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: btxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "message_edits.message_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btya
            @Override // java.util.function.Supplier
            public final Object get() {
                return btza.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btyb
        };
        btyi btyiVar = new btyi(m.a());
        this.a = btyiVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btyc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_edits.latest_message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return btza.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btye
        };
        btyi btyiVar2 = new btyi(m2.a());
        this.b = btyiVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.d(true);
        dtqsVar3.a = "message_edits.original_rcs_message_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return btza.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btyg
        };
        btyi btyiVar3 = new btyi(m3.a());
        this.c = btyiVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "message_edits.edited_at_timestamp_ms";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: btxw
            @Override // java.util.function.Supplier
            public final Object get() {
                return btza.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btxx
        };
        btyi btyiVar4 = new btyi(m4.a());
        this.d = btyiVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "message_edits.received_at_timestamp_ms";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: btxy
            @Override // java.util.function.Supplier
            public final Object get() {
                return btza.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: btxz
        };
        btyi btyiVar5 = new btyi(m5.a());
        this.e = btyiVar5;
        this.f = new btyi[]{btyiVar, btyiVar2, btyiVar3, btyiVar4, btyiVar5};
    }
}
