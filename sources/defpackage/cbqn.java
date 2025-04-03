package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqn {
    public static String a(String str, ConversationIdType conversationIdType, List list) {
        csix.q(list.size());
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.US, " %s <= %d AND %s != %d AND %s != %d AND %s != %d AND %s is not null AND (", MessagesTable.c.k, 100, MessagesTable.c.k, 3, MessagesTable.c.k, 16, PartsTable.d.x, Integer.valueOf(eohh.RICH_CARD_THUMBNAIL.a()), PartsTable.d.d));
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(" OR ");
            }
            sb.append(String.format(Locale.US, "%s='%s'", PartsTable.d.e, list.get(i)));
        }
        sb.append(')');
        if (!TextUtils.isEmpty(str)) {
            sb.append(" AND ");
            b(sb, str);
        }
        if (!conversationIdType.b()) {
            sb.append(String.format(Locale.US, "AND %s=%s", PartsTable.d.o, conversationIdType));
        }
        return sb.toString();
    }

    public static void b(StringBuilder sb, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sb.append("(");
        sb.append(String.format(Locale.US, "%s='%s' OR ", ParticipantsTable.c.r, str));
        Locale locale = Locale.US;
        buun buunVar = MessagesTable.c.c;
        buum buumVar = MessagesTable.c;
        buun buunVar2 = buumVar.y;
        buun buunVar3 = buumVar.b;
        String[] strArr = bsdr.a;
        sb.append(String.format(locale, "(%s=%s AND %s IN (SELECT a.%s FROM %s as a  INNER JOIN %s as b ON a.%s = b.%s WHERE b.%s = '%s'))", buunVar, buunVar2, buunVar3, "conversation_id", "conversation_to_participants", "participants", "participant_id", "_id", "lookup_key", str));
        sb.append(") ");
    }
}
