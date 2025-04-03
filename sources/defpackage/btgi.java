package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btgi {
    public final btgj a;
    public final btgj b;
    public final btgj c;
    final btgj[] d;

    public btgi() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: btga
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "gemini_conversation_id_mappings.conversation_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btgb
            @Override // java.util.function.Supplier
            public final Object get() {
                return btgy.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btgc
        };
        btgj btgjVar = new btgj(m.a());
        this.a = btgjVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return azoi.c.a;
            }
        };
        dtqsVar2.a = "gemini_conversation_id_mappings.my_identity_token";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btge
            @Override // java.util.function.Supplier
            public final Object get() {
                return btgy.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btgf
        };
        btgj btgjVar2 = new btgj(m2.a());
        this.b = btgjVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        m3.l(true);
        m3.k(true);
        m3.d(true);
        dtqsVar3.a = "gemini_conversation_id_mappings.gemini_conversation_id";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btgg
            @Override // java.util.function.Supplier
            public final Object get() {
                return btgy.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btgh
        };
        btgj btgjVar3 = new btgj(m3.a());
        this.c = btgjVar3;
        this.d = new btgj[]{btgjVar, btgjVar2, btgjVar3};
    }
}
