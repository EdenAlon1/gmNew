package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btza extends dtup {
    public static final String[] a = {"message_edits.message_id", "message_edits.latest_message_id", "message_edits.original_rcs_message_id", "message_edits.edited_at_timestamp_ms", "message_edits.received_at_timestamp_ms"};
    public static final enhk b = new enhd().c();
    public static final btyh c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_message_edits_message_id");
        enhdVar.k("latest_message_id", "index_message_edits_latest_message_id");
        enhdVar.k("original_rcs_message_id", "index_message_edits_original_rcs_message_id");
        enhdVar.c();
        c = new btyh();
        d = new int[]{59860};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static Optional b(MessageIdType messageIdType) {
        btyv btyvVar = new btyv(a);
        btyvVar.z("message_edits.queryOnMessageId");
        btyvVar.q();
        btyz btyzVar = new btyz();
        btyzVar.aq(new dtrt("message_edits.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
        btyvVar.k(new btyy(btyzVar));
        return Optional.ofNullable((btxp) dtub.c(btyvVar.b()));
    }

    public static dtzf c() {
        return a().P();
    }

    public static void d(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("latest_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("original_rcs_message_id TEXT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("edited_at_timestamp_ms INTEGER");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("received_at_timestamp_ms INTEGER");
        sb.insert(0, "CREATE TABLE message_edits (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_message_id");
        arrayList.add("CREATE UNIQUE INDEX index_message_edits_message_id ON message_edits(message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_latest_message_id");
        arrayList.add("CREATE INDEX index_message_edits_latest_message_id ON message_edits(latest_message_id);");
        arrayList.add("DROP INDEX IF EXISTS index_message_edits_original_rcs_message_id");
        arrayList.add("CREATE INDEX index_message_edits_original_rcs_message_id ON message_edits(original_rcs_message_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
