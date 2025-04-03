package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsm {
    public final bxsn a;
    public final bxsn b;
    public final bxsn c;
    public final bxsn d;
    public final bxsn e;
    public final bxsn f;
    public final bxsn g;
    public final bxsn h;
    public final bxsn i;
    final bxsn[] j;

    public bxsm() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "self_participants._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bxru
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bxsl
        };
        bxsn bxsnVar = new bxsn(m.a());
        this.a = bxsnVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "self_participants.phone_number";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bxrv
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bxrw
        };
        bxsn bxsnVar2 = new bxsn(m2.a());
        this.b = bxsnVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "self_participants.sim_serial_number";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bxrx
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bxry
        };
        bxsn bxsnVar3 = new bxsn(m3.a());
        this.c = bxsnVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "self_participants.sim_slot_index";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bxrz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bxsa
        };
        bxsn bxsnVar4 = new bxsn(m4.a());
        this.d = bxsnVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 1;
        dtqsVar5.a = "self_participants.sub_id";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bxsb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bxsc
        };
        bxsn bxsnVar5 = new bxsn(m5.a());
        this.e = bxsnVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "self_participants.subscription_name";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bxsd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bxse
        };
        bxsn bxsnVar6 = new bxsn(m6.a());
        this.f = bxsnVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 1;
        dtqsVar7.a = "self_participants.subscription_color";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: bxsf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bxsg
        };
        bxsn bxsnVar7 = new bxsn(m7.a());
        this.g = bxsnVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 2;
        dtqsVar8.a = "self_participants.participant_id";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bxsh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bxsi
        };
        bxsn bxsnVar8 = new bxsn(m8.a());
        this.h = bxsnVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 4;
        dtqsVar9.a = "self_participants.smsc";
        m9.i(29080);
        dtqsVar9.d = new Supplier() { // from class: bxsj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bxth.b();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bxsk
        };
        bxsn bxsnVar9 = new bxsn(m9.a());
        this.i = bxsnVar9;
        this.j = new bxsn[]{bxsnVar, bxsnVar2, bxsnVar3, bxsnVar4, bxsnVar5, bxsnVar6, bxsnVar7, bxsnVar8, bxsnVar9};
    }
}
