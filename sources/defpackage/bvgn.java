package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvgn {
    public final bvgo a;
    public final bvgo b;
    public final bvgo c;
    public final bvgo d;
    public final bvgo e;
    public final bvgo f;
    public final bvgo g;
    final bvgo[] h;

    public bvgn() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "p2p_suggestions._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bvfy
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvhn.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bvgj
        };
        bvgo bvgoVar = new bvgo(m.a());
        this.a = bvgoVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bvgk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "p2p_suggestions.target_message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bvgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvhn.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bvgm
        };
        bvgo bvgoVar2 = new bvgo(m2.a());
        this.b = bvgoVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        dtqsVar3.a = "p2p_suggestions.generated_timestamp";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bvfz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvhn.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bvga
        };
        bvgo bvgoVar3 = new bvgo(m3.a());
        this.c = bvgoVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        dtqsVar4.a = "p2p_suggestions.suggestion";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bvgb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvhn.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bvgc
        };
        bvgo bvgoVar4 = new bvgo(m4.a());
        this.d = bvgoVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "p2p_suggestions.smart_suggestion_type";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bvgd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvhn.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bvge
        };
        bvgo bvgoVar5 = new bvgo(m5.a());
        this.e = bvgoVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 2;
        dtqsVar6.a = "p2p_suggestions.suggestion_status";
        m6.i(-1);
        dtqsVar6.d = new Supplier() { // from class: bvgf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvhn.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bvgg
        };
        bvgo bvgoVar6 = new bvgo(m6.a());
        this.f = bvgoVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 2;
        dtqsVar7.a = "p2p_suggestions.consumption_state";
        m7.i(53080);
        dtqsVar7.d = new Supplier() { // from class: bvgh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bvhn.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bvgi
        };
        bvgo bvgoVar7 = new bvgo(m7.a());
        this.g = bvgoVar7;
        this.h = new bvgo[]{bvgoVar, bvgoVar2, bvgoVar3, bvgoVar4, bvgoVar5, bvgoVar6, bvgoVar7};
    }
}
