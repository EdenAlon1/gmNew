package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Base64;
import com.google.android.ims.provisioning.config.WelcomeMessage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ctys extends ctyx {
    protected final Context a;

    public ctys(Context context) {
        this.a = context;
    }

    private final SharedPreferences t() {
        if (Looper.myLooper() == Looper.getMainLooper() && csix.b && !cfun.n()) {
            csix.c(a().concat(" reading from storage in UI thread at app start"));
        }
        return this.a.getSharedPreferences(a(), 0);
    }

    @Override // defpackage.ctyx
    public final int d(String str, int i) {
        b(str);
        return t().getInt(str, i);
    }

    @Override // defpackage.ctyx
    public final long e(String str, long j) {
        b(str);
        return t().getLong(str, j);
    }

    @Override // defpackage.ctyx
    public final String f(String str, String str2) {
        b(str);
        return t().getString(str, str2);
    }

    @Override // defpackage.ctyx
    public final void g(String str, boolean z) {
        b(str);
        t().edit().putBoolean(str, z).commit();
    }

    @Override // defpackage.ctyx
    public final void h(String str, boolean z) {
        b(str);
        t().edit().putBoolean(str, z).apply();
    }

    @Override // defpackage.ctyx
    public final void i(String str, byte[] bArr) {
        b(str);
        l(str, Base64.encodeToString(bArr, 0));
    }

    @Override // defpackage.ctyx
    public final void j(String str, int i) {
        b(str);
        t().edit().putInt(str, i).apply();
    }

    @Override // defpackage.ctyx
    public final void k(String str, long j) {
        b(str);
        t().edit().putLong(str, j).apply();
    }

    @Override // defpackage.ctyx
    public final void l(String str, String str2) {
        b(str);
        t().edit().putString(str, str2).apply();
    }

    @Override // defpackage.ctyx
    public final void m(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.getSharedPreferences(a(), 0).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.ctyx
    public final void n(String str) {
        b(str);
        t().edit().remove(str).apply();
    }

    @Override // defpackage.ctyx
    public final void o(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.getSharedPreferences(a(), 0).unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.ctyx
    public final boolean p(String str) {
        b(str);
        return t().contains(str);
    }

    @Override // defpackage.ctyx
    public final boolean q(String str, boolean z) {
        b(str);
        return t().getBoolean(str, z);
    }

    @Override // defpackage.ctyx
    public final byte[] r(String str) {
        b(str);
        String f = f(str, null);
        if (f == null) {
            return null;
        }
        return Base64.decode(f, 0);
    }

    @Override // defpackage.ctyx
    public final WelcomeMessage s() {
        SharedPreferences t = t();
        String string = t.getString("rcs_welcome_message_message", null);
        if (string == null) {
            return null;
        }
        b("rcs_welcome_message_title");
        b("rcs_welcome_message_message");
        b("rcs_welcome_message_accept");
        b("rcs_welcome_message_reject");
        b("rcs_welcome_message_settings");
        return new WelcomeMessage(string, emxe.b(t.getString("rcs_welcome_message_title", null)), t.getBoolean("rcs_welcome_message_accept", true), t.getBoolean("rcs_welcome_message_reject", false), t.getBoolean("rcs_welcome_message_settings", false));
    }

    protected void b(String str) {
    }
}
