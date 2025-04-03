package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buhl {
    public final buhm a;
    public final buhm b;
    public final buhm c;
    public final buhm d;
    public final buhm e;
    public final buhm f;
    public final buhm g;
    public final buhm h;
    public final buhm i;
    public final buhm j;
    public final buhm k;
    public final buhm l;
    public final buhm m;
    final buhm[] n;

    public buhl() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_send_receive_attempt._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bugk
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bugm
        };
        buhm buhmVar = new buhm(m.a());
        this.a = buhmVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bugu
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_send_receive_attempt.message_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bugw
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bugx
        };
        buhm buhmVar2 = new buhm(m2.a());
        this.b = buhmVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.k(true);
        dtqsVar3.a = "message_send_receive_attempt.timestamp";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bugy
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bugz
        };
        buhm buhmVar3 = new buhm(m3.a());
        this.c = buhmVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.k(true);
        dtqsVar4.a = "message_send_receive_attempt.message_sending_attempt";
        m4.f(true);
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: buha
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: buhb
        };
        buhm buhmVar4 = new buhm(m4.a());
        this.d = buhmVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "message_send_receive_attempt.message_protocol";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: buhc
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bugv
        };
        buhm buhmVar5 = new buhm(m5.a());
        this.e = buhmVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "message_send_receive_attempt.current_sim_network_country";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: buhd
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: buhe
        };
        buhm buhmVar6 = new buhm(m6.a());
        this.f = buhmVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "message_send_receive_attempt.current_sim_country";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: buhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: buhg
        };
        buhm buhmVar7 = new buhm(m7.a());
        this.g = buhmVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 4;
        dtqsVar8.a = "message_send_receive_attempt.current_sim_carrier_country";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: buhh
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: buhi
        };
        buhm buhmVar8 = new buhm(m8.a());
        this.h = buhmVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "message_send_receive_attempt.settings_country";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: buhj
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: buhk
        };
        buhm buhmVar9 = new buhm(m9.a());
        this.i = buhmVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 4;
        dtqsVar10.a = "message_send_receive_attempt.default_sms_sim_country";
        m10.i(-1);
        dtqsVar10.d = new Supplier() { // from class: bugl
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bugn
        };
        buhm buhmVar10 = new buhm(m10.a());
        this.j = buhmVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        dtqsVar11.a = "message_send_receive_attempt.locale_country";
        m11.i(-1);
        dtqsVar11.d = new Supplier() { // from class: bugo
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bugp
        };
        buhm buhmVar11 = new buhm(m11.a());
        this.k = buhmVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 4;
        dtqsVar12.a = "message_send_receive_attempt.default_sms_sim_network_country";
        m12.i(-1);
        dtqsVar12.d = new Supplier() { // from class: bugq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bugr
        };
        buhm buhmVar12 = new buhm(m12.a());
        this.l = buhmVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 4;
        dtqsVar13.a = "message_send_receive_attempt.default_sms_sim_carrier_country";
        m13.i(-1);
        dtqsVar13.d = new Supplier() { // from class: bugs
            @Override // java.util.function.Supplier
            public final Object get() {
                return buik.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bugt
        };
        buhm buhmVar13 = new buhm(m13.a());
        this.m = buhmVar13;
        this.n = new buhm[]{buhmVar, buhmVar2, buhmVar3, buhmVar4, buhmVar5, buhmVar6, buhmVar7, buhmVar8, buhmVar9, buhmVar10, buhmVar11, buhmVar12, buhmVar13};
    }
}
