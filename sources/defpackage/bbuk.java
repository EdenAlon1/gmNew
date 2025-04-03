package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbuk {
    public final bbul a;
    public final bbul b;
    public final bbul c;
    public final bbul d;
    final bbul[] e;

    public bbuk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bbua
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcba.c.a;
            }
        };
        dtqsVar.a = "message_replies_backup.message_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bbub
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbvc.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bbuc
        };
        bbul bbulVar = new bbul(m.a());
        this.a = bbulVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bbud
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcba.c.a;
            }
        };
        dtqsVar2.a = "message_replies_backup.replied_to_message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bbue
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbvc.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bbuf
        };
        bbul bbulVar2 = new bbul(m2.a());
        this.b = bbulVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        dtqsVar3.a = "message_replies_backup.replied_to_message_id_null_reason";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bbug
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbvc.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bbuh
        };
        bbul bbulVar3 = new bbul(m3.a());
        this.c = bbulVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.d(true);
        dtqsVar4.a = "message_replies_backup.replied_to_rcs_message_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bbui
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbvc.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bbuj
        };
        bbul bbulVar4 = new bbul(m4.a());
        this.d = bbulVar4;
        this.e = new bbul[]{bbulVar, bbulVar2, bbulVar3, bbulVar4};
    }
}
