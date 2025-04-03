package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxbc implements fbba {
    public static dtux a() {
        return new dtuf(bxba.c, "recent_stickers", new dtue() { // from class: bxax
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxba.a;
                valueOf.getClass();
                if (i != 4010) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("last_used_timestamp INT DEFAULT(0)");
                sb.insert(0, "CREATE TABLE recent_stickers (");
                sb.append(", UNIQUE(sticker_id) ON CONFLICT FAIL);");
                dtveVar.y(sb.toString());
                for (String str : (String[]) new ArrayList().toArray(new String[0])) {
                    dtveVar.y(str);
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
