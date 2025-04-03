package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwwa implements fbba {
    public static dtux a() {
        return new dtuf(bwvy.d, "read_reports", new dtue() { // from class: bwvq
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bwvy.a;
                valueOf.getClass();
                if (i == 10008) {
                    bwvy.e(dtveVar, 10008);
                } else {
                    if (i != 58880) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE read_reports ADD COLUMN ftd_time INTEGER DEFAULT(-1);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
