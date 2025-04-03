package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coiw implements fbba {
    public static dtux a() {
        return new dtuf(ScheduledSendTable.d, "scheduled_send", new dtue() { // from class: coii
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = ScheduledSendTable.a;
                valueOf.getClass();
                switch (i) {
                    case 52040:
                        ScheduledSendTable.e(dtveVar, 52040);
                        break;
                    case 58020:
                        dtveVar.y("ALTER TABLE scheduled_send ADD COLUMN creation_time INTEGER DEFAULT(0) NOT NULL;");
                        break;
                    case 58170:
                        dtveVar.y("DROP INDEX IF EXISTS index_scheduled_send_conversation_id");
                        dtveVar.y("CREATE INDEX index_scheduled_send_conversation_id ON scheduled_send(conversation_id);");
                        break;
                    case 58290:
                        dtveVar.y("DROP INDEX IF EXISTS index_status_time");
                        dtveVar.y("CREATE INDEX index_status_time ON scheduled_send(status, scheduled_time);");
                        break;
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
