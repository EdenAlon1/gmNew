package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elbe implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ elbx a;
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener b;
    public final /* synthetic */ String c;

    public /* synthetic */ elbe(elbx elbxVar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        this.a = elbxVar;
        this.b = onSharedPreferenceChangeListener;
        this.c = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.b;
        if (ekyf.v()) {
            onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, str);
            return;
        }
        ekzm b = this.a.b(this.c);
        try {
            onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferences, str);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
