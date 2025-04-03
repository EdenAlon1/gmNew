package defpackage;

import android.content.SharedPreferences;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alzi implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final ctbl a;
    private final enip b;

    public alzi(enip enipVar, ctbl ctblVar) {
        this.b = enipVar;
        this.a = ctblVar;
    }

    final void a() {
        this.a.c(new Supplier() { // from class: alzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "Notify configuration callbacks");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.b.contains(str)) {
            a();
        }
    }
}
