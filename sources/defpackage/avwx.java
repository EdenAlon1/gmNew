package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avwx {
    private final Context a;

    public avwx(Context context) {
        this.a = context;
    }

    private static String b(String str) {
        return emxe.b(str).replace(' ', '_');
    }

    public final String a() {
        return String.format("%s %s/%s-%s %s/%s", "IM-client/OMA1.0", b(Build.MANUFACTURER), b(Build.MODEL), b(Build.VERSION.RELEASE), b("Goog"), b(cvdd.a(this.a).a));
    }
}
