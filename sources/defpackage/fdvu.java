package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvu implements fdvt {
    public static final edax a;
    public static final edax b;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.f("12", true, "com.google.android.libraries.surveys", enpdVar, true, false, false);
        b = edbk.f("11", true, "com.google.android.libraries.surveys", enpdVar, true, false, false);
    }

    @Override // defpackage.fdvt
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdvt
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }
}
