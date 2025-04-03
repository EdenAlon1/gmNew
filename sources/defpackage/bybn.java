package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bybn implements fbba {
    public static dtux a() {
        return new dtuf(bybl.c, "sticker_sets", new dtue() { // from class: bybi
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bybl.a;
                valueOf.getClass();
                if (i != 5000) {
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
                sb.append("sticker_set_id TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("local_version INT DEFAULT(-1)");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("download_state INT DEFAULT(4)");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("icon_uri TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("display_name TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("preview_image_uri TEXT");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("requested_timestamp INT DEFAULT(-1)");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("display_order INT DEFAULT(0)");
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("author TEXT");
                sb.insert(0, "CREATE TABLE sticker_sets (");
                sb.append(", UNIQUE(sticker_set_id) ON CONFLICT FAIL);");
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
