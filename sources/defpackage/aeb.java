package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeb {
    public static final ResolveInfo a(Context context) {
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static final String b(aeg aegVar) {
        aegVar.getClass();
        if (aegVar instanceof aed) {
            return "image/*";
        }
        if (aegVar instanceof aef) {
            return "video/*";
        }
        if (aegVar instanceof aee) {
            throw null;
        }
        if (aegVar instanceof aec) {
            return null;
        }
        throw new ffcd();
    }

    public static final boolean c() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        return extensionVersion >= 2;
    }
}
