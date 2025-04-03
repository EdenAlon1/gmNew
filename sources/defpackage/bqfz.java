package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqfz implements fbba {
    public static dtux a() {
        return new dtuf(bqfx.d, "business_conversations_metadata", new dtue() { // from class: bqfp
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqfx.a;
                valueOf.getClass();
                if (i == 58070) {
                    bqfx.d(dtveVar, 58070);
                    return;
                }
                if (i == 59010) {
                    dtveVar.y("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_stop_state INTEGER;");
                } else {
                    if (i != 59050) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_toolstone_state INTEGER;");
                    dtveVar.y("ALTER TABLE business_conversations_metadata ADD COLUMN conversation_toolstone_timestamp_ms INTEGER;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
