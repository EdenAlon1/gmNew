package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwsq implements fbba {
    public static dtux a() {
        return new dtuf(bwso.c, "rbm_business_info", new dtue() { // from class: bwsg
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bwso.a;
                valueOf.getClass();
                if (i == 49030) {
                    bwso.g(dtveVar, 49030);
                } else {
                    if (i != 59140) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE rbm_business_info ADD COLUMN agent_use_case_category INT DEFAULT(0);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
