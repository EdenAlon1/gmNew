package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbsv {
    public final bbsw a;
    public final bbsw b;
    public final bbsw c;
    public final bbsw d;
    public final bbsw e;
    public final bbsw f;
    final bbsw[] g;

    public bbsv() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_reactions_backup._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bbsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbtp.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bbsq
        };
        bbsw bbswVar = new bbsw(m.a());
        this.a = bbswVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bbsr
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcba.c.a;
            }
        };
        dtqsVar2.a = "message_reactions_backup.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bbss
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbtp.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bbst
        };
        bbsw bbswVar2 = new bbsw(m2.a());
        this.b = bbswVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 5;
        dtqsVar3.a = "message_reactions_backup.reactions_data";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bbsu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbtp.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bbsi
        };
        bbsw bbswVar3 = new bbsw(m3.a());
        this.c = bbswVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.d(true);
        m4.e(true);
        dtqsVar4.b = new Supplier() { // from class: bbsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcba.c.a;
            }
        };
        dtqsVar4.a = "message_reactions_backup.reacted_message_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bbsk
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbtp.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bbsl
        };
        bbsw bbswVar4 = new bbsw(m4.a());
        this.d = bbswVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "message_reactions_backup.reaction";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bbsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbtp.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bbsn
        };
        bbsw bbswVar5 = new bbsw(m5.a());
        this.e = bbswVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        dtqsVar6.a = "message_reactions_backup.applied_reaction";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bbso
            @Override // java.util.function.Supplier
            public final Object get() {
                return bbtp.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bbsp
        };
        bbsw bbswVar6 = new bbsw(m6.a());
        this.f = bbswVar6;
        this.g = new bbsw[]{bbswVar, bbswVar2, bbswVar3, bbswVar4, bbswVar5, bbswVar6};
    }
}
