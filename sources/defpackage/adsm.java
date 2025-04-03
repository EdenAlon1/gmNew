package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsm implements adso {
    @Override // defpackage.adso
    public final void b(Activity activity) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:".concat(String.valueOf(activity.getPackageName()))));
        activity.startActivityForResult(intent, 301);
    }

    @Override // defpackage.adso
    public final /* synthetic */ void a(Activity activity) {
    }
}
