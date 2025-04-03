package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.Locale;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bece {
    public static String a(int i) {
        return h(i, becg.DELETE, null);
    }

    public static String b(int i) {
        return h(i, becg.INSERT, null);
    }

    public static String c(int i) {
        return h(i, becg.UPDATE, i == 3 ? String.format(Locale.US, "OLD.%s != NEW.%s OR OLD.%s != NEW.%s OR OLD.%s != NEW.%s OR OLD.%s != NEW.%s", "full_name", "full_name", "lookup_key", "lookup_key", "display_destination", "display_destination", "normalized_destination", "normalized_destination") : i == 2 ? String.format(Locale.US, "OLD.%s != NEW.%s", "name", "name") : i == 4 ? String.format(Locale.US, "OLD.%s != NEW.%s OR OLD.%s != NEW.%s OR OLD.%s != NEW.%s", "message_id", "message_id", "annotation_details", "annotation_details", "annotation_type", "annotation_type") : null);
    }

    public static String d(int i) {
        switch (i) {
            case 1:
                return "messages";
            case 2:
                String[] strArr = bsom.a;
                return "conversations";
            case 3:
                return "participants";
            case 4:
                String[] strArr2 = bttf.a;
                return "messages_annotations";
            case 5:
                String[] strArr3 = PartsTable.a;
                return "parts";
            case 6:
                String[] strArr4 = brww.a;
                return "conversation_participants";
            case 7:
                String[] strArr5 = bqws.a;
                return "cms";
            case 8:
                String[] strArr6 = buld.a;
                return "message_spam";
            case 9:
                String[] strArr7 = bsam.a;
                return "conversation_suggestions";
            case 10:
                String[] strArr8 = bueg.a;
                return "message_reactions";
            case 11:
            default:
                return null;
            case 12:
                String[] strArr9 = bumm.a;
                return "message_star";
            case 13:
                String[] strArr10 = bufy.a;
                return "message_replies";
            case 14:
                String[] strArr11 = bwvy.a;
                return "read_reports";
            case 15:
                String[] strArr12 = bryh.a;
                return "conversation_pin";
            case 16:
                String[] strArr13 = ScheduledSendTable.a;
                return "scheduled_send";
        }
    }

    public static String e(int i, String str) {
        return "on_" + d(i) + "_" + str.toLowerCase(Locale.US);
    }

    public static String f(int i, String str, int i2) {
        return e(i, str).concat(i2 == 32 ? "_bk" : "");
    }

    public static String g(int i, String str) {
        String[] strArr = btki.a;
        return "INSERT INTO generic_worker_queue (worker_type,item_table_type,item_id) VALUES (" + i + ",1," + str + ");";
    }

    private static String h(int i, becg becgVar, String str) {
        bech bechVar = new bech();
        bechVar.b = i;
        bechVar.c = becgVar;
        bechVar.e = i == 4 ? 1 : 3;
        bechVar.b(str);
        return bechVar.a();
    }
}
