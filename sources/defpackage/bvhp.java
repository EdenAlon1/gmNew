package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvhp implements fbba {
    public static dtux a() {
        return new dtuf(bvhn.d, "p2p_suggestions", new dtue() { // from class: bvha
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bvhn.a;
                valueOf.getClass();
                if (i == 42020) {
                    bvhn.d(dtveVar, 42020);
                    return;
                }
                if (i == 53080) {
                    dtveVar.y("ALTER TABLE p2p_suggestions ADD COLUMN consumption_state INTEGER DEFAULT(1);");
                } else {
                    if (i != 58510) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_p2p_suggestions_generated_timestamp");
                    dtveVar.y("CREATE INDEX index_p2p_suggestions_generated_timestamp ON p2p_suggestions(generated_timestamp);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
