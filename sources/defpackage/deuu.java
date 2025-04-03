package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deuu extends devf {
    public static ContentResolver a;
    public final devd b = new devd(Uri.parse("content://com.google.android.rcs.service.preferences"), enpd.a);

    public static void a(Context context) {
        a = context.getContentResolver();
    }
}
