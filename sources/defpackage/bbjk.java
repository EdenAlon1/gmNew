package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbjk {
    public final bbjl a;
    public final bbjl b;
    public final bbjl c;
    public final bbjl d;
    public final bbjl e;
    public final bbjl f;
    final bbjl[] g;

    public bbjk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "conversation_participants_backup._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bbiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbke.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bbjf
        };
        bbjl bbjlVar = new bbjl(m.a());
        this.a = bbjlVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bbjg
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbov.c.a;
            }
        };
        dtqsVar2.a = "conversation_participants_backup.conversation_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bbjh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbke.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bbji
        };
        bbjl bbjlVar2 = new bbjl(m2.a());
        this.b = bbjlVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bbjj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcjh.c.a;
            }
        };
        dtqsVar3.a = "conversation_participants_backup.participant_id";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bbix
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbke.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bbiy
        };
        bbjl bbjlVar3 = new bbjl(m3.a());
        this.c = bbjlVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "conversation_participants_backup.is_normalized";
        m4.i(0);
        dtqsVar4.d = new Supplier() { // from class: bbiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbke.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bbja
        };
        bbjl bbjlVar4 = new bbjl(m4.a());
        this.d = bbjlVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "conversation_participants_backup.rcs_group_join_status";
        m5.i(0);
        dtqsVar5.d = new Supplier() { // from class: bbjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbke.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bbjc
        };
        bbjl bbjlVar5 = new bbjl(m5.a());
        this.e = bbjlVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        m6.d(true);
        dtqsVar6.a = "conversation_participants_backup.is_c2p_only";
        m6.i(70);
        dtqsVar6.d = new Supplier() { // from class: bbjd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbke.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bbje
        };
        bbjl bbjlVar6 = new bbjl(m6.a());
        this.f = bbjlVar6;
        this.g = new bbjl[]{bbjlVar, bbjlVar2, bbjlVar3, bbjlVar4, bbjlVar5, bbjlVar6};
    }
}
