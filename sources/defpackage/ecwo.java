package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecwo implements ecux {
    public static final Map a = new cmh();
    public final SharedPreferences b;
    public SharedPreferences.OnSharedPreferenceChangeListener c;
    public volatile Map e;
    public final Object d = new Object();
    public final List f = new ArrayList();

    public ecwo(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
    }

    static synchronized void b() {
        synchronized (ecwo.class) {
            for (ecwo ecwoVar : a.values()) {
                SharedPreferences sharedPreferences = ecwoVar.b;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = ecwoVar.c;
                onSharedPreferenceChangeListener.getClass();
                sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
            a.clear();
        }
    }

    @Override // defpackage.ecux
    public final Object a(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.b.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
