package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bujy {
    public final bujz a;
    public final bujz b;
    public final bujz c;
    public final bujz d;
    public final bujz e;
    public final bujz f;
    public final bujz g;
    public final bujz h;
    public final bujz i;
    public final bujz j;
    public final bujz k;
    public final bujz l;
    public final bujz m;
    final bujz[] n;

    public bujy() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_spam._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: buiw
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: buiy
        };
        bujz bujzVar = new bujz(m.a());
        this.a = bujzVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: buji
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_spam.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bujj
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bujk
        };
        bujz bujzVar2 = new bujz(m2.a());
        this.b = bujzVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bujl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar3.a = "message_spam.conversation_id";
        m3.i(59460);
        dtqsVar3.d = new Supplier() { // from class: bujm
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bujn
        };
        bujz bujzVar3 = new bujz(m3.a());
        this.c = bujzVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "message_spam.source";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bujo
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bujp
        };
        bujz bujzVar4 = new bujz(m4.a());
        this.d = bujzVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 3;
        dtqsVar5.a = "message_spam.score";
        m5.i(45040);
        dtqsVar5.d = new Supplier() { // from class: bujh
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bujq
        };
        bujz bujzVar5 = new bujz(m5.a());
        this.e = bujzVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 1;
        dtqsVar6.a = "message_spam.outcome";
        m6.i(58030);
        dtqsVar6.d = new Supplier() { // from class: bujr
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bujs
        };
        bujz bujzVar6 = new bujz(m6.a());
        this.f = bujzVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "message_spam.ares_initiated_by";
        m7.i(58100);
        dtqsVar7.d = new Supplier() { // from class: bujt
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: buju
        };
        bujz bujzVar7 = new bujz(m7.a());
        this.g = bujzVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        m8.d(true);
        dtqsVar8.a = "message_spam.classification_timestamp";
        m8.i(59190);
        dtqsVar8.d = new Supplier() { // from class: bujv
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bujw
        };
        bujz bujzVar8 = new bujz(m8.a());
        this.h = bujzVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        dtqsVar9.a = "message_spam.trigger";
        m9.i(59460);
        dtqsVar9.d = new Supplier() { // from class: bujx
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: buix
        };
        bujz bujzVar9 = new bujz(m9.a());
        this.i = bujzVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "message_spam.action_type";
        m10.i(59460);
        dtqsVar10.d = new Supplier() { // from class: buiz
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: buja
        };
        bujz bujzVar10 = new bujz(m10.a());
        this.j = bujzVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 1;
        dtqsVar11.a = "message_spam.action_contributors";
        m11.i(59460);
        dtqsVar11.d = new Supplier() { // from class: bujb
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bujc
        };
        bujz bujzVar11 = new bujz(m11.a());
        this.k = bujzVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 1;
        dtqsVar12.a = "message_spam.error_code";
        m12.i(59460);
        dtqsVar12.d = new Supplier() { // from class: bujd
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: buje
        };
        bujz bujzVar12 = new bujz(m12.a());
        this.l = bujzVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 1;
        dtqsVar13.a = "message_spam.reclassification_index";
        m13.i(59460);
        dtqsVar13.d = new Supplier() { // from class: bujf
            @Override // java.util.function.Supplier
            public final Object get() {
                return buld.b();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bujg
        };
        bujz bujzVar13 = new bujz(m13.a());
        this.m = bujzVar13;
        this.n = new bujz[]{bujzVar, bujzVar2, bujzVar3, bujzVar4, bujzVar5, bujzVar6, bujzVar7, bujzVar8, bujzVar9, bujzVar10, bujzVar11, bujzVar12, bujzVar13};
    }
}
