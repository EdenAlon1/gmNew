package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btku extends dtup {
    public static final int[] a = {59590};
    public static final int[] b = {59690};

    public static void a(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0) NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("last_modified_by_key TEXT");
        sb.insert(0, "CREATE TABLE group_conversation_participants (");
        sb.append(", UNIQUE(conversation_id,participant_id) ON CONFLICT FAIL FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id) ON DELETE CASCADE PRIMARY KEY (conversation_id,participant_id));");
        String sb2 = i >= 59690 ? null : sb.toString();
        if (sb2 == null) {
            return;
        }
        dtveVar.y(sb2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_group_conversation_participants_conversation_id");
        arrayList.add("CREATE INDEX index_group_conversation_participants_conversation_id ON group_conversation_participants(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_group_conversation_participants_participant_id");
        arrayList.add("CREATE INDEX index_group_conversation_participants_participant_id ON group_conversation_participants(participant_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
