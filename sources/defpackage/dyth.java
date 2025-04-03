package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyth {
    private final ConcurrentMap a = new ConcurrentHashMap();
    private final Context b;

    public dyth(Context context) {
        this.b = context;
    }

    public final synchronized SharedPreferences a(dzja dzjaVar) {
        Long valueOf = Long.valueOf(dzjaVar.a());
        if (this.a.containsKey(valueOf)) {
            return (SharedPreferences) this.a.get(valueOf);
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences(String.format("lighter_messaging_prefs_%d.xml", valueOf), 0);
        return (SharedPreferences) emxc.i((SharedPreferences) this.a.putIfAbsent(valueOf, sharedPreferences)).e(sharedPreferences);
    }
}
