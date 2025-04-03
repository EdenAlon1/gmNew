package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdun implements fdum {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.e("7", "SURVEYS", "com.google.android.libraries.surveys", enpdVar, true, false, false);
        b = edbk.f("9", false, "com.google.android.libraries.surveys", enpdVar, true, false, false);
        c = edbk.f("6", true, "com.google.android.libraries.surveys", enpdVar, true, false, false);
    }

    @Override // defpackage.fdum
    public final String a(Context context) {
        return (String) a.a(context);
    }

    @Override // defpackage.fdum
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdum
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
