package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcfa extends dtup {
    public static final String[] a = {"backup_metadata.created_timestamp", "backup_metadata.schema_version", "backup_metadata.backup_id"};
    public static final bcel b;
    public static final int[] c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("backup_metadata.created_timestamp", 0);
        enhdVar.k("backup_metadata.schema_version", 0);
        enhdVar.k("backup_metadata.backup_id", 0);
        enhdVar.c();
        new enhd().c();
        b = new bcel();
        c = new int[]{0};
    }

    public static final bcex a() {
        String[] strArr;
        Integer c2 = c();
        if (c2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            if (c2.intValue() >= 0) {
                engrVar.h("backup_metadata.created_timestamp");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("backup_metadata.schema_version");
            }
            if (c2.intValue() >= 0) {
                engrVar.h("backup_metadata.backup_id");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bcex(strArr);
    }

    public static dtve b() {
        return dtub.e("backup");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dtzf d() {
        return b().P();
    }
}
