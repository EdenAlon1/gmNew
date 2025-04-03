package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aixn {
    public static String a(String str, String str2) {
        String[] strArr = MessagesTable.a;
        return "CREATE TRIGGER IF NOT EXISTS " + "on_messages_delete_update_".concat(str) + " AFTER DELETE ON messages WHEN OLD.message_status >= 1 AND OLD.message_status <= 25 BEGIN DELETE FROM " + str + " WHERE CAST(julianday(OLD.received_timestamp / 1000, 'unixepoch') AS INT) <= CAST(julianday(" + str2 + " / 1000, 'unixepoch') AS INT); END";
    }
}
