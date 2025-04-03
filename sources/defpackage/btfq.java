package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btfq implements fbba {
    public static dtux a() {
        return new dtuf(btfo.c, "flagged_messages", new dtue() { // from class: btfg
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = btfo.a;
                valueOf.getClass();
                switch (i) {
                    case 39010:
                        btfo.d(dtveVar, 39010);
                        break;
                    case 39030:
                        dtveVar.y("ALTER TABLE flagged_messages ADD COLUMN flagged_message_timestamp INT;");
                        break;
                    case 46030:
                        dtveVar.y("ALTER TABLE flagged_messages ADD COLUMN flagged_message_notified INT DEFAULT(0);");
                        break;
                    case 60710:
                        dtveVar.y("ALTER TABLE flagged_messages ADD COLUMN flagged_message_delay INT DEFAULT(0);");
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
