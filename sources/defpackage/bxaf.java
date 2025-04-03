package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxaf implements fbba {
    public static dtux a() {
        return new dtuf(bxad.c, "recent_gifs", new dtue() { // from class: bwzt
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxad.a;
                valueOf.getClass();
                if (i == 22010) {
                    bxad.b(dtveVar, 22010);
                } else {
                    if (i != 58520) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_recent_gifs_last_used_timestamp");
                    dtveVar.y("CREATE INDEX index_recent_gifs_last_used_timestamp ON recent_gifs(last_used_timestamp);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
