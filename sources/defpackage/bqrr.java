package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqrr implements fbba {
    public static dtux a() {
        return new dtuf(bqrp.c, "cms_notifications", new dtue() { // from class: bqrj
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bqrp.a;
                valueOf.getClass();
                if (i == 38000) {
                    bqrp.d(dtveVar, 38000);
                } else {
                    if (i != 46040) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE cms_notifications ADD COLUMN message_received_timestamp INTEGER DEFAULT(0);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
