package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxiv extends dtup {
    public static final String[] a = {"remote_user_id_to_registration_id.remote_user_id", "remote_user_id_to_registration_id.tachyon_registration_id"};
    public static final enhk b = new enhd().c();
    public static final bxih c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("tachyon_registration_id", "index_remote_user_id_to_registration_id_tachyon_registration_id");
        enhdVar.c();
        c = new bxih();
        d = new int[]{45000};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static dtzf b() {
        return a().P();
    }

    public static void c(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("remote_user_id TEXT NOT NULL");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("tachyon_registration_id TEXT REFERENCES remote_registrations_table(tachyon_registration_id) ON DELETE NO ACTION ON UPDATE NO ACTION");
        sb.insert(0, "CREATE TABLE remote_user_id_to_registration_id (");
        sb.append(", PRIMARY KEY (remote_user_id,tachyon_registration_id));");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_remote_user_id_to_registration_id_tachyon_registration_id");
        arrayList.add("CREATE INDEX index_remote_user_id_to_registration_id_tachyon_registration_id ON remote_user_id_to_registration_id(tachyon_registration_id);");
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }
}
