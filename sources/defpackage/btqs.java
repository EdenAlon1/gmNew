package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqs implements fbba {
    public static dtux a() {
        return new dtuf(btqq.d, "link_preview", new dtue() { // from class: btqh
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = btqq.a;
                valueOf.getClass();
                if (i == 21010) {
                    dtveVar.y("ALTER TABLE link_preview ADD COLUMN link_preview_prevented INTEGER DEFAULT(0);");
                } else {
                    if (i != 22020) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE link_preview ADD COLUMN link_preview_failed INTEGER DEFAULT(0);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
