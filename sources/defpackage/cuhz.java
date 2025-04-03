package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuhz {
    public final cuia a;
    public final cuia b;
    public final cuia c;
    public final cuia d;
    public final cuia e;
    final cuia[] f;

    public cuhz() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: cuhn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "spam_logging_ids_table.message_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cuhs
            @Override // java.util.function.Supplier
            public final Object get() {
                return cuiq.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cuht
        };
        cuia cuiaVar = new cuia(m.a());
        this.a = cuiaVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        dtqsVar2.a = "spam_logging_ids_table.message_logging_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cuhu
            @Override // java.util.function.Supplier
            public final Object get() {
                return cuiq.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cuhv
        };
        cuia cuiaVar2 = new cuia(m2.a());
        this.b = cuiaVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.d(true);
        m3.e(true);
        dtqsVar3.b = new Supplier() { // from class: cuhw
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar3.a = "spam_logging_ids_table.conversation_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cuhx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cuiq.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cuhy
        };
        cuia cuiaVar3 = new cuia(m3.a());
        this.c = cuiaVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "spam_logging_ids_table.conversation_logging_id";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cuho
            @Override // java.util.function.Supplier
            public final Object get() {
                return cuiq.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cuhp
        };
        cuia cuiaVar4 = new cuia(m4.a());
        this.d = cuiaVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.d(true);
        dtqsVar5.a = "spam_logging_ids_table.generation_timestamp";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: cuhq
            @Override // java.util.function.Supplier
            public final Object get() {
                return cuiq.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cuhr
        };
        cuia cuiaVar5 = new cuia(m5.a());
        this.e = cuiaVar5;
        this.f = new cuia[]{cuiaVar, cuiaVar2, cuiaVar3, cuiaVar4, cuiaVar5};
    }
}
