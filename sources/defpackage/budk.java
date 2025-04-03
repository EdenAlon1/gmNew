package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class budk {
    public final budl a;
    public final budl b;
    public final budl c;
    public final budl d;
    public final budl e;
    public final budl f;
    public final budl g;
    final budl[] h;

    public budk() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_reactions._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bucu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bueg.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: budh
        };
        budl budlVar = new budl(m.a());
        this.a = budlVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: budi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_reactions.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: budj
            @Override // java.util.function.Supplier
            public final Object get() {
                return bueg.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bucv
        };
        budl budlVar2 = new budl(m2.a());
        this.b = budlVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 5;
        dtqsVar3.a = "message_reactions.reactions_data";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bucw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bueg.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bucx
        };
        budl budlVar3 = new budl(m3.a());
        this.c = budlVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 2;
        m4.d(true);
        m4.e(true);
        dtqsVar4.b = new Supplier() { // from class: bucy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar4.a = "message_reactions.reacted_message_id";
        m4.i(46020);
        dtqsVar4.d = new Supplier() { // from class: bucz
            @Override // java.util.function.Supplier
            public final Object get() {
                return bueg.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: buda
        };
        budl budlVar4 = new budl(m4.a());
        this.d = budlVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        dtqsVar5.a = "message_reactions.reaction";
        m5.i(48000);
        dtqsVar5.d = new Supplier() { // from class: budb
            @Override // java.util.function.Supplier
            public final Object get() {
                return bueg.b();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: budc
        };
        budl budlVar5 = new budl(m5.a());
        this.e = budlVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 5;
        dtqsVar6.a = "message_reactions.applied_reaction";
        m6.i(59060);
        dtqsVar6.d = new Supplier() { // from class: budd
            @Override // java.util.function.Supplier
            public final Object get() {
                return bueg.b();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bude
        };
        budl budlVar6 = new budl(m6.a());
        this.f = budlVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 5;
        m7.d(true);
        dtqsVar7.a = "message_reactions.animation_effect";
        m7.i(59520);
        dtqsVar7.d = new Supplier() { // from class: budf
            @Override // java.util.function.Supplier
            public final Object get() {
                return bueg.b();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: budg
        };
        budl budlVar7 = new budl(m7.a());
        this.g = budlVar7;
        this.h = new budl[]{budlVar, budlVar2, budlVar3, budlVar4, budlVar5, budlVar6, budlVar7};
    }
}
