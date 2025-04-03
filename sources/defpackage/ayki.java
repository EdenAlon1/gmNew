package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayki implements fbba {
    public static dtux a() {
        return new dtuf(aykg.c, "conversation_matcher_cache", new dtue() { // from class: ayjz
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = aykg.a;
                valueOf.getClass();
                if (i == 58580) {
                    aykg.b(dtveVar, 58580);
                } else {
                    if (i != 59180) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_conversation_matcher_cache_conversation_id");
                    dtveVar.y("CREATE INDEX index_conversation_matcher_cache_conversation_id ON conversation_matcher_cache(conversation_id) WHERE conversation_id NOT NULL;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
