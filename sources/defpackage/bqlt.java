package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqlt {
    public final bqlu a;
    public final bqlu b;
    public final bqlu c;
    public final bqlu d;
    public final bqlu e;
    final bqlu[] f;

    public bqlt() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "cms_deleted_messages_buffer._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bqlj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmm.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bqlk
        };
        bqlu bqluVar = new bqlu(m.a());
        this.a = bqluVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        dtqsVar2.a = "cms_deleted_messages_buffer.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bqll
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmm.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bqlm
        };
        bqlu bqluVar2 = new bqlu(m2.a());
        this.b = bqluVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "cms_deleted_messages_buffer.conversation_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bqln
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmm.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bqlo
        };
        bqlu bqluVar3 = new bqlu(m3.a());
        this.c = bqluVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.k(true);
        dtqsVar4.a = "cms_deleted_messages_buffer.message_deletion_reason";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bqlp
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmm.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bqlq
        };
        bqlu bqluVar4 = new bqlu(m4.a());
        this.d = bqluVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.k(true);
        dtqsVar5.a = "cms_deleted_messages_buffer.deletion_timestamp";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bqlr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bqmm.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bqls
        };
        bqlu bqluVar5 = new bqlu(m5.a());
        this.e = bqluVar5;
        this.f = new bqlu[]{bqluVar, bqluVar2, bqluVar3, bqluVar4, bqluVar5};
    }
}
