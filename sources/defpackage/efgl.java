package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgl {
    private final SharedPreferences a;
    private final Set b;

    public efgl(SharedPreferences sharedPreferences, Set set) {
        this.a = sharedPreferences;
        this.b = set;
    }

    private final void d(String str) {
        Set set = this.b;
        if (set != null) {
            emxf.f(set.contains(str), "Can't access key outside migration: %s", str);
        }
    }

    public final long a(String str, long j) {
        d(str);
        return this.a.getLong(str, j);
    }

    public final enhk b() {
        emxf.b(this.b == null, "SharedPreferencesView#getAll() not available on key migration");
        return enhk.j(this.a.getAll());
    }

    public final boolean c(String str, boolean z) {
        d(str);
        return this.a.getBoolean(str, z);
    }
}
