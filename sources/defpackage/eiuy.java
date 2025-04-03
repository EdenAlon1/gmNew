package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiuy {
    public static final enru a = enru.c("com/google/apps/tiktok/account/api/controller/AccountIntents");

    static boolean a(Intent intent) {
        return intent.hasExtra("$tiktok$for_requirement_activity");
    }

    static void b(Intent intent) {
        intent.putExtra("$tiktok$for_requirement_activity", true);
    }

    public static void c(Intent intent, eisx eisxVar) {
        emxf.a(eisxVar.a() != -1);
        intent.putExtra("account_id", eisxVar.a());
        intent.putExtra("$tiktok$account_id_owned", true);
    }

    public static boolean d(Intent intent) {
        return intent.hasExtra("account_id");
    }
}
