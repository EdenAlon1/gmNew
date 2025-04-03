package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brth implements fbba {
    public static dtux a() {
        return new dtuf(ConversationNotificationSettingsTable.c, "conversation_notification_settings_table", new dtue() { // from class: brtc
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = ConversationNotificationSettingsTable.a;
                valueOf.getClass();
                if (i != 60720) {
                    return;
                }
                ConversationNotificationSettingsTable.b(dtveVar);
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
