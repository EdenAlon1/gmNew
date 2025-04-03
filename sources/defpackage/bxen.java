package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxen extends dtup {
    public static final String[] a = {"remote_instances._id", "remote_instances.remote_instance_id", "remote_instances.etouffee", "remote_instances.tachyon_id", "remote_instances.last_modified_timestamp", "remote_instances.identity_key", "remote_instances.updated_at_hash", "remote_instances.guaranteed_fresh_as_of_timestamp", "remote_instances.is_updated_at_hash_valid"};
    public static final bxds b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("remote_instances.last_modified_timestamp", 35040);
        enhdVar.k("remote_instances.identity_key", 38010);
        enhdVar.k("remote_instances.updated_at_hash", 39040);
        enhdVar.k("remote_instances.guaranteed_fresh_as_of_timestamp", 40010);
        enhdVar.k("remote_instances.is_updated_at_hash_valid", 40030);
        enhdVar.c();
        new enhd().c();
        b = new bxds();
        c = new int[]{34010, 35040, 38010, 39040, 40010, 40030};
    }

    public static final bxek a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("remote_instances._id");
            engrVar.h("remote_instances.remote_instance_id");
            engrVar.h("remote_instances.etouffee");
            engrVar.h("remote_instances.tachyon_id");
            if (c2.intValue() >= 35040) {
                engrVar.h("remote_instances.last_modified_timestamp");
            }
            if (c2.intValue() >= 38010) {
                engrVar.h("remote_instances.identity_key");
            }
            if (c2.intValue() >= 39040) {
                engrVar.h("remote_instances.updated_at_hash");
            }
            if (c2.intValue() >= 40010) {
                engrVar.h("remote_instances.guaranteed_fresh_as_of_timestamp");
            }
            if (c2.intValue() >= 40030) {
                engrVar.h("remote_instances.is_updated_at_hash_valid");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bxek(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(e().a());
    }

    public static void d(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_instance_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("etouffee INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachyon_id TEXT");
        if (i >= 35040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 38010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("identity_key BLOB");
        }
        if (i >= 39040) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("updated_at_hash INTEGER DEFAULT(0)");
        }
        if (i >= 40010) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("guaranteed_fresh_as_of_timestamp INTEGER DEFAULT(0)");
        }
        if (i >= 40030) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("is_updated_at_hash_valid INTEGER DEFAULT(0)");
        }
        sb.insert(0, "CREATE TABLE remote_instances (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf e() {
        return b().P();
    }
}
