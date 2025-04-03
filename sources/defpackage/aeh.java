package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeh extends adu {
    @Override // defpackage.adu
    public final /* synthetic */ Intent a(Context context, Object obj) {
        ads adsVar = (ads) obj;
        adsVar.getClass();
        if (aeb.c()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aeb.b(adsVar.a));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (aeb.a(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aeb.b(adsVar.a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo a = aeb.a(context);
        if (a == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = a.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(aeb.b(adsVar.a));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) ffdx.M(adx.a(intent)) : data;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ adt c(Context context, Object obj) {
        ((ads) obj).getClass();
        return null;
    }
}
