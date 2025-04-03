package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bufe {
    public final buff a;
    public final buff b;
    public final buff c;
    public final buff d;
    final buff[] e;

    public bufe() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: bueu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "message_replies.message_id";
        m.f(true);
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: buev
            @Override // java.util.function.Supplier
            public final Object get() {
                return bufy.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: buew
        };
        buff buffVar = new buff(m.a());
        this.a = buffVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: buex
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_replies.replied_to_message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: buey
            @Override // java.util.function.Supplier
            public final Object get() {
                return bufy.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: buez
        };
        buff buffVar2 = new buff(m2.a());
        this.b = buffVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "message_replies.replied_to_message_id_null_reason";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bufa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bufy.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bufb
        };
        buff buffVar3 = new buff(m3.a());
        this.c = buffVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        m4.d(true);
        dtqsVar4.a = "message_replies.replied_to_rcs_message_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bufc
            @Override // java.util.function.Supplier
            public final Object get() {
                return bufy.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bufd
        };
        buff buffVar4 = new buff(m4.a());
        this.d = buffVar4;
        this.e = new buff[]{buffVar, buffVar2, buffVar3, buffVar4};
    }
}
