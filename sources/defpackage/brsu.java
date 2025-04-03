package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brsu {
    public final brsv a;
    public final brsv b;
    public final brsv c;
    public final brsv d;
    final brsv[] e;

    public brsu() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: brsl
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar.a = "conversation_notification_settings_table.conversation_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: brsm
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: brsn
        };
        brsv brsvVar = new brsv(m.a());
        this.a = brsvVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "conversation_notification_settings_table.muted_until_timestamp";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: brso
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: brsp
        };
        brsv brsvVar2 = new brsv(m2.a());
        this.b = brsvVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 1;
        dtqsVar3.a = "conversation_notification_settings_table.muted_duration";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: brsq
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: brsr
        };
        brsv brsvVar3 = new brsv(m3.a());
        this.c = brsvVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 1;
        dtqsVar4.a = "conversation_notification_settings_table.muted_threshold";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: brss
            @Override // java.util.function.Supplier
            public final Object get() {
                return ConversationNotificationSettingsTable.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: brst
        };
        brsv brsvVar4 = new brsv(m4.a());
        this.d = brsvVar4;
        this.e = new brsv[]{brsvVar, brsvVar2, brsvVar3, brsvVar4};
    }
}
