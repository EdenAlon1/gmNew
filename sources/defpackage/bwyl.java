package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwyl implements fbba {
    public static dtux a() {
        return new dtuf(bwyj.c, "recent_expressive_stickers", new dtue() { // from class: bwyb
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bwyj.a;
                valueOf.getClass();
                if (i == 22050) {
                    bwyj.b(dtveVar, 22050);
                } else {
                    if (i != 58440) {
                        return;
                    }
                    dtveVar.y("DROP INDEX IF EXISTS index_recent_expressive_stickers_last_used_timestamp");
                    dtveVar.y("CREATE INDEX index_recent_expressive_stickers_last_used_timestamp ON recent_expressive_stickers(last_used_timestamp);");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
