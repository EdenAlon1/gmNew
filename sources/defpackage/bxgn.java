package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgn implements fbba {
    public static dtux a() {
        return new dtuf(bxgl.c, "remote_registrations_table", new dtue() { // from class: bxgd
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxgl.a;
                valueOf.getClass();
                if (i == 45000) {
                    bxgl.d(dtveVar, 45000);
                } else if (i == 46000) {
                    dtveVar.y("ALTER TABLE remote_registrations_table ADD COLUMN better_etouffee INT DEFAULT(0);");
                } else {
                    if (i != 58800) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE remote_registrations_table ADD COLUMN messages_feature_hash INTEGER DEFAULT(0);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
