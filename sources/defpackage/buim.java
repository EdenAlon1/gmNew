package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buim implements fbba {
    public static dtux a() {
        return new dtuf(buik.c, "message_send_receive_attempt", new dtue() { // from class: buic
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = buik.a;
                valueOf.getClass();
                if (i != 59360) {
                    return;
                }
                buik.b(dtveVar);
                dtveVar.y("DROP INDEX IF EXISTS message_id_and_message_sending_attempt_index");
                dtveVar.y("CREATE UNIQUE INDEX message_id_and_message_sending_attempt_index ON message_send_receive_attempt(message_id, message_sending_attempt);");
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
