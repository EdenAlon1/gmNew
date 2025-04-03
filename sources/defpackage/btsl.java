package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsl {
    public final btsm a;
    public final btsm b;
    public final btsm c;
    public final btsm d;
    public final btsm e;
    final btsm[] f;

    public btsl() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "messages_annotations._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btsa
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttf.c();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btsd
        };
        btsm btsmVar = new btsm(m.a());
        this.a = btsmVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "messages_annotations.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btse
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttf.c();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btsf
        };
        btsm btsmVar2 = new btsm(m2.a());
        this.b = btsmVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: btsg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar3.a = "messages_annotations.message_id";
        m3.i(20040);
        dtqsVar3.d = new Supplier() { // from class: btsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttf.c();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btsi
        };
        btsm btsmVar3 = new btsm(m3.a());
        this.c = btsmVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.d(true);
        dtqsVar4.a = "messages_annotations.annotation_type";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: btsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttf.c();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btsk
        };
        btsm btsmVar4 = new btsm(m4.a());
        this.d = btsmVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 5;
        dtqsVar5.a = "messages_annotations.annotation_details";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: btsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bttf.c();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: btsc
        };
        btsm btsmVar5 = new btsm(m5.a());
        this.e = btsmVar5;
        this.f = new btsm[]{btsmVar, btsmVar2, btsmVar3, btsmVar4, btsmVar5};
    }
}
