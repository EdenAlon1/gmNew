package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ia {
    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(ia.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
