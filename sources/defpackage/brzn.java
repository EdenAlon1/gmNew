package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brzn {
    public final brzo a;
    public final brzo b;
    public final brzo c;
    public final brzo d;
    public final brzo e;
    public final brzo f;
    public final brzo g;
    public final brzo h;
    public final brzo i;
    public final brzo j;
    final brzo[] k;

    public brzn() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_suggestions._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: brys
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bryu
        };
        brzo brzoVar = new brzo(m.a());
        this.a = brzoVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bryw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "conversation_suggestions.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bryx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bryy
        };
        brzo brzoVar2 = new brzo(m2.a());
        this.b = brzoVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "conversation_suggestions.conversation_suggestion_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bryz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: brza
        };
        brzo brzoVar3 = new brzo(m3.a());
        this.c = brzoVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "conversation_suggestions.properties";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: brzb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: brzc
        };
        brzo brzoVar4 = new brzo(m4.a());
        this.d = brzoVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "conversation_suggestions.post_back_data";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: brze
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: brzd
        };
        brzo brzoVar5 = new brzo(m5.a());
        this.e = brzoVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "conversation_suggestions.post_back_encoding";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: brzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: brzg
        };
        brzo brzoVar6 = new brzo(m6.a());
        this.f = brzoVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "conversation_suggestions.rcs_message_id";
        m7.i(11001);
        dtqsVar7.d = new Supplier() { // from class: brzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: brzi
        };
        brzo brzoVar7 = new brzo(m7.a());
        this.g = brzoVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        m8.d(true);
        dtqsVar8.a = "conversation_suggestions.target_rcs_message_id";
        m8.i(12000);
        dtqsVar8.d = new Supplier() { // from class: brzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: brzk
        };
        brzo brzoVar8 = new brzo(m8.a());
        this.h = brzoVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        dtqsVar9.a = "conversation_suggestions.read";
        m9.i(12000);
        dtqsVar9.d = new Supplier() { // from class: brzl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: brzm
        };
        brzo brzoVar9 = new brzo(m9.a());
        this.i = brzoVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "conversation_suggestions.received_timestamp";
        m10.i(12000);
        dtqsVar10.d = new Supplier() { // from class: bryt
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsam.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bryv
        };
        brzo brzoVar10 = new brzo(m10.a());
        this.j = brzoVar10;
        this.k = new brzo[]{brzoVar, brzoVar2, brzoVar3, brzoVar4, brzoVar5, brzoVar6, brzoVar7, brzoVar8, brzoVar9, brzoVar10};
    }
}
