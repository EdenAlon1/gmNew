package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzbz {
    private static final enin a;
    private final ahor b;

    static {
        enin eninVar = new enin();
        eninVar.c("_id");
        eninVar.c("conversation_id");
        eninVar.c("sender_id");
        eninVar.c("message_status");
        eninVar.c("message_protocol");
        eninVar.c("received_timestamp");
        eninVar.c("web_id");
        eninVar.c("message_report_status");
        eninVar.c("participant_id");
        eninVar.c("read_time");
        eninVar.c("participant_id");
        eninVar.c("read_time");
        eninVar.c("receive_time");
        String[] strArr = bytk.a;
        eninVar.c("user_references");
        String[] strArr2 = PartsTable.a;
        eninVar.c("parts");
        String[] strArr3 = bwvy.a;
        eninVar.c("read_reports");
        a = eninVar;
    }

    public bzbz(ahor ahorVar) {
        this.b = ahorVar;
    }

    final enip a() {
        enin eninVar = a;
        if (this.b.c()) {
            String[] strArr = btqq.a;
            eninVar.c("link_preview");
        }
        return eninVar.g();
    }
}
