package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgs {
    public static final cfup a = cfvl.n(cfvl.b, "enable_simplified_messaging_v2_api", false);
    static final cfup b = cfvl.n(cfvl.b, "enable_simplified_messaging_notification_v2_api", false);
    private final Context c;

    public clgs(Context context) {
        this.c = context;
    }

    public final boolean a() {
        return ((Boolean) a.e()).booleanValue() && !dkuy.k(this.c);
    }
}
