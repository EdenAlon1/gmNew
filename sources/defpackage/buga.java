package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buga implements fbba {
    public static dtux a() {
        return new dtuf(bufy.d, "message_replies", new dtue() { // from class: bufo
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bufy.a;
                valueOf.getClass();
                if (i == 58330) {
                    bufy.b(dtveVar, 58330);
                } else {
                    if (i != 58900) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_message_replies_replied_to_rcs_message_id");
                    dtveVar.y("CREATE INDEX index_message_replies_replied_to_rcs_message_id ON message_replies(replied_to_rcs_message_id);");
                    dtveVar.y("DROP INDEX IF EXISTS index_replied_to_message_id");
                    dtveVar.y("CREATE INDEX index_replied_to_message_id ON message_replies(replied_to_message_id, replied_to_message_id_null_reason);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
