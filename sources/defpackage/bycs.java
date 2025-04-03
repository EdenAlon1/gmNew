package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bycs implements fbba {
    public static dtux a() {
        return new dtuf(bycq.c, "stickers_localization", new dtue() { // from class: bycn
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bycq.a;
                valueOf.getClass();
                if (i != 13010) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_set_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("locale TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("display_name TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("sticker_local_id INTEGER");
                sb.insert(0, "CREATE TABLE stickers_localization (");
                sb.append(", FOREIGN KEY (sticker_set_id) REFERENCES sticker_sets (sticker_set_id) ON DELETE SET DEFAULT FOREIGN KEY (sticker_local_id) REFERENCES sticker_sets (_id) ON DELETE CASCADE PRIMARY KEY (sticker_set_id,sticker_id,locale));");
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
