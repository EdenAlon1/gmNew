package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avof implements fbba {
    public static dtux a() {
        return new dtuf(avod.c, "rcs_remote_capabilities_cache", new dtue() { // from class: avnu
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = avod.a;
                valueOf.getClass();
                if (i == 58110) {
                    avod.b(dtveVar, 58110);
                } else {
                    if (i != 58420) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_rcs_remote_capabilities_cache_msisdn");
                    dtveVar.y("CREATE INDEX index_rcs_remote_capabilities_cache_msisdn ON rcs_remote_capabilities_cache(msisdn);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
