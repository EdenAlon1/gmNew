package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buab {
    public final buac a;
    public final buac b;
    public final buac c;
    public final buac d;
    public final buac e;
    public final buac f;
    public final buac g;
    final buac[] h;

    public buab() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_labels._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btzl
            @Override // java.util.function.Supplier
            public final Object get() {
                return buaw.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btzy
        };
        buac buacVar = new buac(m.a());
        this.a = buacVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btzz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_labels.message_id";
        m2.f(true);
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: buaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return buaw.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btzm
        };
        buac buacVar2 = new buac(m2.a());
        this.b = buacVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: btzn
            @Override // java.util.function.Supplier
            public final Object get() {
                return byfi.b.a;
            }
        };
        dtqsVar3.a = "message_labels.label";
        m3.f(true);
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btzo
            @Override // java.util.function.Supplier
            public final Object get() {
                return buaw.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btzp
        };
        buac buacVar3 = new buac(m3.a());
        this.c = buacVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        dtqsVar4.a = "message_labels.confidence";
        m4.i(53060);
        dtqsVar4.d = new Supplier() { // from class: btzq
            @Override // java.util.function.Supplier
            public final Object get() {
                return buaw.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btzr
        };
        buac buacVar4 = new buac(m4.a());
        this.d = buacVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "message_labels.source";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: btzs
            @Override // java.util.function.Supplier
            public final Object get() {
                return buaw.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: btzt
        };
        buac buacVar5 = new buac(m5.a());
        this.e = buacVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        m6.d(true);
        dtqsVar6.a = "message_labels.intent";
        m6.i(58590);
        dtqsVar6.d = new Supplier() { // from class: btzu
            @Override // java.util.function.Supplier
            public final Object get() {
                return buaw.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: btzv
        };
        buac buacVar6 = new buac(m6.a());
        this.f = buacVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "message_labels.model_id";
        m7.i(-1);
        dtqsVar7.d = new Supplier() { // from class: btzw
            @Override // java.util.function.Supplier
            public final Object get() {
                return buaw.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: btzx
        };
        buac buacVar7 = new buac(m7.a());
        this.g = buacVar7;
        this.h = new buac[]{buacVar, buacVar2, buacVar3, buacVar4, buacVar5, buacVar6, buacVar7};
    }
}
