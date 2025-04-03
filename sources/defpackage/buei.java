package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buei implements fbba {
    public static dtux a() {
        return new dtuf(bueg.d, "message_reactions", new dtue() { // from class: budx
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bueg.a;
                valueOf.getClass();
                switch (i) {
                    case 42000:
                        bueg.e(dtveVar, 42000);
                        break;
                    case 46020:
                        dtveVar.y("ALTER TABLE message_reactions ADD COLUMN reacted_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ;");
                        dtveVar.y("CREATE INDEX index_message_reactions_reacted_message_id ON message_reactions(reacted_message_id);");
                        break;
                    case 48000:
                        dtveVar.y("ALTER TABLE message_reactions ADD COLUMN reaction INTEGER;");
                        break;
                    case 59060:
                        dtveVar.y("ALTER TABLE message_reactions ADD COLUMN applied_reaction BLOB;");
                        break;
                    case 59520:
                        dtveVar.y("ALTER TABLE message_reactions ADD COLUMN animation_effect BLOB;");
                        dtveVar.y("CREATE INDEX index_message_reactions_animation_effect ON message_reactions(animation_effect) WHERE animation_effect NOT NULL;");
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
