package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbi {
    public final bsbj a;
    public final bsbj b;
    public final bsbj c;
    public final bsbj d;
    public final bsbj e;
    public final bsbj f;
    public final bsbj g;
    final bsbj[] h;

    public bsbi() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_to_participants_audit_log._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bsau
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsbx.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bsbd
        };
        bsbj bsbjVar = new bsbj(m.a());
        this.a = bsbjVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        dtqsVar2.a = "conversation_to_participants_audit_log.operation_datetime";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bsbe
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsbx.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bsbf
        };
        bsbj bsbjVar2 = new bsbj(m2.a());
        this.b = bsbjVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "conversation_to_participants_audit_log.operation_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bsbg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsbx.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bsbh
        };
        bsbj bsbjVar3 = new bsbj(m3.a());
        this.c = bsbjVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.k(true);
        dtqsVar4.a = "conversation_to_participants_audit_log.conversation_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bsav
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsbx.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bsaw
        };
        bsbj bsbjVar4 = new bsbj(m4.a());
        this.d = bsbjVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        m5.k(true);
        dtqsVar5.a = "conversation_to_participants_audit_log.participant_id";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bsax
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsbx.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bsay
        };
        bsbj bsbjVar5 = new bsbj(m5.a());
        this.e = bsbjVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        dtqsVar6.a = "conversation_to_participants_audit_log.rcs_group_join_status";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bsaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsbx.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bsba
        };
        bsbj bsbjVar6 = new bsbj(m6.a());
        this.f = bsbjVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "conversation_to_participants_audit_log.last_modified_by_key";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bsbb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsbx.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bsbc
        };
        bsbj bsbjVar7 = new bsbj(m7.a());
        this.g = bsbjVar7;
        this.h = new bsbj[]{bsbjVar, bsbjVar2, bsbjVar3, bsbjVar4, bsbjVar5, bsbjVar6, bsbjVar7};
    }
}
