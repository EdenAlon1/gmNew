package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brrd {
    public final brre a;
    public final brre b;
    public final brre c;
    public final brre d;
    public final brre e;
    public final brre f;
    public final brre g;
    public final brre h;
    public final brre i;
    public final brre j;
    public final brre k;
    public final brre l;
    final brre[] m;

    public brrd() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_labels._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: brqc
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: brqe
        };
        brre brreVar = new brre(m.a());
        this.a = brreVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: brqm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "conversation_labels.conversation_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: brqo
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: brqp
        };
        brre brreVar2 = new brre(m2.a());
        this.b = brreVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: brqq
            @Override // java.util.function.Supplier
            public final Object get() {
                return byfi.b.a;
            }
        };
        dtqsVar3.a = "conversation_labels.label";
        m3.f(true);
        m3.i(53020);
        dtqsVar3.d = new Supplier() { // from class: brqr
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: brqs
        };
        brre brreVar3 = new brre(m3.a());
        this.c = brreVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.d(true);
        m4.e(true);
        dtqsVar4.b = new Supplier() { // from class: brqt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar4.a = "conversation_labels.message_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: brqu
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: brqn
        };
        brre brreVar4 = new brre(m4.a());
        this.d = brreVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "conversation_labels.snippet_text";
        m5.i(53010);
        dtqsVar5.d = new Supplier() { // from class: brqv
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: brqw
        };
        brre brreVar5 = new brre(m5.a());
        this.e = brreVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "conversation_labels.preview_uri";
        m6.i(55040);
        dtqsVar6.d = new Supplier() { // from class: brqx
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: brqy
        };
        brre brreVar6 = new brre(m6.a());
        this.f = brreVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "conversation_labels.preview_content_type";
        m7.i(55040);
        dtqsVar7.d = new Supplier() { // from class: brqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: brra
        };
        brre brreVar7 = new brre(m7.a());
        this.g = brreVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "conversation_labels.message_status";
        m8.i(57050);
        dtqsVar8.d = new Supplier() { // from class: brrb
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: brrc
        };
        brre brreVar8 = new brre(m8.a());
        this.h = brreVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 2;
        dtqsVar9.a = "conversation_labels.read";
        m9.i(57050);
        dtqsVar9.d = new Supplier() { // from class: brqd
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: brqf
        };
        brre brreVar9 = new brre(m9.a());
        this.i = brreVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 2;
        dtqsVar10.a = "conversation_labels.received_timestamp";
        m10.i(57050);
        dtqsVar10.d = new Supplier() { // from class: brqg
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: brqh
        };
        brre brreVar10 = new brre(m10.a());
        this.j = brreVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 2;
        dtqsVar11.a = "conversation_labels.message_protocol";
        m11.i(57050);
        dtqsVar11.d = new Supplier() { // from class: brqi
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: brqj
        };
        brre brreVar11 = new brre(m11.a());
        this.k = brreVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 2;
        dtqsVar12.a = "conversation_labels.raw_telephony_status";
        m12.i(57050);
        dtqsVar12.d = new Supplier() { // from class: brqk
            @Override // java.util.function.Supplier
            public final Object get() {
                return brsd.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: brql
        };
        brre brreVar12 = new brre(m12.a());
        this.l = brreVar12;
        this.m = new brre[]{brreVar, brreVar2, brreVar3, brreVar4, brreVar5, brreVar6, brreVar7, brreVar8, brreVar9, brreVar10, brreVar11, brreVar12};
    }
}
