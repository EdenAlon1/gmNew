package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqq implements fdqp {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        enip r = enip.r("MDI_SYNC_COMPONENTS_VERBOSE", "MDI_SYNC_COMPONENTS_GAIA");
        a = edbk.f("45410057", true, "com.google.android.libraries.mdi.sync", r, true, false, false);
        b = edbk.f("45633393", false, "com.google.android.libraries.mdi.sync", r, true, false, false);
        c = edbk.f("45408267", true, "com.google.android.libraries.mdi.sync", r, true, false, false);
    }

    @Override // defpackage.fdqp
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdqp
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdqp
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
