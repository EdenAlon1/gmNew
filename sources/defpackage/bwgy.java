package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgy implements fbba {
    public static dtux a() {
        return new dtuf(bwgw.d, "pending_incoming_message_rcs_table", new dtue() { // from class: bwgm
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bwgw.a;
                valueOf.getClass();
                switch (i) {
                    case 39050:
                        bwgw.d(dtveVar, 39050);
                        break;
                    case 44020:
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN custom_headers BLOB;");
                        break;
                    case 58820:
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_group INTEGER;");
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN conversation_id TEXT;");
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN conference_uri TEXT;");
                        break;
                    case 58870:
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_delivery_report_requested INTEGER DEFAULT(0) NOT NULL;");
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_display_report_requested INTEGER DEFAULT(0) NOT NULL;");
                        break;
                    case 59270:
                        dtveVar.y("DROP INDEX IF EXISTS index_pending_incoming_message_rcs_table_received_timestamp");
                        dtveVar.y("CREATE INDEX IF NOT EXISTS index_pending_incoming_message_rcs_table_received_timestamp ON pending_incoming_message_rcs_table(received_timestamp);");
                        break;
                    case 59410:
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN self_identity TEXT;");
                        break;
                    case 60560:
                        dtveVar.y("ALTER TABLE pending_incoming_message_rcs_table ADD COLUMN is_negative_delivery_report_requested INTEGER DEFAULT(0) NOT NULL;");
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
