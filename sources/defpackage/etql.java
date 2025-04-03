package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etql {
    public static final Object a = new Object();
    public static final String b = "etql";
    private final etgb c;

    public etql(etqk etqkVar) {
        Context context = etqkVar.a;
        String str = etqkVar.b;
        String str2 = etqkVar.c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.c = etqkVar.f;
    }

    public final synchronized etga a() {
        return this.c.a();
    }
}
