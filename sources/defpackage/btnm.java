package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btnm {
    public final btnn a;
    public final btnn b;
    public final btnn c;
    final btnn[] d;

    public btnm() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "link_preview_participants_table._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return btob.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btng
        };
        btnn btnnVar = new btnn(m.a());
        this.a = btnnVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.k(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: btnh
            @Override // java.util.function.Supplier
            public final Object get() {
                return ParticipantsTable.c.a;
            }
        };
        dtqsVar2.a = "link_preview_participants_table.participant_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: btni
            @Override // java.util.function.Supplier
            public final Object get() {
                return btob.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: btnj
        };
        btnn btnnVar2 = new btnn(m2.a());
        this.b = btnnVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "link_preview_participants_table.manual_link_preview_count";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: btnk
            @Override // java.util.function.Supplier
            public final Object get() {
                return btob.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: btnl
        };
        btnn btnnVar3 = new btnn(m3.a());
        this.c = btnnVar3;
        this.d = new btnn[]{btnnVar, btnnVar2, btnnVar3};
    }
}
