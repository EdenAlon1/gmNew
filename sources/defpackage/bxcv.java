package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcv implements fbba {
    public static dtux a() {
        return new dtuf(bxct.d, "reminders", new dtue() { // from class: bxcj
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxct.a;
                valueOf.getClass();
                if (i == 33070) {
                    bxct.f(dtveVar, 33070);
                    return;
                }
                if (i == 35070) {
                    dtveVar.y("ALTER TABLE reminders ADD COLUMN conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ;");
                } else {
                    if (i != 58470) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_reminders_conversation_id");
                    dtveVar.y("CREATE INDEX index_reminders_conversation_id ON reminders(conversation_id);");
                    dtveVar.y("DROP INDEX IF EXISTS index_reminders_trigger_time");
                    dtveVar.y("CREATE INDEX index_reminders_trigger_time ON reminders(trigger_time);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
