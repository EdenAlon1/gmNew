package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btha implements fbba {
    public static dtux a() {
        return new dtuf(btgy.c, "gemini_conversation_id_mappings", new dtue() { // from class: btgq
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = btgy.a;
                valueOf.getClass();
                if (i == 60010) {
                    btgy.b(dtveVar, 60010);
                } else {
                    if (i != 60090) {
                        return;
                    }
                    if (dtub.a(btgy.a()) < 60090) {
                        throw new IllegalStateException("do not combine unique and schemaVersion to indexes -- if you really need unique create a new column");
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_gemini_conversation_id_mappings_gemini_conversation_id");
                    dtveVar.y("CREATE UNIQUE INDEX index_gemini_conversation_id_mappings_gemini_conversation_id ON gemini_conversation_id_mappings(gemini_conversation_id);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
