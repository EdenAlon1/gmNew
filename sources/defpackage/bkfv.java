package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkfv {
    public final bkfw a;

    public bkfv() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "messages_annotations._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bkfk
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bkfn
        };
        this.a = new bkfw(m.a());
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "messages_annotations.conversation_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bkfo
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bkfp
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bkfq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar3.a = "messages_annotations.message_id";
        m3.i(20040);
        dtqsVar3.d = new Supplier() { // from class: bkfr
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bkfs
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        m4.d(true);
        dtqsVar4.a = "messages_annotations.annotation_type";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bkft
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bkfu
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 5;
        dtqsVar5.a = "messages_annotations.annotation_details";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bkfl
            @Override // java.util.function.Supplier
            public final Object get() {
                return LocationAndLinkAnnotationIdsQuery.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bkfm
        };
        m5.a();
    }
}
