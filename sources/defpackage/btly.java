package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btly {
    public final btlz a;
    public final btlz b;
    public final btlz c;
    public final btlz d;
    public final btlz e;
    public final btlz f;
    public final btlz g;
    public final btlz h;
    public final btlz i;
    final btlz[] j;

    public btly() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "lighter_conversations_table._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btlf
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btlg
        };
        btlz btlzVar = new btlz(m.a());
        this.a = btlzVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btlh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "lighter_conversations_table.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btli
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btlj
        };
        btlz btlzVar2 = new btlz(m2.a());
        this.b = btlzVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.l(true);
        m3.d(true);
        dtqsVar3.a = "lighter_conversations_table.business_id";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btlk
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btll
        };
        btlz btlzVar3 = new btlz(m3.a());
        this.c = btlzVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "lighter_conversations_table.lighter_conversation_id_json";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: btlm
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btln
        };
        btlz btlzVar4 = new btlz(m4.a());
        this.d = btlzVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.d(true);
        dtqsVar5.a = "lighter_conversations_table.read";
        m5.i(58700);
        dtqsVar5.d = new Supplier() { // from class: btlo
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: btlp
        };
        btlz btlzVar5 = new btlz(m5.a());
        this.e = btlzVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "lighter_conversations_table.is_last_message_outgoing";
        m6.i(58810);
        dtqsVar6.d = new Supplier() { // from class: btlq
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: btlr
        };
        btlz btlzVar6 = new btlz(m6.a());
        this.f = btlzVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "lighter_conversations_table.conversation_status";
        m7.i(59030);
        dtqsVar7.d = new Supplier() { // from class: btls
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: btlt
        };
        btlz btlzVar7 = new btlz(m7.a());
        this.g = btlzVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "lighter_conversations_table.last_action_timestamp";
        m8.i(59040);
        dtqsVar8.d = new Supplier() { // from class: btlu
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: btlv
        };
        btlz btlzVar8 = new btlz(m8.a());
        this.h = btlzVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        dtqsVar9.a = "lighter_conversations_table.sync_timestamp_ms";
        m9.i(59100);
        dtqsVar9.d = new Supplier() { // from class: btlw
            @Override // java.util.function.Supplier
            public final Object get() {
                return btmu.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: btlx
        };
        btlz btlzVar9 = new btlz(m9.a());
        this.i = btlzVar9;
        this.j = new btlz[]{btlzVar, btlzVar2, btlzVar3, btlzVar4, btlzVar5, btlzVar6, btlzVar7, btlzVar8, btlzVar9};
    }
}
