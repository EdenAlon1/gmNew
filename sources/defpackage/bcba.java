package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcba extends dtup {
    public static final String[] a = {"messages_backup._id", "messages_backup.message_persistence_id", "messages_backup.my_identity", "messages_backup.message_status", "messages_backup.seen", "messages_backup.read", "messages_backup.conversation_id", "messages_backup.sender_participant_id", "messages_backup.sender_send_destination", "messages_backup.msisdn_receiving_rcs_message", "messages_backup.self_participant_id", "messages_backup.mms_subject", "messages_backup.received_timestamp", "messages_backup.sent_timestamp", "messages_backup.protocol", "messages_backup.message_priority", "messages_backup.rcs_encryption_status", "messages_backup.cloud_sync_id", "messages_backup.correlation_id", "messages_backup.sms_error_code", "messages_backup.sms_error_desc_map_name", "messages_backup.mms_transaction_id", "messages_backup.mms_content_location", "messages_backup.is_hidden", "messages_backup.rcs_message_id", "messages_backup.custom_headers", "messages_backup.cms_id", "messages_backup.cms_life_cycle", "messages_backup.cms_correlation_id", "messages_backup.cms_last_mod_seq"};
    public static final enhk b;
    public static final bbzg c;
    public static final int[] d;
    public static final int[] e;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages_backup.message_persistence_id", 120);
        enhdVar.k("messages_backup.my_identity", 110);
        enhdVar.k("messages_backup.message_status", 0);
        enhdVar.k("messages_backup.seen", 0);
        enhdVar.k("messages_backup.read", 0);
        enhdVar.k("messages_backup.conversation_id", 0);
        enhdVar.k("messages_backup.sender_participant_id", 0);
        enhdVar.k("messages_backup.sender_send_destination", 80);
        enhdVar.k("messages_backup.msisdn_receiving_rcs_message", 80);
        enhdVar.k("messages_backup.self_participant_id", 0);
        enhdVar.k("messages_backup.mms_subject", 0);
        enhdVar.k("messages_backup.received_timestamp", 0);
        enhdVar.k("messages_backup.sent_timestamp", 0);
        enhdVar.k("messages_backup.protocol", 0);
        enhdVar.k("messages_backup.message_priority", 0);
        enhdVar.k("messages_backup.rcs_encryption_status", 0);
        enhdVar.k("messages_backup.cloud_sync_id", 0);
        enhdVar.k("messages_backup.correlation_id", 0);
        enhdVar.k("messages_backup.sms_error_code", 0);
        enhdVar.k("messages_backup.sms_error_desc_map_name", 0);
        enhdVar.k("messages_backup.is_hidden", 0);
        enhdVar.k("messages_backup.rcs_message_id", 0);
        enhdVar.k("messages_backup.custom_headers", 50);
        enhdVar.k("messages_backup.cms_id", 0);
        enhdVar.k("messages_backup.cms_life_cycle", 0);
        enhdVar.k("messages_backup.cms_correlation_id", 0);
        enhdVar.k("messages_backup.cms_last_mod_seq", 0);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_persistence_id", "index_messages_backup_message_persistence_id");
        enhdVar2.k("my_identity", "index_messages_backup_my_identity");
        enhdVar2.k("conversation_id", "index_messages_backup_conversation_id");
        enhdVar2.k("sender_participant_id", "index_messages_backup_sender_participant_id");
        enhdVar2.k("self_participant_id", "index_messages_backup_self_participant_id");
        enhdVar2.k("received_timestamp", "index_messages_backup_received_timestamp");
        enhdVar2.k("rcs_message_id", "index_messages_backup_rcs_message_id");
        enhdVar2.k("custom_headers", "index_messages_backup_custom_headers");
        enhdVar2.k("cms_id", "index_messages_backup_cms_id");
        enhdVar2.k("cms_correlation_id", "index_messages_backup_cms_correlation_id");
        enhdVar2.c();
        c = new bbzg();
        d = new int[]{0, 50, 80, 120};
        e = new int[]{90, 110};
    }

    public static final bcax a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("messages_backup._id");
            if (c2.intValue() >= 120) {
                engrVar.h("messages_backup.message_persistence_id");
            }
            if (c2.intValue() >= 110) {
                engrVar.h("messages_backup.my_identity");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.message_status");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.seen");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.read");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.conversation_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.sender_participant_id");
            }
            if (c2.intValue() >= 80) {
                engrVar.h("messages_backup.sender_send_destination");
            }
            if (c2.intValue() >= 80) {
                engrVar.h("messages_backup.msisdn_receiving_rcs_message");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.self_participant_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.mms_subject");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.received_timestamp");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.sent_timestamp");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.protocol");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.message_priority");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.rcs_encryption_status");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.cloud_sync_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.correlation_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.sms_error_code");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.sms_error_desc_map_name");
            }
            engrVar.h("messages_backup.mms_transaction_id");
            engrVar.h("messages_backup.mms_content_location");
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.is_hidden");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.rcs_message_id");
            }
            if (c2.intValue() >= 50) {
                engrVar.h("messages_backup.custom_headers");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.cms_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.cms_life_cycle");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.cms_correlation_id");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("messages_backup.cms_last_mod_seq");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bcax(strArr);
    }

    public static dtve b() {
        return dtub.e("backup");
    }

    public static Integer c() {
        return Integer.valueOf(g().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY");
        if (i >= 120) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("message_persistence_id TEXT");
        }
        if (i >= 110) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("my_identity TEXT REFERENCES my_identities_backup(token) ON DELETE NO ACTION ON UPDATE CASCADE");
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("seen INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("read INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT REFERENCES conversations_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sender_send_destination TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("msisdn_receiving_rcs_message TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("self_participant_id INT REFERENCES participants_backup(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_subject TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sent_timestamp INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("protocol INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_priority INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_encryption_status INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cloud_sync_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_error_code INT DEFAULT(-1)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("sms_error_desc_map_name TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_transaction_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("mms_content_location TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_hidden INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("custom_headers BLOB");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_life_cycle INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_correlation_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("cms_last_mod_seq INTEGER");
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dtve dtveVar, int i) {
        dtub.J(dtveVar, "messages_backup", d(i, "TEMP___messages_backup"), a, f(i));
    }

    static String[] f(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_conversation_id");
        arrayList.add("CREATE INDEX index_messages_backup_conversation_id ON messages_backup(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_sender_participant_id");
        arrayList.add("CREATE INDEX index_messages_backup_sender_participant_id ON messages_backup(sender_participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_self_participant_id");
        arrayList.add("CREATE INDEX index_messages_backup_self_participant_id ON messages_backup(self_participant_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_received_timestamp");
        arrayList.add("CREATE INDEX index_messages_backup_received_timestamp ON messages_backup(received_timestamp);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_rcs_message_id");
        arrayList.add("CREATE INDEX index_messages_backup_rcs_message_id ON messages_backup(rcs_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_cms_id");
        arrayList.add("CREATE INDEX index_messages_backup_cms_id ON messages_backup(cms_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_cms_correlation_id");
        arrayList.add("CREATE INDEX index_messages_backup_cms_correlation_id ON messages_backup(cms_correlation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_messages_backup_custom_headers");
        arrayList.add("CREATE INDEX index_messages_backup_custom_headers ON messages_backup(custom_headers);");
        if (i >= 110) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_backup_my_identity");
            arrayList.add("CREATE INDEX index_messages_backup_my_identity ON messages_backup(my_identity);");
        }
        if (i >= 120) {
            arrayList.add("DROP INDEX IF EXISTS index_messages_backup_message_persistence_id");
            arrayList.add("CREATE UNIQUE INDEX index_messages_backup_message_persistence_id ON messages_backup(message_persistence_id) WHERE message_persistence_id NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dtzf g() {
        return b().P();
    }
}
