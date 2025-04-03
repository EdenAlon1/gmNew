package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgef {
    static boolean a(Context context) {
        return context.getPackageManager().resolveActivity(new Intent("com.google.android.apps.tachyon.action.CALL").setData(Uri.parse(String.format("%s:%s", "tel", "+14255555555"))).setPackage("com.google.android.apps.tachyon"), 65536) != null;
    }
}
