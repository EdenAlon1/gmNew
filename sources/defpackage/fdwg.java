package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdwg implements fdwf {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.e("20", "com.google.android.surveys.testapp,com.google.android.tvrecommendations,com.google.android.apps.tv.launcherx", "com.google.android.libraries.surveys", enpdVar, true, false, false);
        b = edbk.f("18", false, "com.google.android.libraries.surveys", enpdVar, true, false, false);
        c = edbk.f("22", true, "com.google.android.libraries.surveys", enpdVar, true, false, false);
        d = edbk.f("21", false, "com.google.android.libraries.surveys", enpdVar, true, false, false);
    }

    @Override // defpackage.fdwf
    public final String a(Context context) {
        return (String) a.a(context);
    }

    @Override // defpackage.fdwf
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdwf
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }

    @Override // defpackage.fdwf
    public final boolean d(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }
}
