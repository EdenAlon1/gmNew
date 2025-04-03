package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqsn {
    public final cqso a;
    public final cqso b;
    public final cqso c;
    public final cqso d;
    public final cqso e;
    public final cqso f;
    public final cqso g;
    public final cqso h;
    final cqso[] i;

    public cqsn() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: cqrw
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "file_transfer.message_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cqsl
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cqsm
        };
        cqso cqsoVar = new cqso(m.a());
        this.a = cqsoVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.d(true);
        dtqsVar2.a = "file_transfer.transfer_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cqrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cqry
        };
        cqso cqsoVar2 = new cqso(m2.a());
        this.b = cqsoVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "file_transfer.transfer_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cqrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cqsa
        };
        cqso cqsoVar3 = new cqso(m3.a());
        this.c = cqsoVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        dtqsVar4.a = "file_transfer.attachment_upload_response";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cqsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cqsc
        };
        cqso cqsoVar4 = new cqso(m4.a());
        this.d = cqsoVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 5;
        dtqsVar5.a = "file_transfer.file_information";
        m5.i(55030);
        dtqsVar5.d = new Supplier() { // from class: cqsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cqse
        };
        cqso cqsoVar5 = new cqso(m5.a());
        this.e = cqsoVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        dtqsVar6.a = "file_transfer.thumbnail_information";
        m6.i(59910);
        dtqsVar6.d = new Supplier() { // from class: cqsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: cqsg
        };
        cqso cqsoVar6 = new cqso(m6.a());
        this.f = cqsoVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "file_transfer.transfer_handle";
        m7.i(55030);
        dtqsVar7.d = new Supplier() { // from class: cqsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: cqsi
        };
        cqso cqsoVar7 = new cqso(m7.a());
        this.g = cqsoVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 5;
        dtqsVar8.a = "file_transfer.opaque_data";
        m8.i(56040);
        dtqsVar8.d = new Supplier() { // from class: cqsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return cqtj.c();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: cqsk
        };
        cqso cqsoVar8 = new cqso(m8.a());
        this.h = cqsoVar8;
        this.i = new cqso[]{cqsoVar, cqsoVar2, cqsoVar3, cqsoVar4, cqsoVar5, cqsoVar6, cqsoVar7, cqsoVar8};
    }
}
