package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvf {
    public final btvg a;
    public final btvg b;
    public final btvg c;
    public final btvg d;
    final btvg[] e;

    public btvf() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "message_classifications_table._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btuw
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvy.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btux
        };
        btvg btvgVar = new btvg(m.a());
        this.a = btvgVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btuy
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "message_classifications_table.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btuz
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvy.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btva
        };
        btvg btvgVar2 = new btvg(m2.a());
        this.b = btvgVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        dtqsVar3.a = "message_classifications_table.classification_type";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btvb
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvy.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btvc
        };
        btvg btvgVar3 = new btvg(m3.a());
        this.c = btvgVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        dtqsVar4.a = "message_classifications_table.classification_details";
        m4.i(58480);
        dtqsVar4.d = new Supplier() { // from class: btvd
            @Override // java.util.function.Supplier
            public final Object get() {
                return btvy.b();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: btve
        };
        btvg btvgVar4 = new btvg(m4.a());
        this.d = btvgVar4;
        this.e = new btvg[]{btvgVar, btvgVar2, btvgVar3, btvgVar4};
    }
}
