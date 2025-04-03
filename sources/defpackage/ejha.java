package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejha {
    static Intent a(eixn eixnVar, int i) {
        return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", eixnVar.b().g).putExtra("extra.screenId", i);
    }

    static void b(Activity activity, String str) {
        Uri parse = Uri.parse(str);
        String packageName = activity.getPackageName();
        try {
            try {
                afg afgVar = new afg();
                afgVar.f(activity.getColor(R.color.google_grey200));
                afh a = afgVar.a();
                a.a.putExtra("android.intent.extra.REFERRER", Uri.parse(a.t(packageName, "android-app://")));
                a.a(activity, parse);
            } catch (ActivityNotFoundException unused) {
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.putExtra("com.android.browser.application_id", packageName);
                activity.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused2) {
        }
    }
}
