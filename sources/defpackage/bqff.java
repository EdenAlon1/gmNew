package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqff {
    public final bqfg a;
    public final bqfg b;
    public final bqfg c;
    public final bqfg d;
    public final bqfg e;
    public final bqfg f;
    final bqfg[] g;

    public bqff() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "business_conversations_metadata._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqes
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfx.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqez
        };
        bqfg bqfgVar = new bqfg(m.a());
        this.a = bqfgVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bqfa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar2.a = "business_conversations_metadata.conversation_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqfb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfx.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqfc
        };
        bqfg bqfgVar2 = new bqfg(m2.a());
        this.b = bqfgVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "business_conversations_metadata.chatbot_directory_conversation_state";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqfd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfx.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqfe
        };
        bqfg bqfgVar3 = new bqfg(m3.a());
        this.c = bqfgVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "business_conversations_metadata.conversation_stop_state";
        m4.i(59010);
        dtqsVar4.d = new Supplier() { // from class: bqet
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfx.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqeu
        };
        bqfg bqfgVar4 = new bqfg(m4.a());
        this.d = bqfgVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "business_conversations_metadata.conversation_toolstone_state";
        m5.i(59050);
        dtqsVar5.d = new Supplier() { // from class: bqev
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfx.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqew
        };
        bqfg bqfgVar5 = new bqfg(m5.a());
        this.e = bqfgVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "business_conversations_metadata.conversation_toolstone_timestamp_ms";
        m6.i(59050);
        dtqsVar6.d = new Supplier() { // from class: bqex
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqfx.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bqey
        };
        bqfg bqfgVar6 = new bqfg(m6.a());
        this.f = bqfgVar6;
        this.g = new bqfg[]{bqfgVar, bqfgVar2, bqfgVar3, bqfgVar4, bqfgVar5, bqfgVar6};
    }
}
