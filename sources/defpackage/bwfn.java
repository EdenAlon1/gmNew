package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfn {
    public final bwfo a;
    public final bwfo b;
    public final bwfo c;
    public final bwfo d;
    public final bwfo e;
    public final bwfo f;
    public final bwfo g;
    public final bwfo h;
    public final bwfo i;
    public final bwfo j;
    public final bwfo k;
    public final bwfo l;
    public final bwfo m;
    public final bwfo n;
    public final bwfo o;
    public final bwfo p;
    public final bwfo q;
    public final bwfo r;
    public final bwfo s;
    final bwfo[] t;

    public bwfn() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "pending_incoming_message_rcs_table.rcs_message_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bweb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bwed
        };
        bwfo bwfoVar = new bwfo(m.a());
        this.a = bwfoVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "pending_incoming_message_rcs_table.remote_user_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bwep
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bwez
        };
        bwfo bwfoVar2 = new bwfo(m2.a());
        this.b = bwfoVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "pending_incoming_message_rcs_table.self_identity";
        m3.i(59410);
        dtqsVar3.d = new Supplier() { // from class: bwfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bwfb
        };
        bwfo bwfoVar3 = new bwfo(m3.a());
        this.c = bwfoVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "pending_incoming_message_rcs_table.raw_text";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwfc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwfd
        };
        bwfo bwfoVar4 = new bwfo(m4.a());
        this.d = bwfoVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        dtqsVar5.a = "pending_incoming_message_rcs_table.content_type";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bwfe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bwff
        };
        bwfo bwfoVar5 = new bwfo(m5.a());
        this.e = bwfoVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "pending_incoming_message_rcs_table.remote_instance";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bwem
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwex
        };
        bwfo bwfoVar6 = new bwfo(m6.a());
        this.f = bwfoVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "pending_incoming_message_rcs_table.sent_timestamp";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bwfg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bwfh
        };
        bwfo bwfoVar7 = new bwfo(m7.a());
        this.g = bwfoVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        m8.d(true);
        dtqsVar8.a = "pending_incoming_message_rcs_table.received_timestamp";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bwfi
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bwfj
        };
        bwfo bwfoVar8 = new bwfo(m8.a());
        this.h = bwfoVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "pending_incoming_message_rcs_table.sip_alias";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bwfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bwfl
        };
        bwfo bwfoVar9 = new bwfo(m9.a());
        this.i = bwfoVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 2;
        dtqsVar10.a = "pending_incoming_message_rcs_table.spam_verdict";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: bwfm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bwec
        };
        bwfo bwfoVar10 = new bwfo(m10.a());
        this.j = bwfoVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 2;
        dtqsVar11.a = "pending_incoming_message_rcs_table.session_id";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: bwee
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bwef
        };
        bwfo bwfoVar11 = new bwfo(m11.a());
        this.k = bwfoVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 2;
        dtqsVar12.a = "pending_incoming_message_rcs_table.message_status";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: bweg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bweh
        };
        bwfo bwfoVar12 = new bwfo(m12.a());
        this.l = bwfoVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 5;
        dtqsVar13.a = "pending_incoming_message_rcs_table.custom_headers";
        m13.i(44020);
        dtqsVar13.d = new Supplier() { // from class: bwei
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bwej
        };
        bwfo bwfoVar13 = new bwfo(m13.a());
        this.m = bwfoVar13;
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 2;
        dtqsVar14.a = "pending_incoming_message_rcs_table.is_group";
        m14.i(58820);
        dtqsVar14.d = new Supplier() { // from class: bwek
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bwel
        };
        bwfo bwfoVar14 = new bwfo(m14.a());
        this.n = bwfoVar14;
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 4;
        dtqsVar15.a = "pending_incoming_message_rcs_table.conversation_id";
        m15.i(58820);
        dtqsVar15.d = new Supplier() { // from class: bwen
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bweo
        };
        bwfo bwfoVar15 = new bwfo(m15.a());
        this.o = bwfoVar15;
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 4;
        dtqsVar16.a = "pending_incoming_message_rcs_table.conference_uri";
        m16.i(58820);
        dtqsVar16.d = new Supplier() { // from class: bweq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bwer
        };
        bwfo bwfoVar16 = new bwfo(m16.a());
        this.p = bwfoVar16;
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 2;
        m17.k(true);
        dtqsVar17.a = "pending_incoming_message_rcs_table.is_delivery_report_requested";
        m17.i(58870);
        dtqsVar17.d = new Supplier() { // from class: bwes
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bwet
        };
        bwfo bwfoVar17 = new bwfo(m17.a());
        this.q = bwfoVar17;
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 2;
        m18.k(true);
        dtqsVar18.a = "pending_incoming_message_rcs_table.is_display_report_requested";
        m18.i(58870);
        dtqsVar18.d = new Supplier() { // from class: bweu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bwev
        };
        bwfo bwfoVar18 = new bwfo(m18.a());
        this.r = bwfoVar18;
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 2;
        m19.k(true);
        dtqsVar19.a = "pending_incoming_message_rcs_table.is_negative_delivery_report_requested";
        m19.i(60560);
        dtqsVar19.d = new Supplier() { // from class: bwew
            @Override // java.util.function.Supplier
            public final Object get() {
                return bwgw.b();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bwey
        };
        bwfo bwfoVar19 = new bwfo(m19.a());
        this.s = bwfoVar19;
        this.t = new bwfo[]{bwfoVar, bwfoVar2, bwfoVar3, bwfoVar4, bwfoVar5, bwfoVar6, bwfoVar7, bwfoVar8, bwfoVar9, bwfoVar10, bwfoVar11, bwfoVar12, bwfoVar13, bwfoVar14, bwfoVar15, bwfoVar16, bwfoVar17, bwfoVar18, bwfoVar19};
    }
}
