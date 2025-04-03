package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buba implements fbba {
    public static dtux a() {
        return new dtuf(buaw.d, "message_labels", new dtue() { // from class: buam
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = buaw.a;
                valueOf.getClass();
                switch (i) {
                    case 53050:
                        buaw.d(dtveVar, 53050);
                        dtveVar.y("DROP INDEX IF EXISTS unique_idx_message_label");
                        dtveVar.y("CREATE UNIQUE INDEX unique_idx_message_label ON message_labels(message_id, label);");
                        break;
                    case 53060:
                        dtveVar.y("ALTER TABLE message_labels ADD COLUMN confidence INTEGER;");
                        break;
                    case 58550:
                        dtveVar.y("DROP INDEX IF EXISTS index_message_labels_label");
                        dtveVar.y("CREATE INDEX index_message_labels_label ON message_labels(label);");
                        break;
                    case 58590:
                        dtveVar.y("ALTER TABLE message_labels ADD COLUMN intent TEXT DEFAULT('');");
                        break;
                    case 59240:
                        dtveVar.y("DROP INDEX IF EXISTS index_message_labels_intent");
                        dtveVar.y("CREATE INDEX index_message_labels_intent ON message_labels(intent) WHERE intent = 'Otp';");
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
