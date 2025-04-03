package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boqc {
    public static final String[] a = {"reports_concat_view._id_read_reports", "reports_concat_view.message_id_read_reports", "reports_concat_view.participant_id_read_reports", "reports_concat_view.receive_time_read_reports", "reports_concat_view.read_time_read_reports", "reports_concat_view.ftd_time_read_reports", "reports_concat_view.read_reports__ROWID_read_reports"};

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("reports_concat_view.ftd_time_read_reports", 58880);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_null_message_id");
        enhdVar2.c();
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "reports_concat_view._id_read_reports";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bopl
            @Override // java.util.function.Supplier
            public final Object get() {
                return boqc.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bopy
        };
        m.a();
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bopz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "reports_concat_view.message_id_read_reports";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: boqa
            @Override // java.util.function.Supplier
            public final Object get() {
                return boqc.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bopm
        };
        m2.a();
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        m3.k(true);
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: bopn
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar3.a = "reports_concat_view.participant_id_read_reports";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bopo
            @Override // java.util.function.Supplier
            public final Object get() {
                return boqc.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bopp
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "reports_concat_view.receive_time_read_reports";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bopq
            @Override // java.util.function.Supplier
            public final Object get() {
                return boqc.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bopr
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "reports_concat_view.read_time_read_reports";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bops
            @Override // java.util.function.Supplier
            public final Object get() {
                return boqc.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bopt
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "reports_concat_view.ftd_time_read_reports";
        m6.i(58880);
        dtqsVar6.d = new Supplier() { // from class: bopu
            @Override // java.util.function.Supplier
            public final Object get() {
                return boqc.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bopv
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 8;
        dtqsVar7.a = "reports_concat_view.read_reports__ROWID_read_reports";
        m7.i(0);
        dtqsVar7.d = new Supplier() { // from class: bopw
            @Override // java.util.function.Supplier
            public final Object get() {
                return boqc.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bopx
        };
        m7.a();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static dtzf b() {
        return a().P();
    }
}
