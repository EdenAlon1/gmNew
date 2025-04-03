package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvn {
    public static Pair a(ewwx ewwxVar) {
        if (ewwxVar.b == null) {
            return null;
        }
        Intent intent = (Intent) ewwxVar.c.getParcelable("action-intent");
        ComponentName component = (intent != null ? new Intent(intent) : null).getComponent();
        return new Pair(ewwxVar.b.b.toString(), component != null ? component.getPackageName() : null);
    }

    public static String b(ParcelFileDescriptor parcelFileDescriptor) {
        return ((Uri) efca.a(parcelFileDescriptor).first).toString();
    }
}
