package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koc {
    public static Object a(Intent intent, String str, Class cls) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = intent.getParcelableExtra(str, cls);
            return parcelableExtra;
        }
        Parcelable parcelableExtra2 = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra2)) {
            return parcelableExtra2;
        }
        return null;
    }
}
