package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvr implements fdvq {
    public static final edax a;
    public static final edax b;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.f("8", true, "com.google.android.libraries.surveys", enpdVar, true, false, false);
        b = edbk.f("5", true, "com.google.android.libraries.surveys", enpdVar, true, false, false);
    }

    @Override // defpackage.fdvq
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdvq
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }
}
