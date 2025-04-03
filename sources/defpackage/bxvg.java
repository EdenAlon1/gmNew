package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxvg implements fbba {
    public static dtux a() {
        return new dtuf(bxve.c, "self_profiles", new dtue() { // from class: bxuv
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxve.a;
                valueOf.getClass();
                if (i == 59920) {
                    bxve.e(dtveVar, 59920);
                } else {
                    if (i != 60400) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE self_profiles ADD COLUMN is_self_profile_shareable INT DEFAULT(1);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
