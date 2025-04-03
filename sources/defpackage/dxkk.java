package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxkk {
    public static dxkj a(Context context, dwxf dwxfVar) {
        try {
            return dxkj.a(context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", dxkj.NEW_FILE_KEY.d));
        } catch (IllegalArgumentException unused) {
            dwxfVar.a();
            b(context);
            return dxkj.USE_CHECKSUM_ONLY;
        }
    }

    public static void b(Context context) {
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
    }

    static boolean c(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean d(Context context, dxkj dxkjVar) {
        dxth.c("%s: Setting FileKeyVersion to %s", "Migrations", dxkjVar.name());
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", dxkjVar.d).commit();
    }

    public static void e(Context context) {
        dxth.c("%s: Setting migration to new file key to %s", "Migrations", true);
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }
}
