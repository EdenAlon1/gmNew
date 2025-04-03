package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brue {
    public final bruf a;
    public final bruf b;
    public final bruf c;
    public final bruf d;
    public final bruf e;
    public final bruf f;
    public final bruf g;
    public final bruf h;
    public final bruf i;
    final bruf[] j;

    public brue() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_participants_audit_log._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: brtm
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: brud
        };
        bruf brufVar = new bruf(m.a());
        this.a = brufVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        dtqsVar2.a = "conversation_participants_audit_log.operation_datetime";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: brtn
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: brto
        };
        bruf brufVar2 = new bruf(m2.a());
        this.b = brufVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "conversation_participants_audit_log.operation_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: brtp
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: brtq
        };
        bruf brufVar3 = new bruf(m3.a());
        this.c = brufVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "conversation_participants_audit_log.conversation_participants_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: brtr
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: brts
        };
        bruf brufVar4 = new bruf(m4.a());
        this.d = brufVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        m5.k(true);
        dtqsVar5.a = "conversation_participants_audit_log.conversation_id";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: brtt
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: brtu
        };
        bruf brufVar5 = new bruf(m5.a());
        this.e = brufVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        m6.k(true);
        dtqsVar6.a = "conversation_participants_audit_log.participant_id";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: brtv
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: brtw
        };
        bruf brufVar6 = new bruf(m6.a());
        this.f = brufVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        dtqsVar7.a = "conversation_participants_audit_log.is_normalized";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: brtx
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: brty
        };
        bruf brufVar7 = new bruf(m7.a());
        this.g = brufVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "conversation_participants_audit_log.rcs_group_join_status";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: brtz
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: brua
        };
        bruf brufVar8 = new bruf(m8.a());
        this.h = brufVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "conversation_participants_audit_log.last_modified_by_key";
        m9.i(59440);
        dtqsVar9.d = new Supplier() { // from class: brub
            @Override // java.util.function.Supplier
            public final Object get() {
                return brux.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bruc
        };
        bruf brufVar9 = new bruf(m9.a());
        this.i = brufVar9;
        this.j = new bruf[]{brufVar, brufVar2, brufVar3, brufVar4, brufVar5, brufVar6, brufVar7, brufVar8, brufVar9};
    }
}
