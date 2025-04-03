package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxlg implements fbba {
    public static dtux a() {
        return new dtuf(bxle.d, "restore_workflow_executions", new dtue() { // from class: bxku
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxle.a;
                valueOf.getClass();
                switch (i) {
                    case 60040:
                        bxle.d(dtveVar, 60040);
                        break;
                    case 60110:
                        dtveVar.y("ALTER TABLE restore_workflow_executions ADD COLUMN initial_messages_version INTEGER;");
                        break;
                    case 60220:
                        dtveVar.y("ALTER TABLE restore_workflow_executions ADD COLUMN status_timestamp INTEGER;");
                        break;
                    case 60330:
                        dtveVar.y("ALTER TABLE restore_workflow_executions ADD COLUMN last_attachment_request_timestamp INTEGER;");
                        break;
                    case 60730:
                        dtveVar.y("ALTER TABLE restore_workflow_executions ADD COLUMN config BLOB;");
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
